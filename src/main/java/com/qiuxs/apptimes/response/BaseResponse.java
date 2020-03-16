package com.qiuxs.apptimes.response;

import java.io.Serializable;

/**
 * 响应基类
 * 功能描述: <br/>  
 * 新增原因: TODO<br/>  
 * 新增日期: 2020年3月1日 下午8:25:26 <br/>  
 *  
 * @author qiuxs   
 * @version 1.0.0
 */
public class BaseResponse implements Serializable {

	private static final long serialVersionUID = 2181999160084389994L;

	/** 状态码 */
	private int errcode;
	/** 状态信息 */
	private String errmsg;
	
	public int getErrcode() {
		return errcode;
	}

	public void setErrcode(int errcode) {
		this.errcode = errcode;
	}

	public String getErrmsg() {
		return errmsg;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
}
