package com.qiuxs.apptimes.tb.request;

import com.qiuxs.apptimes.base.request.BaseRequest;
import com.qiuxs.apptimes.base.request.anno.ApiField;
import com.qiuxs.apptimes.base.request.anno.ApptimesApi;
import com.qiuxs.apptimes.tb.response.TaoPasswordCreateResponse;

/**
 * 淘系淘口令
 * 功能描述: <br/>  
 * 新增原因: TODO<br/>  
 * 新增日期: 2020年3月21日 下午11:17:34 <br/>  
 *  
 * @author qiuxs   
 * @version 1.0.0
 */
@ApptimesApi("tao-password/create")
public class TaoPasswordCreateRequest extends BaseRequest<TaoPasswordCreateResponse> {

	private static final long serialVersionUID = 4370155203019455543L;

	/** 淘口令标题 */
	private String text;
	/** 淘口令目标url */
	private String url;
	/** 淘口令logo地址 */
	@ApiField("pic_url")
	private String picUrl;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

}
