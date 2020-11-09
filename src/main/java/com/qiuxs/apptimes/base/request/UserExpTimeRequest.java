package com.qiuxs.apptimes.base.request;

import com.qiuxs.apptimes.base.request.anno.ApptimesApi;
import com.qiuxs.apptimes.base.response.UserExpTimeResponse;

/**
 * 功能描述: 查询授权有效期请求类 <br/>  
 * 新增原因: <br/>  
 * 新增日期: 2020年3月1日 下午10:09:43 <br/>  
 *  
 * @author qiuxs   
 * @version 1.0.0
 */
@ApptimesApi("user/exp-time")
public class UserExpTimeRequest extends BaseRequest<UserExpTimeResponse> {

	private static final long serialVersionUID = 2963845279227490166L;
	
}
