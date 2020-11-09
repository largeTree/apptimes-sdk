package com.qiuxs.apptimes.tb.response;

import com.qiuxs.apptimes.base.response.BaseResponse;
import com.qiuxs.apptimes.tb.response.dto.OrderData;

/**
 * The Class OrderListResponse.
 */
public class OrderListResponse extends BaseResponse {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -1624751608630672345L;

	/** 订单数据 */
	private OrderData data;

	public OrderData getData() {
		return data;
	}

	public void setData(OrderData data) {
		this.data = data;
	}

}
