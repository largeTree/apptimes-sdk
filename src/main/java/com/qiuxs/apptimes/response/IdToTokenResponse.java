package com.qiuxs.apptimes.response;

import java.io.Serializable;
import java.math.BigDecimal;

// TODO: Auto-generated Javadoc
/**
 * 商品ID转淘口令接口
 * 功能描述: <p>  
 * 新增原因: TODO<p>  
 * 新增日期: 2020年5月5日 下午9:13:04 <p>  
 *  
 * @author qiuxs   
 * @version 1.0.0
 */
public class IdToTokenResponse extends BaseResponse {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -3728755308163205404L;

	/** The data. */
	private Data data;

	/**
	 * Gets the data.
	 *
	 * @return the data
	 */
	public Data getData() {
		return data;
	}

	/**
	 * Sets the data.
	 *
	 * @param data the new data
	 */
	public void setData(Data data) {
		this.data = data;
	}

	/**
	 * The Class Data.
	 */
	public static class Data implements Serializable {

		/** The Constant serialVersionUID. */
		private static final long serialVersionUID = -1223491045478080686L;

		/**  商品ID. */
		private Long goodId;
		
		/**  商品标题. */
		private String goodTitle;
		
		/**  商品主图. */
		private String goodPic;
		
		/**  原价. */
		private BigDecimal originPrice;
		
		/**  优惠券价值. */
		private BigDecimal quanPrice;
		
		/**  当前价格. */
		private BigDecimal currentPrice;
		
		/**  是否天某. */
		private Integer isMall;
		
		/**  卖家ID. */
		private Long sellerId;
		
		/**  销售数. */
		private Integer sales;
		
		/**  店名. */
		private String nick;
		
		/**  佣金比例. */
		private BigDecimal commission;
		
		/**  佣金比例. */
		private BigDecimal commissionRate;
		
		/**  最低佣金比率. */
		private BigDecimal minCommissionRate;
		
		/**  优惠券地址. */
		private String ulandUrl;
		
		/**  商品地址. */
		private String sclickUrl;
		
		/**  淘口令. */
		private String token;

		/**
		 * Gets the 商品ID.
		 *
		 * @return the 商品ID
		 */
		public Long getGoodId() {
			return goodId;
		}

		/**
		 * Sets the 商品ID.
		 *
		 * @param goodId the new 商品ID
		 */
		public void setGoodId(Long goodId) {
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
		 * Gets the 优惠券价值.
		 *
		 * @return the 优惠券价值
		 */
		public BigDecimal getQuanPrice() {
			return quanPrice;
		}

		/**
		 * Sets the 优惠券价值.
		 *
		 * @param quanPrice the new 优惠券价值
		 */
		public void setQuanPrice(BigDecimal quanPrice) {
			this.quanPrice = quanPrice;
		}

		/**
		 * Gets the 当前价格.
		 *
		 * @return the 当前价格
		 */
		public BigDecimal getCurrentPrice() {
			return currentPrice;
		}

		/**
		 * Sets the 当前价格.
		 *
		 * @param currentPrice the new 当前价格
		 */
		public void setCurrentPrice(BigDecimal currentPrice) {
			this.currentPrice = currentPrice;
		}

		/**
		 * Gets the 是否天某.
		 *
		 * @return the 是否天某
		 */
		public Integer getIsMall() {
			return isMall;
		}

		/**
		 * Sets the 是否天某.
		 *
		 * @param isMall the new 是否天某
		 */
		public void setIsMall(Integer isMall) {
			this.isMall = isMall;
		}

		/**
		 * Gets the 卖家ID.
		 *
		 * @return the 卖家ID
		 */
		public Long getSellerId() {
			return sellerId;
		}

		/**
		 * Sets the 卖家ID.
		 *
		 * @param sellerId the new 卖家ID
		 */
		public void setSellerId(Long sellerId) {
			this.sellerId = sellerId;
		}

		/**
		 * Gets the 销售数.
		 *
		 * @return the 销售数
		 */
		public Integer getSales() {
			return sales;
		}

		/**
		 * Sets the 销售数.
		 *
		 * @param sales the new 销售数
		 */
		public void setSales(Integer sales) {
			this.sales = sales;
		}

		/**
		 * Gets the 店名.
		 *
		 * @return the 店名
		 */
		public String getNick() {
			return nick;
		}

		/**
		 * Sets the 店名.
		 *
		 * @param nick the new 店名
		 */
		public void setNick(String nick) {
			this.nick = nick;
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
		 * Gets the 最低佣金比率.
		 *
		 * @return the 最低佣金比率
		 */
		public BigDecimal getMinCommissionRate() {
			return minCommissionRate;
		}

		/**
		 * Sets the 最低佣金比率.
		 *
		 * @param minCommissionRate the new 最低佣金比率
		 */
		public void setMinCommissionRate(BigDecimal minCommissionRate) {
			this.minCommissionRate = minCommissionRate;
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
		 * Gets the 优惠券地址.
		 *
		 * @return the 优惠券地址
		 */
		public String getUlandUrl() {
			return ulandUrl;
		}

		/**
		 * Sets the 优惠券地址.
		 *
		 * @param ulandUrl the new 优惠券地址
		 */
		public void setUlandUrl(String ulandUrl) {
			this.ulandUrl = ulandUrl;
		}

		/**
		 * Gets the 商品地址.
		 *
		 * @return the 商品地址
		 */
		public String getSclickUrl() {
			return sclickUrl;
		}

		/**
		 * Sets the 商品地址.
		 *
		 * @param sclickUrl the new 商品地址
		 */
		public void setSclickUrl(String sclickUrl) {
			this.sclickUrl = sclickUrl;
		}

		/**
		 * Gets the 淘口令.
		 *
		 * @return the 淘口令
		 */
		public String getToken() {
			return token;
		}

		/**
		 * Sets the 淘口令.
		 *
		 * @param token the new 淘口令
		 */
		public void setToken(String token) {
			this.token = token;
		}
	}

}
