package com.qiuxs.apptimes.response.dto;

import java.io.Serializable;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class OrderData.
 */
public class OrderData implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5670214543427224636L;

	/**  是否还有上一页. */
	private boolean hasPre;

	/**  是否还有下一页. */
	private boolean hasNext;

	/**  页码. */
	private int pageNo;

	/**  每页行数. */
	private int pageSize;

	/**  页面位置. */
	private String positionIndex;

	/**  订单数据. */
	private Results results;

	/**
	 * Checks if is 是否还有上一页.
	 *
	 * @return the 是否还有上一页
	 */
	public boolean isHasPre() {
		return hasPre;
	}

	/**
	 * Sets the 是否还有上一页.
	 *
	 * @param hasPre the new 是否还有上一页
	 */
	public void setHasPre(boolean hasPre) {
		this.hasPre = hasPre;
	}

	/**
	 * Checks if is 是否还有下一页.
	 *
	 * @return the 是否还有下一页
	 */
	public boolean isHasNext() {
		return hasNext;
	}

	/**
	 * Sets the 是否还有下一页.
	 *
	 * @param hasNext the new 是否还有下一页
	 */
	public void setHasNext(boolean hasNext) {
		this.hasNext = hasNext;
	}

	/**
	 * Gets the 页码.
	 *
	 * @return the 页码
	 */
	public int getPageNo() {
		return pageNo;
	}

	/**
	 * Sets the 页码.
	 *
	 * @param pageNo the new 页码
	 */
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	/**
	 * Gets the 每页行数.
	 *
	 * @return the 每页行数
	 */
	public int getPageSize() {
		return pageSize;
	}

	/**
	 * Sets the 每页行数.
	 *
	 * @param pageSize the new 每页行数
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * Gets the 页面位置.
	 *
	 * @return the 页面位置
	 */
	public String getPositionIndex() {
		return positionIndex;
	}

	/**
	 * Sets the 页面位置.
	 *
	 * @param positionIndex the new 页面位置
	 */
	public void setPositionIndex(String positionIndex) {
		this.positionIndex = positionIndex;
	}

	/**
	 * Gets the 订单数据.
	 *
	 * @return the 订单数据
	 */
	public Results getResults() {
		return results;
	}

	/**
	 * Sets the 订单数据.
	 *
	 * @param results the new 订单数据
	 */
	public void setResults(Results results) {
		this.results = results;
	}
	
	
	public static class Results {
		
		/**  订单列表. */
		public List<TkOrderData> publisherOrderDto;

		/**
		 * Gets the 订单列表.
		 *
		 * @return the 订单列表
		 */
		public List<TkOrderData> getPublisherOrderDto() {
			return publisherOrderDto;
		}

		/**
		 * Sets the 订单列表.
		 *
		 * @param publisherOrderDto the new 订单列表
		 */
		public void setPublisherOrderDto(List<TkOrderData> publisherOrderDto) {
			this.publisherOrderDto = publisherOrderDto;
		}

	}

}
