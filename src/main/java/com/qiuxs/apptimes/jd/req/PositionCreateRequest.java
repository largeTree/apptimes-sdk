package com.qiuxs.apptimes.jd.req;

import com.qiuxs.apptimes.jd.resp.PositionCreateResponse;
import com.qiuxs.apptimes.request.BaseRequest;
import com.qiuxs.apptimes.request.anno.ApptimesApi;

// TODO: Auto-generated Javadoc
/**
 * 创建京东pid
 * 功能描述: <br/>  
 * 新增原因: TODO<br/>  
 * 新增日期: 2020年9月1日 下午3:40:59 <br/>  
 *  
 * @author qiuxs   
 * @version 1.0.0
 */
@ApptimesApi("jd-union/position-create")
public class PositionCreateRequest extends BaseRequest<PositionCreateResponse> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 4352435282972334983L;

	/**  京东联盟ID. */
	private Long unionId;
	
	/**  京东授权Key. */
	private String key;
	
	/**  1：cps推广位 2：cpc推广位. */
	private Integer unionType;
	/** 站点类型 1网站推广位2.APP推广位3.社交媒体推广位4.聊天工具推广位5.二维码推广 */
	private Integer type;
	
	/**  推广位名称集合，英文,分割；上限50. */
	private String spaceNameList;
	
	/**  站点ID：网站的ID/app ID/snsID 。当type非4(聊天工具)时，siteId必填. */
	private Long siteId;

	/**
	 * Gets the 京东联盟ID.
	 *
	 * @return the 京东联盟ID
	 */
	public Long getUnionId() {
		return unionId;
	}

	/**
	 * Sets the 京东联盟ID.
	 *
	 * @param unionId the new 京东联盟ID
	 */
	public void setUnionId(Long unionId) {
		this.unionId = unionId;
	}

	/**
	 * Gets the 京东授权Key.
	 *
	 * @return the 京东授权Key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * Sets the 京东授权Key.
	 *
	 * @param key the new 京东授权Key
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * Gets the 1：cps推广位 2：cpc推广位.
	 *
	 * @return the 1：cps推广位 2：cpc推广位
	 */
	public Integer getUnionType() {
		return unionType;
	}

	/**
	 * Sets the 1：cps推广位 2：cpc推广位.
	 *
	 * @param unionType the new 1：cps推广位 2：cpc推广位
	 */
	public void setUnionType(Integer unionType) {
		this.unionType = unionType;
	}

	/**
	 * Gets the 站点类型 1网站推广位2.
	 *
	 * @return the 站点类型 1网站推广位2
	 */
	public Integer getType() {
		return type;
	}

	/**
	 * Sets the 站点类型 1网站推广位2.
	 *
	 * @param type the new 站点类型 1网站推广位2
	 */
	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * Gets the 推广位名称集合，英文,分割；上限50.
	 *
	 * @return the 推广位名称集合，英文,分割；上限50
	 */
	public String getSpaceNameList() {
		return spaceNameList;
	}

	/**
	 * Sets the 推广位名称集合，英文,分割；上限50.
	 *
	 * @param spaceNameList the new 推广位名称集合，英文,分割；上限50
	 */
	public void setSpaceNameList(String spaceNameList) {
		this.spaceNameList = spaceNameList;
	}

	/**
	 * Gets the 站点ID：网站的ID/app ID/snsID 。当type非4(聊天工具)时，siteId必填.
	 *
	 * @return the 站点ID：网站的ID/app ID/snsID 。当type非4(聊天工具)时，siteId必填
	 */
	public Long getSiteId() {
		return siteId;
	}

	/**
	 * Sets the 站点ID：网站的ID/app ID/snsID 。当type非4(聊天工具)时，siteId必填.
	 *
	 * @param siteId the new 站点ID：网站的ID/app ID/snsID 。当type非4(聊天工具)时，siteId必填
	 */
	public void setSiteId(Long siteId) {
		this.siteId = siteId;
	}

}
