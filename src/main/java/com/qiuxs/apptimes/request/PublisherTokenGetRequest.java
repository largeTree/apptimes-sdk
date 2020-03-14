package com.qiuxs.apptimes.request;

import com.qiuxs.apptimes.request.anno.ApptimesApi;
import com.qiuxs.apptimes.response.PublisherTokenGetResponse;

/**
 * The Class PublisherTokenGetRequest.
 */
@ApptimesApi("publisher/token-get")
public class PublisherTokenGetRequest extends BaseRequest<PublisherTokenGetResponse> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -8873529012486104593L;

	/**  用户授权后会原样返回. */
	private String state;
	
	/**  回调地址. */
	private String callbackUrl;
	
	/**
	 * Gets the 用户授权后会原样返回.
	 *
	 * @return the 用户授权后会原样返回
	 */
	public String getState() {
		return state;
	}

	/**
	 * Sets the 用户授权后会原样返回.
	 *
	 * @param state the new 用户授权后会原样返回
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Gets the 回调地址.
	 *
	 * @return the 回调地址
	 */
	public String getCallbackUrl() {
		return callbackUrl;
	}

	/**
	 * Sets the 回调地址.
	 *
	 * @param callbackUrl the new 回调地址
	 */
	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

}
