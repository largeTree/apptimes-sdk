package com.qiuxs.apptimes.tb.response;

import java.io.Serializable;

import com.qiuxs.apptimes.base.response.BaseResponse;

/**
 * The Class TaoPasswordCreateResponse.
 */
public class TaoPasswordCreateResponse extends BaseResponse {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -8371358785856758128L;

	/**  数据内容. */
	private Data data;

	/**
	 * Gets the 数据内容.
	 *
	 * @return the 数据内容
	 */
	public Data getData() {
		return data;
	}

	/**
	 * Sets the 数据内容.
	 *
	 * @param data the new 数据内容
	 */
	public void setData(Data data) {
		this.data = data;
	}

	/**
	 * The Class Data.
	 */
	public static class Data implements Serializable {

		/** The Constant serialVersionUID. */
		private static final long serialVersionUID = -1419801830031381354L;

		/**  淘口令. */
		private String password;

		/**  创建时间. */
		private Long createTime;

		/**  有效期. */
		private Long validDate;

		/** The switch new wx. */
		private boolean switchNewWx;

		/**  长连接. */
		private String longUrl;

		/**  内容. */
		private String content;

		/**  短链接. */
		private String url;

		/**
		 * Gets the 淘口令.
		 *
		 * @return the 淘口令
		 */
		public String getPassword() {
			return password;
		}

		/**
		 * Sets the 淘口令.
		 *
		 * @param password the new 淘口令
		 */
		public void setPassword(String password) {
			this.password = password;
		}

		/**
		 * Gets the 创建时间.
		 *
		 * @return the 创建时间
		 */
		public Long getCreateTime() {
			return createTime;
		}

		/**
		 * Sets the 创建时间.
		 *
		 * @param createTime the new 创建时间
		 */
		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		/**
		 * Gets the 有效期.
		 *
		 * @return the 有效期
		 */
		public Long getValidDate() {
			return validDate;
		}

		/**
		 * Sets the 有效期.
		 *
		 * @param validDate the new 有效期
		 */
		public void setValidDate(Long validDate) {
			this.validDate = validDate;
		}

		/**
		 * Checks if is switch new wx.
		 *
		 * @return true, if is switch new wx
		 */
		public boolean isSwitchNewWx() {
			return switchNewWx;
		}

		/**
		 * Sets the switch new wx.
		 *
		 * @param switchNewWx the new switch new wx
		 */
		public void setSwitchNewWx(boolean switchNewWx) {
			this.switchNewWx = switchNewWx;
		}

		/**
		 * Gets the 长连接.
		 *
		 * @return the 长连接
		 */
		public String getLongUrl() {
			return longUrl;
		}

		/**
		 * Sets the 长连接.
		 *
		 * @param longUrl the new 长连接
		 */
		public void setLongUrl(String longUrl) {
			this.longUrl = longUrl;
		}

		/**
		 * Gets the 内容.
		 *
		 * @return the 内容
		 */
		public String getContent() {
			return content;
		}

		/**
		 * Sets the 内容.
		 *
		 * @param content the new 内容
		 */
		public void setContent(String content) {
			this.content = content;
		}

		/**
		 * Gets the 短链接.
		 *
		 * @return the 短链接
		 */
		public String getUrl() {
			return url;
		}

		/**
		 * Sets the 短链接.
		 *
		 * @param url the new 短链接
		 */
		public void setUrl(String url) {
			this.url = url;
		}

	}

}
