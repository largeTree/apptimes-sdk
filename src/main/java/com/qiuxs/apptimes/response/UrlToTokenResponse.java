package com.qiuxs.apptimes.response;

import java.io.Serializable;
import java.math.BigDecimal;

public class UrlToTokenResponse extends BaseResponse {

	private static final long serialVersionUID = -1193663431994213742L;

	private Data data;

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data implements Serializable {
		
		private static final long serialVersionUID = -6659698146852538319L;
		
		private BigDecimal commission;
		private BigDecimal commissionRate;
		private BigDecimal currentPrice;
		private BigDecimal finalCommission;
		private Long goodId;
		private String goodPic;
		private String goodTitle;
		private Integer isMall;
		private BigDecimal maxCommissionRate;
		private BigDecimal minCommissionRate;
		private String nick;
		private BigDecimal originPrice;
		private BigDecimal quanPrice;
		private Long sales;
		private String sclickUrl;
		private Long sellerId;
		private String token;
		private String ulandUrl;

		public BigDecimal getCommission() {
			return commission;
		}

		public void setCommission(BigDecimal commission) {
			this.commission = commission;
		}

		public BigDecimal getCommissionRate() {
			return commissionRate;
		}

		public void setCommissionRate(BigDecimal commissionRate) {
			this.commissionRate = commissionRate;
		}

		public BigDecimal getCurrentPrice() {
			return currentPrice;
		}

		public void setCurrentPrice(BigDecimal currentPrice) {
			this.currentPrice = currentPrice;
		}

		public BigDecimal getFinalCommission() {
			return finalCommission;
		}

		public void setFinalCommission(BigDecimal finalCommission) {
			this.finalCommission = finalCommission;
		}

		public Long getGoodId() {
			return goodId;
		}

		public void setGoodId(Long goodId) {
			this.goodId = goodId;
		}

		public String getGoodPic() {
			return goodPic;
		}

		public void setGoodPic(String goodPic) {
			this.goodPic = goodPic;
		}

		public String getGoodTitle() {
			return goodTitle;
		}

		public void setGoodTitle(String goodTitle) {
			this.goodTitle = goodTitle;
		}

		public Integer getIsMall() {
			return isMall;
		}

		public void setIsMall(Integer isMall) {
			this.isMall = isMall;
		}

		public BigDecimal getMaxCommissionRate() {
			return maxCommissionRate;
		}

		public void setMaxCommissionRate(BigDecimal maxCommissionRate) {
			this.maxCommissionRate = maxCommissionRate;
		}

		public BigDecimal getMinCommissionRate() {
			return minCommissionRate;
		}

		public void setMinCommissionRate(BigDecimal minCommissionRate) {
			this.minCommissionRate = minCommissionRate;
		}

		public String getNick() {
			return nick;
		}

		public void setNick(String nick) {
			this.nick = nick;
		}

		public BigDecimal getOriginPrice() {
			return originPrice;
		}

		public void setOriginPrice(BigDecimal originPrice) {
			this.originPrice = originPrice;
		}

		public BigDecimal getQuanPrice() {
			return quanPrice;
		}

		public void setQuanPrice(BigDecimal quanPrice) {
			this.quanPrice = quanPrice;
		}

		public Long getSales() {
			return sales;
		}

		public void setSales(Long sales) {
			this.sales = sales;
		}

		public String getSclickUrl() {
			return sclickUrl;
		}

		public void setSclickUrl(String sclickUrl) {
			this.sclickUrl = sclickUrl;
		}

		public Long getSellerId() {
			return sellerId;
		}

		public void setSellerId(Long sellerId) {
			this.sellerId = sellerId;
		}

		public String getToken() {
			return token;
		}

		public void setToken(String token) {
			this.token = token;
		}

		public String getUlandUrl() {
			return ulandUrl;
		}

		public void setUlandUrl(String ulandUrl) {
			this.ulandUrl = ulandUrl;
		}
	}

}
