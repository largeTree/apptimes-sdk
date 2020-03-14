package com.qiuxs.apptimes.client;

import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.qiuxs.apptimes.config.UConfigClientConfig;
import com.qiuxs.apptimes.request.CouponRequest;
import com.qiuxs.apptimes.request.OrderListRequest;
import com.qiuxs.apptimes.request.PublisherTokenGetRequest;
import com.qiuxs.apptimes.request.UserExpTimeRequest;
import com.qiuxs.apptimes.response.CouponResponse;
import com.qiuxs.apptimes.response.OrderListResponse;
import com.qiuxs.apptimes.response.PublisherTokenGetResponse;
import com.qiuxs.apptimes.response.UserExpTimeResponse;
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
		Date endTime = cal.getTime();
		cal.add(Calendar.HOUR, -3);
		Date startTime = cal.getTime();
		req.setStartTime(startTime);
		req.setEndTime(endTime);
		OrderListResponse resp = this.client.execute(req);
		System.out.println(JsonUtils.toJSONString(resp));
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
