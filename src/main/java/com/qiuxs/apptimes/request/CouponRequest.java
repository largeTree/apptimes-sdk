package com.qiuxs.apptimes.request;

import com.qiuxs.apptimes.request.anno.ApiField;
import com.qiuxs.apptimes.request.anno.ApptimesApi;
import com.qiuxs.apptimes.response.CouponResponse;

// TODO: Auto-generated Javadoc
/**
 * 
 * 功能描述: <br/>  
 * 新增原因: TODO<br/>  
 * 新增日期: 2020年3月6日 上午9:56:07 <br/>  
 *  
 * @author qiuxs   
 * @version 1.0.0
 */
@ApptimesApi("coupon")
public class CouponRequest extends BaseRequest<CouponResponse> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7745527667771579549L;

	/**  pid: mm_xxxx_xxxx_xxxx. */
	private String pid;
	
	/**  商品ID. */
	@ApiField("good_id")
	private Long goodId;
	
	/**  渠道ID. */
	@ApiField("relation_id")
	private Long relationId;
	
	/** 会员运营ID */
	@ApiField("special_id")
	private Long specialId;
	
	/**  淘宝客外部用户标记，如自身系统用户ID. */
	@ApiField("external_id")
	private Long externalId;
	
	/**  1:PC,2:无线. */
	private Integer platform;

	/**
	 * Gets the pid: mm_xxxx_xxxx_xxxx.
	 *
	 * @return the pid: mm_xxxx_xxxx_xxxx
	 */
	public String getPid() {
		return pid;
	}

	/**
	 * Sets the pid: mm_xxxx_xxxx_xxxx.
	 *
	 * @param pid the new pid: mm_xxxx_xxxx_xxxx
	 */
	public void setPid(String pid) {
		this.pid = pid;
	}

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
	 * Gets the 渠道ID.
	 *
	 * @return the 渠道ID
	 */
	public Long getRelationId() {
		return relationId;
	}

	/**
	 * Sets the 渠道ID.
	 *
	 * @param relationId the new 渠道ID
	 */
	public void setRelationId(Long relationId) {
		this.relationId = relationId;
	}

	public Long getSpecialId() {
		return specialId;
	}

	public void setSpecialId(Long specialId) {
		this.specialId = specialId;
	}

	/**
	 * Gets the 淘宝客外部用户标记，如自身系统用户ID.
	 *
	 * @return the 淘宝客外部用户标记，如自身系统用户ID
	 */
	public Long getExternalId() {
		return externalId;
	}

	/**
	 * Sets the 淘宝客外部用户标记，如自身系统用户ID.
	 *
	 * @param externalId the new 淘宝客外部用户标记，如自身系统用户ID
	 */
	public void setExternalId(Long externalId) {
		this.externalId = externalId;
	}

	/**
	 * Gets the 1:PC,2:无线.
	 *
	 * @return the 1:PC,2:无线
	 */
	public Integer getPlatform() {
		return platform;
	}

	/**
	 * Sets the 1:PC,2:无线.
	 *
	 * @param platform the new 1:PC,2:无线
	 */
	public void setPlatform(Integer platform) {
		this.platform = platform;
	}

}
