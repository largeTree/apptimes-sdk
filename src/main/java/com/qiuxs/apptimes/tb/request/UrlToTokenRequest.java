package com.qiuxs.apptimes.tb.request;

import com.qiuxs.apptimes.base.request.BaseRequest;
import com.qiuxs.apptimes.base.request.anno.ApiField;
import com.qiuxs.apptimes.base.request.anno.ApptimesApi;
import com.qiuxs.apptimes.tb.response.UrlToTokenResponse;

@ApptimesApi("convert/url-to-token")
public class UrlToTokenRequest extends BaseRequest<UrlToTokenResponse> {

	private static final long serialVersionUID = 3290372182928288943L;

	private String url;
	private String pid;
	/**  渠道ID. */
	@ApiField("relation_id")
	private Long relationId;

	/**  会员运营ID. */
	@ApiField("special_id")
	private Long specialId;

	/**  传给淘宝用来生成会员ID的东西. */
	@ApiField("external_id")
	private Long externalId;

	@ApiField("activity_id")
	private String activityId;

	private String xid;
	@ApiField("force_uland")
	private Integer forceUland;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
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

	public Long getSpecialId() {
		return specialId;
	}

	public void setSpecialId(Long specialId) {
		this.specialId = specialId;
	}

	public Long getExternalId() {
		return externalId;
	}

	public void setExternalId(Long externalId) {
		this.externalId = externalId;
	}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getXid() {
		return xid;
	}

	public void setXid(String xid) {
		this.xid = xid;
	}

	public Integer getForceUland() {
		return forceUland;
	}

	public void setForceUland(Integer forceUland) {
		this.forceUland = forceUland;
	}

}
