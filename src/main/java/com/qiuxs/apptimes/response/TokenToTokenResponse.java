package com.qiuxs.apptimes.response;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 口令转口令响应数据
 * The Class TokenToTokenResponse.
 */
public class TokenToTokenResponse extends BaseResponse {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1791937924178616438L;

	/**  返回数据. */
	private Data data;

	/**
	 * Gets the 返回数据.
	 *
	 * @return the 返回数据
	 */
	public Data getData() {
		return data;
	}

	/**
	 * Sets the 返回数据.
	 *
	 * @param data the new 返回数据
	 */
	public void setData(Data data) {
		this.data = data;
	}

	/**
	 * The Class Data.
	 */
	public static class Data implements Serializable {

		/**    serialVersionUID:TODO. */
		private static final long serialVersionUID = -5302696260314677496L;

		/**  商品ID. */
		private String goodId;
		
		/**  商品标题. */
		private String goodTitle;
		
		/**  商品主图. */
		private String goodPic;
		
		/**  原价. */
		private BigDecimal originPrice;
		
		/**  券价值. */
		private BigDecimal quanPrice;
		
		/**  现价，券后价. */
		private BigDecimal currentPrice;
		
		/**  佣金比例. */
		private BigDecimal commission;
		
		/**  佣金比例. */
		private BigDecimal commissionRate;
		
		/**  券地址. */
		private String ulandUrl;
		
		/**  新口令. */
		private String token;

		/**
		 * Gets the 商品ID.
		 *
		 * @return the 商品ID
		 */
		public String getGoodId() {
			return goodId;
		}

		/**
		 * Sets the 商品ID.
		 *
		 * @param goodId the new 商品ID
		 */
		public void setGoodId(String goodId) {
			this.goodId = goodId;
		}

		/**
		 * Gets the 商品标题.
		 *
		 * @return the 商品标题
		 */
		public String getGoodTitle() {
			return goodTitle;
		}

		/**
		 * Sets the 商品标题.
		 *
		 * @param goodTitle the new 商品标题
		 */
		public void setGoodTitle(String goodTitle) {
			this.goodTitle = goodTitle;
		}

		/**
		 * Gets the 商品主图.
		 *
		 * @return the 商品主图
		 */
		public String getGoodPic() {
			return goodPic;
		}

		/**
		 * Sets the 商品主图.
		 *
		 * @param goodPic the new 商品主图
		 */
		public void setGoodPic(String goodPic) {
			this.goodPic = goodPic;
		}

		/**
		 * Gets the 原价.
		 *
		 * @return the 原价
		 */
		public BigDecimal getOriginPrice() {
			return originPrice;
		}

		/**
		 * Sets the 原价.
		 *
		 * @param originPrice the new 原价
		 */
		public void setOriginPrice(BigDecimal originPrice) {
			this.originPrice = originPrice;
		}

		/**
		 * Gets the 券价值.
		 *
		 * @return the 券价值
		 */
		public BigDecimal getQuanPrice() {
			return quanPrice;
		}

		/**
		 * Sets the 券价值.
		 *
		 * @param quanPrice the new 券价值
		 */
		public void setQuanPrice(BigDecimal quanPrice) {
			this.quanPrice = quanPrice;
		}

		/**
		 * Gets the 现价，券后价.
		 *
		 * @return the 现价，券后价
		 */
		public BigDecimal getCurrentPrice() {
			return currentPrice;
		}

		/**
		 * Sets the 现价，券后价.
		 *
		 * @param currentPrice the new 现价，券后价
		 */
		public void setCurrentPrice(BigDecimal currentPrice) {
			this.currentPrice = currentPrice;
		}

		/**
		 * Gets the 佣金比例.
		 *
		 * @return the 佣金比例
		 */
		public BigDecimal getCommission() {
			return commission;
		}

		/**
		 * Sets the 佣金比例.
		 *
		 * @param commission the new 佣金比例
		 */
		public void setCommission(BigDecimal commission) {
			this.commission = commission;
		}

		/**
		 * Gets the 佣金比例.
		 *
		 * @return the 佣金比例
		 */
		public BigDecimal getCommissionRate() {
			return commissionRate;
		}

		/**
		 * Sets the 佣金比例.
		 *
		 * @param commissionRate the new 佣金比例
		 */
		public void setCommissionRate(BigDecimal commissionRate) {
			this.commissionRate = commissionRate;
		}

		/**
		 * Gets the 券地址.
		 *
		 * @return the 券地址
		 */
		public String getUlandUrl() {
			return ulandUrl;
		}

		/**
		 * Sets the 券地址.
		 *
		 * @param ulandUrl the new 券地址
		 */
		public void setUlandUrl(String ulandUrl) {
			this.ulandUrl = ulandUrl;
		}

		/**
		 * Gets the 新口令.
		 *
		 * @return the 新口令
		 */
		public String getToken() {
			return token;
		}

		/**
		 * Sets the 新口令.
		 *
		 * @param token the new 新口令
		 */
		public void setToken(String token) {
			this.token = token;
		}

	}

}
