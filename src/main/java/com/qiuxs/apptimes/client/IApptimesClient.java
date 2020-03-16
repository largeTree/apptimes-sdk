package com.qiuxs.apptimes.client;

import com.qiuxs.apptimes.request.BaseRequest;
import com.qiuxs.apptimes.response.BaseResponse;

/**
 * 
 * 功能描述: 接口调用客户端工具<br/>  
 * 新增原因: TODO<br/>  
 * 新增日期: 2020年3月1日 下午7:14:57 <br/>  
 *  
 * @author qiuxs   
 * @version 1.0.0
 */
public interface IApptimesClient {

	/**
	 * 执行请求
	 *  
	 * @author qiuxs  
	 * @param <P>
	 * @param <R>
	 * @param request
	 * @return
	 */
	public <REQ extends BaseRequest<RES>, RES extends BaseResponse> RES execute(REQ req);

}
