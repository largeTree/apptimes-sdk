package com.qiuxs.apptimes.jd.resp;

import java.io.Serializable;

import com.alibaba.fastjson.JSONObject;
import com.qiuxs.apptimes.response.BaseResponse;

/**
 * {"errcode":0,"errmsg":"success","data":{"resultList":{"长安":20000920408},"siteId":3000436543,"type":1,"unionId":1000817921}}
 */
public class PositionCreateResponse extends BaseResponse {

	private static final long serialVersionUID = -7984657605778517082L;

	private Data data;

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data implements Serializable {

		private static final long serialVersionUID = -1825551226363647600L;

		/** 结果列表 */
		private JSONObject resultList;
		/** 网站ID */
		private Long siteId;
		/** 推广位类型 */
		private Integer type;
		/** 联盟ID */
		private Long unionId;

		public JSONObject getResultList() {
			return resultList;
		}

		public void setResultList(JSONObject resultList) {
			this.resultList = resultList;
		}

		public Long getSiteId() {
			return siteId;
		}

		public void setSiteId(Long siteId) {
			this.siteId = siteId;
		}

		public Integer getType() {
			return type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public Long getUnionId() {
			return unionId;
		}

		public void setUnionId(Long unionId) {
			this.unionId = unionId;
		}
	}

}
