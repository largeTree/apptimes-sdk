package com.qiuxs.apptimes.jd.req;

import com.qiuxs.apptimes.base.request.BaseRequest;
import com.qiuxs.apptimes.base.request.anno.ApptimesApi;
import com.qiuxs.apptimes.jd.resp.PositionQueryResponse;

@ApptimesApi("jd-union/position-query")
public class PositionQueryRequest extends BaseRequest<PositionQueryResponse> {

	private static final long serialVersionUID = 5617496469976556953L;

	/** 联盟ID */
	private Long unionId;
	/** 联盟授权Key */
	private String key;
	/** 联盟推广位类型，1：官网和pid接口创建的推广位（含2020.4.28日前【批量创建推广位】接口创建的推广位），2:cpc推广位，3:私域会员推广位（2020.4.28之后【批量创建推广位】接口创建的推广位） */
	private Integer unionType;
	/** 页码，上限10000 */
	private Integer pageIndex;
	/** 每页条数，上限100 */
	private Integer pageSize;

	public Long getUnionId() {
		return unionId;
	}

	public void setUnionId(Long unionId) {
		this.unionId = unionId;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Integer getUnionType() {
		return unionType;
	}

	public void setUnionType(Integer unionType) {
		this.unionType = unionType;
	}

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

}
