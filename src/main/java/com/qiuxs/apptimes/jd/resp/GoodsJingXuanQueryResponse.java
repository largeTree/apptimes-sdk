package com.qiuxs.apptimes.jd.resp;

import com.alibaba.fastjson.JSONArray;
import com.qiuxs.apptimes.base.response.BaseResponse;

public class GoodsJingXuanQueryResponse extends BaseResponse {

	private static final long serialVersionUID = -4887475009861393434L;

	private JSONArray data;

	public JSONArray getData() {
		return data;
	}

	public void setData(JSONArray data) {
		this.data = data;
	}

}
