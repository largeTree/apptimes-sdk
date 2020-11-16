package com.qiuxs.apptimes.jd.req;

import com.qiuxs.apptimes.base.request.BaseRequest;
import com.qiuxs.apptimes.base.request.anno.ApptimesApi;
import com.qiuxs.apptimes.jd.resp.GoodsJingXuanQueryResponse;

/**
 * 京东精选商品
 * 功能描述: <br/>  
 * 新增原因: TODO<br/>  
 * 新增日期: 2020年11月15日 上午11:41:28 <br/>  
 *  
 * @author qiuxs   
 * @version 1.0.0
 */
@ApptimesApi("jd-union/goods-jingfen-query")
public class GoodsJingXuanQueryRequest extends BaseRequest<GoodsJingXuanQueryResponse> {

	private static final long serialVersionUID = 1191450763390364937L;

	/** 频道ID */
	private Integer eliteId;
	/** 排序字段(price：单价, commissionShare：佣金比例, commission：佣金， inOrderCount30DaysSku：sku维度30天引单量，comments：评论数，goodComments：好评数) */
	private String sortName;
	/** asc,desc升降序,默认降序 */
	private String sort;
	/** 联盟id_应用id_推广位id，三段式 */
	private String pid;
	/** 支持出参数据筛选，逗号','分隔，目前可用：videoInfo,documentInfo */
	private String fields;
	/** 10微信京东购物小程序禁售，11微信京喜小程序禁售 */
	private String forbidTypes;

	private Integer pageIndex;
	private Integer pageSize;

	public Integer getEliteId() {
		return eliteId;
	}

	public void setEliteId(Integer eliteId) {
		this.eliteId = eliteId;
	}

	public String getSortName() {
		return sortName;
	}

	public void setSortName(String sortName) {
		this.sortName = sortName;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getFields() {
		return fields;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getForbidTypes() {
		return forbidTypes;
	}

	public void setForbidTypes(String forbidTypes) {
		this.forbidTypes = forbidTypes;
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
