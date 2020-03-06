package com.qiuxs.apptimes.config;

import com.qiuxs.cuteframework.core.basic.config.UConfigUtils;
import com.qiuxs.cuteframework.core.basic.utils.StringUtils;

/**
 * 
 * 功能描述: 基于Uconfig的apptimes客户端配置类实现<br/>  
 * 新增原因: TODO<br/>  
 * 新增日期: 2020年3月1日 下午10:18:47 <br/>  
 *  
 * @author qiuxs   
 * @version 1.0.0
 */
public class UConfigClientConfig implements IApptimesClientConfig {

	private static final long serialVersionUID = -7106509858160093235L;
	
	private final String configDomain;
	
	public UConfigClientConfig(String configDomain) {
		this.configDomain = configDomain;
	}

	@Override
	public String getUrl() {
		return UConfigUtils.getDomain(this.configDomain).getString("url");
	}

	@Override
	public String getAppKey() {
		return UConfigUtils.getDomain(this.configDomain).getString("appKey");
	}

	@Override
	public String getAppSecret() {
		return UConfigUtils.getDomain(this.configDomain).getString("appSecret");
	}
	
	@Override
	public String getDefaultParams(String apiField) {
		return UConfigUtils.getDomain(this.configDomain).getString(StringUtils.append("default.", apiField));
	}

}
