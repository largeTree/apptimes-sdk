package com.qiuxs.apptimes.jd.resp;

import java.io.Serializable;
import java.util.List;

import com.qiuxs.apptimes.base.response.BaseResponse;

// TODO: Auto-generated Javadoc
/**
 * {"errcode":0,"errmsg":"success","data":{"pageNo":1,"pageSize":100,"result":[{"id":3002753481,"siteId":4000334032,"spaceName":"3863989826","type":3},{"id":3000480074,"siteId":3000437209,"spaceName":"购有惠","type":1}],"total":2}}
 * 功能描述: <br/>  
 * 新增原因: TODO<br/>  
 * 新增日期: 2020年9月1日 下午3:43:48 <br/>  
 *  
 * @author qiuxs   
 * @version 1.0.0
 */
public class PositionQueryResponse extends BaseResponse {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -6652348986914899975L;
	
	/** The data. */
	private Data data;
	
	
	/**
	 * Gets the data.
	 *
	 * @return the data
	 */
	public Data getData() {
		return data;
	}

	/**
	 * Sets the data.
	 *
	 * @param data the new data
	 */
	public void setData(Data data) {
		this.data = data;
	}

	/**
	 * The Class Data.
	 */
	public static class Data implements Serializable {

		/** The Constant serialVersionUID. */
		private static final long serialVersionUID = 6310892801299061330L;

		/**  页码. */
		private Integer pageNo;
		
		/**  页面大小. */
		private Integer pageSize;
		
		/**  总数. */
		private Long total;
		
		/**  结果列表. */
		private List<Result> result;

		/**
		 * Gets the 页码.
		 *
		 * @return the 页码
		 */
		public Integer getPageNo() {
			return pageNo;
		}

		/**
		 * Sets the 页码.
		 *
		 * @param pageNo the new 页码
		 */
		public void setPageNo(Integer pageNo) {
			this.pageNo = pageNo;
		}

		/**
		 * Gets the 页面大小.
		 *
		 * @return the 页面大小
		 */
		public Integer getPageSize() {
			return pageSize;
		}

		/**
		 * Sets the 页面大小.
		 *
		 * @param pageSize the new 页面大小
		 */
		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		/**
		 * Gets the 总数.
		 *
		 * @return the 总数
		 */
		public Long getTotal() {
			return total;
		}

		/**
		 * Sets the 总数.
		 *
		 * @param total the new 总数
		 */
		public void setTotal(Long total) {
			this.total = total;
		}

		/**
		 * Gets the 结果列表.
		 *
		 * @return the 结果列表
		 */
		public List<Result> getResult() {
			return result;
		}

		/**
		 * Sets the 结果列表.
		 *
		 * @param result the new 结果列表
		 */
		public void setResult(List<Result> result) {
			this.result = result;
		}

	}

	/***
	 * 推广位
	 * 功能描述: <br/>  
	 * 新增原因: TODO<br/>  
	 * 新增日期: 2020年9月1日 下午3:50:18 <br/>  
	 *  
	 * @author qiuxs   
	 * @version 1.0.0
	 */
	public static class Result implements Serializable {

		/** The Constant serialVersionUID. */
		private static final long serialVersionUID = -2953362910114320817L;
		
		/**  推广位ID. */
		private Long id;
		
		/**  站点ID. */
		private Long siteId;
		
		/**  推广位名称. */
		private String spaceName;
		
		/**  推广位类型. */
		private Integer type;

		/**
		 * Gets the 推广位ID.
		 *
		 * @return the 推广位ID
		 */
		public Long getId() {
			return id;
		}

		/**
		 * Sets the 推广位ID.
		 *
		 * @param id the new 推广位ID
		 */
		public void setId(Long id) {
			this.id = id;
		}

		/**
		 * Gets the 站点ID.
		 *
		 * @return the 站点ID
		 */
		public Long getSiteId() {
			return siteId;
		}

		/**
		 * Sets the 站点ID.
		 *
		 * @param siteId the new 站点ID
		 */
		public void setSiteId(Long siteId) {
			this.siteId = siteId;
		}

		/**
		 * Gets the 推广位名称.
		 *
		 * @return the 推广位名称
		 */
		public String getSpaceName() {
			return spaceName;
		}

		/**
		 * Sets the 推广位名称.
		 *
		 * @param spaceName the new 推广位名称
		 */
		public void setSpaceName(String spaceName) {
			this.spaceName = spaceName;
		}

		/**
		 * Gets the 推广位类型.
		 *
		 * @return the 推广位类型
		 */
		public Integer getType() {
			return type;
		}

		/**
		 * Sets the 推广位类型.
		 *
		 * @param type the new 推广位类型
		 */
		public void setType(Integer type) {
			this.type = type;
		}

	}

}
