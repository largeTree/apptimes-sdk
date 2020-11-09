package com.qiuxs.apptimes.base.config;

import java.io.Serializable;

/**
 * 
 * 功能描述: 接口配置<br/>  
 * 新增原因: TODO<br/>  
 * 新增日期: 2020年3月1日 下午7:08:15 <br/>  
 *  
 * @author qiuxs   
 * @version 1.0.0
 */
public interface IApptimesClientConfig extends Serializable {

	/**
	 * 接口地址
	 *  
	 * @author qiuxs  
	 * @return
	 */
	public String getUrl();

	/**
	 * appKey
	 *  
	 * @author qiuxs  
	 * @return
	 */
	public String getAppKey();

	/**
	 * appSecret
	 *  
	 * @author qiuxs  
	 * @return
	 */
	public String getAppSecret();

	/**
	 * 获取默认参数
	 *  
	 * @author qiuxs  
	 * @param apiField
	 * @return
	 */
	public String getDefaultParams(String apiField);

}
