package com.qiuxs.apptimes.client;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.qiuxs.apptimes.base.config.UConfigClientConfig;
import com.qiuxs.apptimes.base.request.UserExpTimeRequest;
import com.qiuxs.apptimes.base.response.UserExpTimeResponse;
import com.qiuxs.apptimes.jd.req.PositionCreateRequest;
import com.qiuxs.apptimes.jd.req.PositionQueryRequest;
import com.qiuxs.apptimes.jd.resp.PositionQueryResponse;
import com.qiuxs.apptimes.jd.resp.PositionQueryResponse.Data;
import com.qiuxs.apptimes.jd.resp.PositionQueryResponse.Result;
import com.qiuxs.apptimes.tb.request.CouponRequest;
import com.qiuxs.apptimes.tb.request.OrderListRequest;
import com.qiuxs.apptimes.tb.request.PublisherTokenGetRequest;
import com.qiuxs.apptimes.tb.request.TaoPasswordCreateRequest;
import com.qiuxs.apptimes.tb.response.CouponResponse;
import com.qiuxs.apptimes.tb.response.OrderListResponse;
import com.qiuxs.apptimes.tb.response.PublisherTokenGetResponse;
import com.qiuxs.apptimes.tb.response.TaoPasswordCreateResponse;
import com.qiuxs.apptimes.tb.response.dto.OrderData;
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
	public void createJdPid() {
			StringBuilder sb = new StringBuilder();
			int count = 0;
			for (int i = 5001; i < 10000; i++) {
				String spaceName = "JDPID_" + i;
				sb.append(spaceName).append(",");
				count++;
				if (count == 50) {
					sb.setLength(sb.length() - 1);
    				PositionCreateRequest pcr = new PositionCreateRequest();
    				pcr.setKey("e4209eac5db9f8e2e12ac05c0d43b4850bd859b66982adfd8affd5511cd2eb5eb1c0805d854ff5de");
    				pcr.setType(1);
    				pcr.setSpaceNameList(sb.toString());
    				pcr.setUnionType(1);
    				pcr.setSiteId(3000437209L);
    				pcr.setUnionId(1000817921L);
    				this.client.execute(pcr);
    				count = 0;
    				sb = new StringBuilder();
				}
			}
		
	}
	
	@Test
	public void queryPid() {
		List<Result> all = new ArrayList<>();
		long total = 0;
		int page = 0;
		do {
			page++;
    		PositionQueryRequest pqr = new PositionQueryRequest();
    		pqr.setKey("e4209eac5db9f8e2e12ac05c0d43b4850bd859b66982adfd8affd5511cd2eb5eb1c0805d854ff5de");
    		pqr.setUnionId(1000817921L);
    		pqr.setUnionType(3);
    		pqr.setPageIndex(page);
    		pqr.setPageSize(100);
    		PositionQueryResponse resp = this.client.execute(pqr);
    		Data data = resp.getData();
    		List<Result> result = data.getResult();
    		all.addAll(result);
    		total = data.getTotal();
		} while(all.size() < total);
		
		FileWriter fw = null;
		try {
			fw = new FileWriter(new File("F:\\Windows\\Users\\qiuxs\\Desktop\\3000436543.sql"));
			for (Result res : all) {
				fw.append("INSERT INTO jd_user(id, space_name, pid, site_id, `type`, used_flag, created_time, updated_time) " + 
						"SELECT MAX(id) + 1, '" + res.getSpaceName() + "','" + res.getId() + "', 3000436543, 1, 0, now(), now() from jd_user;\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
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
