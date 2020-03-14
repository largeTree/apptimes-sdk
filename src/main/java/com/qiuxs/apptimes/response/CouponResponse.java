package com.qiuxs.apptimes.response;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/***
 * 
 * 功能描述: 高佣接口返回数据接收<br/>  
 * 新增原因: <br/>  
 * 新增日期: 2020年3月6日 上午9:55:20 <br/>  
 *  
 * @author qiuxs   
 * @version 1.0.0
 */
public class CouponResponse extends BaseResponse<CouponResponse.Coupon> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -603631346551684459L;

	/**
	 * The Class Coupon.
	 */
	public static class Coupon implements Serializable {
		
		/** The Constant serialVersionUID. */
		private static final long serialVersionUID = -6356665392568047157L;
		
		/**  类别ID. */
		private Long categoryId;
		
		/**  券+商品链接. */
		private String couponClickUrl;
		
		/**  优惠券开始时间. */
		private Date couponStartTime;
		
		/**  优惠券结束时间. */
		private Date couponEndTime;
		
		/**  优惠券信息. */
		private String couponInfo;
		
		/**  优惠券总数. */
		private Long couponTotalCount;
		
		/**  优惠券剩余数量. */
		private Long couponRemainCount;
		
		/**  优惠券类型. */
		private Integer couponType;
		
		/**  商品ID. */
		private Long itemId;
		
		/**  商品链接. */
		private String itemUrl;
		
		/**  最大佣金比例. */
		private BigDecimal maxCommissionRate;

		/**
		 * Gets the 类别ID.
		 *
		 * @return the 类别ID
		 */
		public Long getCategoryId() {
			return categoryId;
		}

		/**
		 * Sets the 类别ID.
		 *
		 * @param categoryId the new 类别ID
		 */
		public void setCategoryId(Long categoryId) {
			this.categoryId = categoryId;
		}

		/**
		 * Gets the 券+商品链接.
		 *
		 * @return the 券+商品链接
		 */
		public String getCouponClickUrl() {
			return couponClickUrl;
		}

		/**
		 * Sets the 券+商品链接.
		 *
		 * @param couponClickUrl the new 券+商品链接
		 */
		public void setCouponClickUrl(String couponClickUrl) {
			this.couponClickUrl = couponClickUrl;
		}

		/**
		 * Gets the 优惠券开始时间.
		 *
		 * @return the 优惠券开始时间
		 */
		public Date getCouponStartTime() {
			return couponStartTime;
		}

		/**
		 * Sets the 优惠券开始时间.
		 *
		 * @param couponStartTime the new 优惠券开始时间
		 */
		public void setCouponStartTime(Date couponStartTime) {
			this.couponStartTime = couponStartTime;
		}

		/**
		 * Gets the 优惠券结束时间.
		 *
		 * @return the 优惠券结束时间
		 */
		public Date getCouponEndTime() {
			return couponEndTime;
		}

		/**
		 * Sets the 优惠券结束时间.
		 *
		 * @param couponEndTime the new 优惠券结束时间
		 */
		public void setCouponEndTime(Date couponEndTime) {
			this.couponEndTime = couponEndTime;
		}

		/**
		 * Gets the 优惠券信息.
		 *
		 * @return the 优惠券信息
		 */
		public String getCouponInfo() {
			return couponInfo;
		}

		/**
		 * Sets the 优惠券信息.
		 *
		 * @param couponInfo the new 优惠券信息
		 */
		public void setCouponInfo(String couponInfo) {
			this.couponInfo = couponInfo;
		}

		/**
		 * Gets the 优惠券总数.
		 *
		 * @return the 优惠券总数
		 */
		public Long getCouponTotalCount() {
			return couponTotalCount;
		}

		/**
		 * Sets the 优惠券总数.
		 *
		 * @param couponTotalCount the new 优惠券总数
		 */
		public void setCouponTotalCount(Long couponTotalCount) {
			this.couponTotalCount = couponTotalCount;
		}

		/**
		 * Gets the 优惠券剩余数量.
		 *
		 * @return the 优惠券剩余数量
		 */
		public Long getCouponRemainCount() {
			return couponRemainCount;
		}

		/**
		 * Sets the 优惠券剩余数量.
		 *
		 * @param couponRemainCount the new 优惠券剩余数量
		 */
		public void setCouponRemainCount(Long couponRemainCount) {
			this.couponRemainCount = couponRemainCount;
		}

		/**
		 * Gets the 优惠券类型.
		 *
		 * @return the 优惠券类型
		 */
		public Integer getCouponType() {
			return couponType;
		}

		/**
		 * Sets the 优惠券类型.
		 *
		 * @param couponType the new 优惠券类型
		 */
		public void setCouponType(Integer couponType) {
			this.couponType = couponType;
		}

		/**
		 * Gets the 商品ID.
		 *
		 * @return the 商品ID
		 */
		public Long getItemId() {
			return itemId;
		}

		/**
		 * Sets the 商品ID.
		 *
		 * @param itemId the new 商品ID
		 */
		public void setItemId(Long itemId) {
			this.itemId = itemId;
		}

		/**
		 * Gets the 商品链接.
		 *
		 * @return the 商品链接
		 */
		public String getItemUrl() {
			return itemUrl;
		}

		/**
		 * Sets the 商品链接.
		 *
		 * @param itemUrl the new 商品链接
		 */
		public void setItemUrl(String itemUrl) {
			this.itemUrl = itemUrl;
		}

		/**
		 * Gets the 最大佣金比例.
		 *
		 * @return the 最大佣金比例
		 */
		public BigDecimal getMaxCommissionRate() {
			return maxCommissionRate;
		}

		/**
		 * Sets the 最大佣金比例.
		 *
		 * @param maxCommissionRate the new 最大佣金比例
		 */
		public void setMaxCommissionRate(BigDecimal maxCommissionRate) {
			this.maxCommissionRate = maxCommissionRate;
		}
	}

}
