package com.qiuxs.apptimes.response;

/**
 * The Class PublisherTokenGetResponse.
 */
public class PublisherTokenGetResponse extends BaseResponse<PublisherTokenGetResponse.Data> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 5236620593970446867L;

	public static class Data {
		/**  用户授权url. */
		private String url;

		/**  授权淘口令. */
		private String token;

		/**
		 * Gets the 用户授权url.
		 *
		 * @return the 用户授权url
		 */
		public String getUrl() {
			return url;
		}

		/**
		 * Sets the 用户授权url.
		 *
		 * @param url the new 用户授权url
		 */
		public void setUrl(String url) {
			this.url = url;
		}

		/**
		 * Gets the 授权淘口令.
		 *
		 * @return the 授权淘口令
		 */
		public String getToken() {
			return token;
		}

		/**
		 * Sets the 授权淘口令.
		 *
		 * @param token the new 授权淘口令
		 */
		public void setToken(String token) {
			this.token = token;
		}
	}

}
