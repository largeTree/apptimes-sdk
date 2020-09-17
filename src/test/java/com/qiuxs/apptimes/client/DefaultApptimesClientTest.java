package com.qiuxs.apptimes.client;

import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.qiuxs.apptimes.config.UConfigClientConfig;
import com.qiuxs.apptimes.request.CouponRequest;
import com.qiuxs.apptimes.request.OrderListRequest;
import com.qiuxs.apptimes.request.PublisherTokenGetRequest;
import com.qiuxs.apptimes.request.TaoPasswordCreateRequest;
import com.qiuxs.apptimes.request.UserExpTimeRequest;
import com.qiuxs.apptimes.response.CouponResponse;
import com.qiuxs.apptimes.response.OrderListResponse;
import com.qiuxs.apptimes.response.PublisherTokenGetResponse;
import com.qiuxs.apptimes.response.TaoPasswordCreateResponse;
import com.qiuxs.apptimes.response.UserExpTimeResponse;
import com.qiuxs.apptimes.response.dto.OrderData;
import com.qiuxs.cuteframework.core.basic.utils.JsonUtils;

/**
 * 功能描述: 默认客户端实现单元测试<br/>  
 * 新增原因: <br/>  
 * 新增日期: 2020年3月1日 下午10:10:35 <br/>  
 *  
 * @author qiuxs   
 * @version 1.0.0
 */
public class DefaultApptimesClientTest {

	private IApptimesClient client;

	@Before
	public void setUp() {
		this.client = new DefaultApptimesClient(new UConfigClientConfig("apptimes"));
	}

	@Test
	public void textCreateTaoPwd() {
		TaoPasswordCreateRequest req = new TaoPasswordCreateRequest();
		req.setPicUrl("https://upcloud.qiuxs.com/users/headimgs/9/2020_03_21_20_42_48");
		req.setText("老铁授权");
		req.setUrl("https%3A%2F%2Foauth.taobao.com%2Fauthorize%3Fresponse_type%3Dcode%26client_id%3D24738761%26redirect_uri%3Dhttp%3A%2F%2Fdev.api.5uzhe.com%2Fwxbot%2Ftb%2Fcallback.do%26state%3DdWlkPTkmZnJvbT10Yg%3D%3D%26view%3Dwap");
		TaoPasswordCreateResponse resp = this.client.execute(req);
		System.out.println(JsonUtils.toJSONString(resp));
	}
	
	@Test
	public void testPublisherTokenGet() {
		PublisherTokenGetRequest req = new PublisherTokenGetRequest();
		req.setState("test");
		req.setCallbackUrl("http://home.qiuxs.com:8085/wxbot/tb/callback.do");
		PublisherTokenGetResponse resp = this.client.execute(req);
		System.out.println(resp.getData().getToken());
		System.out.println(resp.getData().getUrl());
	}
	
	@Test
	public void testOrderList() {
		OrderListRequest req = new OrderListRequest();
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_YEAR, -90);
		Date startTime = cal.getTime();
		req.setStartTime(startTime);
		cal.add(Calendar.HOUR_OF_DAY, 3);
		Date endTime = cal.getTime();
		req.setEndTime(endTime);
		OrderListResponse resp = this.client.execute(req);
		OrderData data = resp.getData();
		System.out.println(JsonUtils.toJSONString(resp));
		System.out.println(JsonUtils.toJSONString(data));
	}
	
	@Test
	public void testCoupon() {
		CouponRequest request = new CouponRequest();
		request.setGoodId(598088771970L);
		CouponResponse response = this.client.execute(request);
		System.out.println(JsonUtils.toJSONString(response));
	}
	
	@Test
	public void testUserExpTimeRequest() {
		UserExpTimeRequest req = new UserExpTimeRequest();
		UserExpTimeResponse response = this.client.execute(req);
		System.out.println(JsonUtils.toJSONString(response));
	}

}
