package com.qiuxs.apptimes.request;

import com.qiuxs.apptimes.request.anno.ApiField;
import com.qiuxs.apptimes.request.anno.ApptimesApi;
import com.qiuxs.apptimes.response.TokenToTokenResponse;

@ApptimesApi("convert/token-to-token")
public class TokenToTokenRequest extends BaseRequest<TokenToTokenResponse> {

	private static final long serialVersionUID = -6493186451029703816L;

	/** 口令 */
	private String token;
	/** mm_xx_xx_xx */
	private String pid;
	/** 渠道ID */
	@ApiField("relation_id")
	private Long relationId;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public Long getRelationId() {
		return relationId;
	}

	public void setRelationId(Long relationId) {
		this.relationId = relationId;
	}

}
