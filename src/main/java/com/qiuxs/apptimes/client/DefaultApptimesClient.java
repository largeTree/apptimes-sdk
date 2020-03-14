package com.qiuxs.apptimes.client;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.alibaba.fastjson.JSONObject;
import com.qiuxs.apptimes.config.IApptimesClientConfig;
import com.qiuxs.apptimes.request.BaseRequest;
import com.qiuxs.apptimes.request.anno.ApiField;
import com.qiuxs.apptimes.request.anno.ApptimesApi;
import com.qiuxs.apptimes.response.BaseResponse;
import com.qiuxs.cuteframework.core.basic.utils.DateFormatUtils;
import com.qiuxs.cuteframework.core.basic.utils.JsonUtils;
import com.qiuxs.cuteframework.core.basic.utils.StringUtils;
import com.qiuxs.cuteframework.core.basic.utils.generator.RandomGenerator;
import com.qiuxs.cuteframework.core.basic.utils.http.HttpClientUtil;
import com.qiuxs.cuteframework.core.basic.utils.reflect.FieldUtils;
import com.qiuxs.cuteframework.core.basic.utils.reflect.ReflectUtils;

/**
 * 
 * 功能描述: 默认客户端工具实现<br/>  
 * 新增原因: TODO<br/>  
 * 新增日期: 2020年3月1日 下午8:35:06 <br/>  
 *  
 * @author qiuxs   
 * @version 1.0.0
 */
public class DefaultApptimesClient implements IApptimesClient {

	private static Logger log = LogManager.getLogger(DefaultApptimesClient.class);

	private final IApptimesClientConfig config;

	public DefaultApptimesClient(IApptimesClientConfig config) {
		this.config = config;
	}

	@Override
	public <REQ extends BaseRequest<RES>, RES extends BaseResponse<?>> RES execute(REQ request) {
		if (request == null) {
			throw new ApptimesApiException(0, "Request is null");
		}

		// 请求初始化
		this.initRequest(request);

		// 转为map参数
		Map<String, String> params = this.parseRequest(request);

		// 构造地址
		String finalUrl = this.buildFinalUrl(request);
		
		// 请求id方便串联日志
		String requestId = RandomGenerator.getRandomStr(6);
		
		log.info(StringUtils.append("requestId = ", requestId, ", Call Apptimes Api url = ", finalUrl, ", params = ", params.toString()));
		
		long startNano = System.nanoTime();
		// 返回结果
		JSONObject res = HttpClientUtil.doPostRetJson(finalUrl, params, false);
		log.info(StringUtils.append("requestId = ", requestId, ", Call apptimes finished, costMs = ", ((System.nanoTime() - startNano) / 1000000), ", res = ", res.toJSONString()));
		
		// 结果检查
		this.checkSuccess(res);

		// 转为指定类型返回
		return JsonUtils.parseObject(res, ReflectUtils.getSuperClassGenricType(request.getClass(), 0));
	}
	
	/**
	 * 解析参数
	 *  
	 * @author qiuxs  
	 * @param req
	 * @return
	 */
	private Map<String, String> parseRequest(BaseRequest<?> req) {
		List<Field> fields = FieldUtils.getDeclaredFieldsNoDup(req.getClass());
		Map<String, String> params = new HashMap<String, String>();
		for (Field f : fields) {
			if (Modifier.isStatic(f.getModifiers())) {
				continue;
			}
			FieldUtils.makeAccessible(f);
			ApiField apiField = f.getAnnotation(ApiField.class);
			String fieldName = f.getName();
			if (apiField != null) {
				fieldName = apiField.value();
			}
			try {
				Object val = f.get(req);
				if (val == null) {
					val = this.getDefaultVal(fieldName);
				}
				if (val != null) {
					params.put(fieldName, this.formatVal(apiField, val));
				}
			} catch (ReflectiveOperationException e) {
				log.warn("get Request Field val failed, ext = " + e.getLocalizedMessage(), e);
			}
		}
		return params;
	}
	
	/**
	 * 格式化参数值
	 *  
	 * @author qiuxs  
	 * @param apiField
	 * @param val
	 * @return
	 */
	private String formatVal(ApiField apiField, Object val) {
		if (val instanceof Date) {
			return DateFormatUtils.format((Date) val, apiField.format());
		}
		return String.valueOf(val);
	}

	/***
	 * 获取默认参数值
	 *  
	 * @author qiuxs  
	 * @param fieldName
	 * @return
	 */
	private Object getDefaultVal(String fieldName) {
		return this.config.getDefaultParams(fieldName);
	}

	/**
	 * 初始化请求
	 *  
	 * @author qiuxs  
	 * @param request
	 */
	protected void initRequest(BaseRequest<?> request) {
		if (StringUtils.isBlank(request.getAppkey())) {
			request.setAppkey(this.config.getAppKey());
		}
		if (StringUtils.isBlank(request.getAppsecret())) {
			request.setAppsecret(this.config.getAppSecret());
		}
	}

	/**
	 * 构建最终地址
	 *  
	 * @author qiuxs  
	 * @param request
	 * @return 
	 */
	private String buildFinalUrl(BaseRequest<?> request) {
		// api定义
		ApptimesApi apptimesApi = request.getClass().getAnnotation(ApptimesApi.class);
		String path = apptimesApi.value();
		if (!path.startsWith("/")) {
			path = StringUtils.append("/", path);
		}
		return StringUtils.append(this.config.getUrl(), path);
	}

	private void checkSuccess(JSONObject res) {
		int errorCode = res.getIntValue("errcode");
		if (errorCode != 0) {
			throw new ApptimesApiException(errorCode, res.getString("errmsg"));
		}
	}

}
