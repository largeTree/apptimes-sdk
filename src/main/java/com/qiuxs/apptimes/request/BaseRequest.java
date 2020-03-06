package com.qiuxs.apptimes.request;

import java.io.Serializable;

import com.qiuxs.apptimes.response.BaseResponse;

/**
 * 
 * 功能描述: 请求基类<br/>  
 * 新增原因: <br/>  
 * 新增日期: 2020年3月1日 下午8:32:52 <br/>  
 *  
 * @author qiuxs   
 * @version 1.0.0
 */
public class BaseRequest<R extends BaseResponse> implements Serializable {

	private static final long serialVersionUID = 9205975344877074108L;

	/** appKey */
	private String appkey;
	/** appSecret */
	private String appsecret;

	public String getAppkey() {
		return appkey;
	}

	public void setAppkey(String appkey) {
		this.appkey = appkey;
	}

	public String getAppsecret() {
		return appsecret;
	}

	public void setAppsecret(String appsecret) {
		this.appsecret = appsecret;
	}

}
