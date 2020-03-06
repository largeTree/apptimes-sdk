package com.qiuxs.apptimes.client;

import com.qiuxs.cuteframework.core.basic.utils.StringUtils;

/**
 * 
 * 功能描述: api调用异常类<br/>  
 * 新增原因: TODO<br/>  
 * 新增日期: 2020年3月1日 下午9:46:06 <br/>  
 *  
 * @author qiuxs   
 * @version 1.0.0
 */
public class ApptimesApiException extends RuntimeException {

	private static final long serialVersionUID = -6787025669989695339L;

	private int errorCode;

	public ApptimesApiException(int errorCode, String msg) {
		super(msg);
	}

	public ApptimesApiException(String msg, Throwable cause) {
		super(msg, cause);
	}

	@Override
	public String getLocalizedMessage() {
		return StringUtils.append("code:", this.errorCode, ", ", super.getLocalizedMessage());
	}

}
