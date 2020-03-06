package com.qiuxs.apptimes.request;

import com.qiuxs.apptimes.request.anno.ApiField;
import com.qiuxs.apptimes.request.anno.ApptimesApi;
import com.qiuxs.apptimes.response.CouponResponse;

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

}
