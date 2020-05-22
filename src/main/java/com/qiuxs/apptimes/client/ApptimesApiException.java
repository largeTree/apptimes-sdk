package com.qiuxs.apptimes.client;

import com.qiuxs.cuteframework.core.basic.code.annotation.Code;
import com.qiuxs.cuteframework.core.basic.code.annotation.CodeDomain;
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
	
	@CodeDomain
	public static final String DOMAIN_ERROR_CODE = "apptimes.errorCode";
	@Code(domain = DOMAIN_ERROR_CODE, caption = "口令不存在")
	public static final int CODE_TOKEN_NOT_EXISTS = 400;
	@Code(domain = DOMAIN_ERROR_CODE, caption = "非淘客商品")
	public static final int CODE_NOT_TK_ITEM = 401;

	private final int errorCode;

	public ApptimesApiException(int errorCode, String msg) {
		super(msg);
		this.errorCode = errorCode;
	}

	public ApptimesApiException(String msg, Throwable cause) {
		super(msg, cause);
		this.errorCode = -1;
	}
	
	public int getErrorCode() {
		return this.errorCode;
	};
	

	@Override
	public String getLocalizedMessage() {
		return StringUtils.append("code:", this.errorCode, ", ", super.getLocalizedMessage());
	}

}
