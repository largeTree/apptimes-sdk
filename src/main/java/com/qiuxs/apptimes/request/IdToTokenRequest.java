package com.qiuxs.apptimes.request;

import com.qiuxs.apptimes.request.anno.ApiField;
import com.qiuxs.apptimes.request.anno.ApptimesApi;
import com.qiuxs.apptimes.response.IdToTokenResponse;

/**
 * 商品ID转淘口令接口
 * 功能描述: <p>  
 * 新增原因: TODO<p>  
 * 新增日期: 2020年5月5日 下午9:12:43 <p>  
 *  
 * @author qiuxs   
 * @version 1.0.0
 */
@ApptimesApi("convert/id-to-token")
public class IdToTokenRequest extends BaseRequest<IdToTokenResponse> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 2796879498142325177L;

	/**  pid：mm_xxx_xxx_xxx. */
	private String pid;
	
	/**  商品ID. */
	@ApiField("good_id")
	private Long goodId;
	
	/**  渠道ID. */
	@ApiField("relation_id")
	private Long relationId;

	/**
	 * Gets the pid：mm_xxx_xxx_xxx.
	 *
	 * @return the pid：mm_xxx_xxx_xxx
	 */
	public String getPid() {
		return pid;
	}

	/**
	 * Sets the pid：mm_xxx_xxx_xxx.
	 *
	 * @param pid the new pid：mm_xxx_xxx_xxx
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

}
