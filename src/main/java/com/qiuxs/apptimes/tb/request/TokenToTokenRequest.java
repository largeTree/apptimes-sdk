package com.qiuxs.apptimes.tb.request;

import com.qiuxs.apptimes.base.request.BaseRequest;
import com.qiuxs.apptimes.base.request.anno.ApiField;
import com.qiuxs.apptimes.base.request.anno.ApptimesApi;
import com.qiuxs.apptimes.tb.response.TokenToTokenResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class TokenToTokenRequest.
 */
@ApptimesApi("convert/token-to-token")
public class TokenToTokenRequest extends BaseRequest<TokenToTokenResponse> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -6493186451029703816L;

	/**  口令. */
	private String token;
	
	/**  mm_xx_xx_xx. */
	private String pid;
	
	/**  渠道ID. */
	@ApiField("relation_id")
	private Long relationId;
	
	/**  会员运营ID. */
	@ApiField("special_id")
	private Long specialId;
	
	/**  传给淘宝用来生成specialId的关联字段. */
	@ApiField("external_id")
	private Long externalId;

	/**
	 * Gets the 口令.
	 *
	 * @return the 口令
	 */
	public String getToken() {
		return token;
	}

	/**
	 * Sets the 口令.
	 *
	 * @param token the new 口令
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * Gets the mm_xx_xx_xx.
	 *
	 * @return the mm_xx_xx_xx
	 */
	public String getPid() {
		return pid;
	}

	/**
	 * Sets the mm_xx_xx_xx.
	 *
	 * @param pid the new mm_xx_xx_xx
	 */
	public void setPid(String pid) {
		this.pid = pid;
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

	/**
	 * Gets the 会员运营ID.
	 *
	 * @return the 会员运营ID
	 */
	public Long getSpecialId() {
		return specialId;
	}

	/**
	 * Sets the 会员运营ID.
	 *
	 * @param specialId the new 会员运营ID
	 */
	public void setSpecialId(Long specialId) {
		this.specialId = specialId;
	}

	/**
	 * Gets the 传给淘宝用来生成specialId的关联字段.
	 *
	 * @return the 传给淘宝用来生成specialId的关联字段
	 */
	public Long getExternalId() {
		return externalId;
	}

	/**
	 * Sets the 传给淘宝用来生成specialId的关联字段.
	 *
	 * @param externalId the new 传给淘宝用来生成specialId的关联字段
	 */
	public void setExternalId(Long externalId) {
		this.externalId = externalId;
	}

}
