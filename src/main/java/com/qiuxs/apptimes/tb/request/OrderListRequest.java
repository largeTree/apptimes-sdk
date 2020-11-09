package com.qiuxs.apptimes.tb.request;

import java.util.Date;

import com.qiuxs.apptimes.base.request.BaseRequest;
import com.qiuxs.apptimes.base.request.anno.ApiField;
import com.qiuxs.apptimes.base.request.anno.ApptimesApi;
import com.qiuxs.apptimes.tb.response.OrderListResponse;
import com.qiuxs.cuteframework.core.basic.utils.DateFormatUtils;

/**
 * 订单列表请求
 * 功能描述: <br/>  
 * 新增原因: TODO<br/>  
 * 新增日期: 2020年3月12日 下午12:55:50 <br/>  
 *  
 * @author qiuxs   
 * @version 1.0.0
 */
@ApptimesApi("order-list")
public class OrderListRequest extends BaseRequest<OrderListResponse> {

	private static final long serialVersionUID = -437334495672281294L;

	/** 查询时间类型，1：按照订单淘客创建时间查询，2:按照订单淘客付款时间查询，3:按照订单淘客结算时间查询 */
	@ApiField("query_type")
	private Integer queryType;
	/** 位点，除第一页之外，都需要传递；前端原样返回。 */
	@ApiField("position_index")
	private String positionIndex;
	/** 页大小，默认20，1~100 */
	@ApiField("page_size")
	private Integer pageSize;
	/** 推广者角色类型,2:二方，3:三方，不传，表示所有角色 */
	@ApiField("member_type")
	private Integer memberType;
	/** 淘客订单状态，12-付款，13-关闭，14-确认收货，3-结算成功;不传，表示所有状态 */
	@ApiField("tk_status")
	private Integer tkStatus;
	/** 订单查询结束时间，订单开始时间至订单结束时间，中间时间段日常要求不超过3个小时，但如618、双11、年货节等大促期间预估时间段不可超过20分钟，超过会提示错误，调用时请务必注意时间段的选择，以保证亲能正常调用！ */
	@ApiField(value = "start_time", format = DateFormatUtils.yyyy_MM_dd_HH_mm_ss)
	private Date startTime;
	/** 订单查询开始时间 */
	@ApiField(value = "end_time", format = DateFormatUtils.yyyy_MM_dd_HH_mm_ss)
	private Date endTime;
	/** 跳转类型，当向前或者向后翻页必须提供,-1: 向前翻页,1：向后翻页 */
	@ApiField("jump_type")
	private Integer jumpType;
	/** 第几页，默认1，1~100 */
	@ApiField("page_no")
	private Integer pageNo;
	/** 场景订单场景类型，1:常规订单，2:渠道订单，3:会员运营订单，默认为1 */
	@ApiField("order_scene")
	private Integer orderScene;

	public Integer getQueryType() {
		return queryType;
	}

	public void setQueryType(Integer queryType) {
		this.queryType = queryType;
	}

	public String getPositionIndex() {
		return positionIndex;
	}

	public void setPositionIndex(String positionIndex) {
		this.positionIndex = positionIndex;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getMemberType() {
		return memberType;
	}

	public void setMemberType(Integer memberType) {
		this.memberType = memberType;
	}

	public Integer getTkStatus() {
		return tkStatus;
	}

	public void setTkStatus(Integer tkStatus) {
		this.tkStatus = tkStatus;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Integer getJumpType() {
		return jumpType;
	}

	public void setJumpType(Integer jumpType) {
		this.jumpType = jumpType;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getOrderScene() {
		return orderScene;
	}

	public void setOrderScene(Integer orderScene) {
		this.orderScene = orderScene;
	}

}
