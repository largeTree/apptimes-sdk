package com.qiuxs.apptimes.client;

import org.junit.Before;
import org.junit.Test;

import com.qiuxs.apptimes.config.UConfigClientConfig;
import com.qiuxs.apptimes.request.CouponRequest;
import com.qiuxs.apptimes.request.UserExpTimeRequest;
import com.qiuxs.apptimes.response.CouponResponse;
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
