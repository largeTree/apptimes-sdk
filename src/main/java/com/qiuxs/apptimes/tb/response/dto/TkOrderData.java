package com.qiuxs.apptimes.tb.response.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 淘客订单
 * 功能描述: <br/>  
 * 新增原因: TODO<br/>  
 * 新增日期: 2020年3月15日 下午3:13:48 <br/>  
 *  
 * @author qiuxs   
 * @version 1.0.0
 */
public class TkOrderData implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -2078996835435300872L;

	/**  订单在淘宝拍下付款的时间. */
	private Date tbPaidTime;

	/**  订单付款的时间，该时间同步淘宝，可能会略晚于买家在淘宝的订单创建时间. */
	private Date tkPaidTime;

	/**  买家确认收货的付款金额（不包含运费金额）. */
	private BigDecimal payPrice;

	/**  结算预估收入=结算金额*提成。以买家确认收货的付款金额为基数，预估您可能获得的收入。因买家退款、您违规推广等原因，可能与您最终收入不一致。最终收入以月结后您实际收到的为准. */
	private BigDecimal pubShareFee;

	/**  买家通过购物车购买的每个商品对应的订单编号，此订单编号并未在淘宝买家后台透出. */
	private String tradeId;

	/**  二方：佣金收益的第一归属者； 三方：从其他淘宝客佣金中进行分成的推广者. */
	private Integer tkOrderRole;

	/**  订单确认收货后且商家完成佣金支付的时间. */
	private Date tkEarningTime;

	/**  推广位管理下的推广位名称对应的ID，同时也是pid=mm_1_2_3中的“3”这段数字. */
	private Integer adzoneId;

	/**  从结算佣金中分得的收益比率. */
	private BigDecimal pubShareRate;

	/**  维权标签，0 含义为非维权 1 含义为维权订单. */
	private Integer refundTag;

	/**  平台给与的补贴比率，如天猫、淘宝、聚划算等. */
	private BigDecimal subsidyRate;

	/**  提成=收入比率*分成比率。指实际获得收益的比率. */
	private BigDecimal tkTotalRate;

	/**  商品所属的根类目，即一级类目的名称. */
	private String itemCategoryName;

	/**  掌柜旺旺. */
	private String sellerNick;

	/**  推广者的会员id. */
	private Long pubId;

	/**  推广者赚取佣金后支付给阿里妈妈的技术服务费用的比率. */
	private BigDecimal alimamaRate;

	/**  平台出资方，如天猫、淘宝、或聚划算等. */
	private String subsidyType;

	/**  商品图片. */
	private String itemImg;

	/**  付款预估收入=付款金额*提成。指买家付款金额为基数，预估您可能获得的收入。因买家退款等原因，可能与结算预估收入不一致. */
	private BigDecimal pubSharePreFee;

	/**  买家拍下付款的金额（不包含运费金额）. */
	private BigDecimal alipayTotalPrice;

	/**  商品标题. */
	private String itemTitle;

	/**  媒体管理下的对应ID的自定义名称. */
	private String siteName;

	/**  商品数量. */
	private Long itemNum;

	/**  补贴金额=结算金额*补贴比率. */
	private BigDecimal subsidyFee;

	/**  技术服务费=结算金额*收入比率*技术服务费率。推广者赚取佣金后支付给阿里妈妈的技术服务费用. */
	private BigDecimal alimamaShareFee;

	/**  买家在淘宝后台显示的订单编号. */
	private String tradeParentId;

	/**  订单所属平台类型，包括天猫、淘宝、聚划算等. */
	private String orderType;

	/**  订单创建的时间，该时间同步淘宝，可能会略晚于买家在淘宝的订单创建时间. */
	private Date tkCreateTime;

	/**  产品类型. */
	private String flowSource;

	/**  成交平台. */
	private String terminalType;

	/**  通过推广链接达到商品、店铺详情页的点击时间. */
	private Date clickTime;

	/** 已付款：指订单已付款，但还未确认收货 已收货：指订单已确认收货，但商家佣金未支付 已结算：指订单已确认收货，且商家佣金已支付成功 已失效：指订单关闭/订单佣金小于0.01元，订单关闭主要有：1）买家超时未付款； 2）买家付款前，买家/卖家取消了订单；3）订单付款后发起售中退款成功；3：订单结算，12：订单付款， 13：订单失效，14：订单成功 */
	private Integer tkStatus;

	/**  商品单价. */
	private BigDecimal itemPrice;

	/**  商品id. */
	private Long itemId;

	/**  推广位管理下的自定义推广位名称. */
	private String adzoneName;

	/**  佣金比率. */
	private BigDecimal totalCommissionRate;

	/**  商品链接. */
	private String itemLink;

	/**  媒体管理下的ID，同时也是pid=mm_1_2_3中的“2”这段数字. */
	private Long siteId;

	/**  店铺名称. */
	private String sellerShopTitle;

	/**  订单结算的佣金比率+平台的补贴比率. */
	private BigDecimal incomeRate;

	/**  佣金金额=结算金额*佣金比率. */
	private BigDecimal totalCommissionFee;

	/**  预估专项服务费：内容场景专项技术服务费，内容推广者在内容场景进行推广需要支付给阿里妈妈专项的技术服务费用。专项服务费＝付款金额＊专项服务费率。. */
	private BigDecimal tkCommissionPreFeeForMediaPlatform;

	/**  结算专项服务费：内容场景专项技术服务费，内容推广者在内容场景进行推广需要支付给阿里妈妈专项的技术服务费用。专项服务费＝结算金额＊专项服务费率。. */
	private BigDecimal tkCommissionFeeForMediaPlatform;

	/**  专项服务费率：内容场景专项技术服务费率，内容推广者在内容场景进行推广需要按结算金额支付一定比例给阿里妈妈作为内容场景专项技术服务费，用于提供与内容平台实现产品技术对接等服务。. */
	private BigDecimal tkCommissionRateForMediaPlatform;

	/**  会员运营id. */
	private Long specialId;

	/**  渠道关系id. */
	private Long relationId;

	/**  预售时期，用户对预售商品支付定金的付款时间，可能略晚于在淘宝付定金时间. */
	private Date tkDepositTime;

	/**  预售时期，用户对预售商品支付定金的付款时间. */
	private Date tbDepositTime;

	/**  预售时期，用户对预售商品支付的定金金额. */
	private BigDecimal depositPrice;

	/**  开发者调用api的appkey. */
	private String appKey;

	/**  非电商淘系子订单号. */
	private String tpOrderId;

	/**  口碑子订单号. */
	private String alscId;

	/**  口碑父订单号. */
	private String alscPid;

	/**
	 * Gets the 订单在淘宝拍下付款的时间.
	 *
	 * @return the 订单在淘宝拍下付款的时间
	 */
	public Date getTbPaidTime() {
		return tbPaidTime;
	}

	/**
	 * Sets the 订单在淘宝拍下付款的时间.
	 *
	 * @param tbPaidTime the new 订单在淘宝拍下付款的时间
	 */
	public void setTbPaidTime(Date tbPaidTime) {
		this.tbPaidTime = tbPaidTime;
	}

	/**
	 * Gets the 订单付款的时间，该时间同步淘宝，可能会略晚于买家在淘宝的订单创建时间.
	 *
	 * @return the 订单付款的时间，该时间同步淘宝，可能会略晚于买家在淘宝的订单创建时间
	 */
	public Date getTkPaidTime() {
		return tkPaidTime;
	}

	/**
	 * Sets the 订单付款的时间，该时间同步淘宝，可能会略晚于买家在淘宝的订单创建时间.
	 *
	 * @param tkPaidTime the new 订单付款的时间，该时间同步淘宝，可能会略晚于买家在淘宝的订单创建时间
	 */
	public void setTkPaidTime(Date tkPaidTime) {
		this.tkPaidTime = tkPaidTime;
	}

	/**
	 * Gets the 买家确认收货的付款金额（不包含运费金额）.
	 *
	 * @return the 买家确认收货的付款金额（不包含运费金额）
	 */
	public BigDecimal getPayPrice() {
		return payPrice;
	}

	/**
	 * Sets the 买家确认收货的付款金额（不包含运费金额）.
	 *
	 * @param payPrice the new 买家确认收货的付款金额（不包含运费金额）
	 */
	public void setPayPrice(BigDecimal payPrice) {
		this.payPrice = payPrice;
	}

	/**
	 * Gets the 结算预估收入=结算金额*提成。以买家确认收货的付款金额为基数，预估您可能获得的收入。因买家退款、您违规推广等原因，可能与您最终收入不一致。最终收入以月结后您实际收到的为准.
	 *
	 * @return the 结算预估收入=结算金额*提成。以买家确认收货的付款金额为基数，预估您可能获得的收入。因买家退款、您违规推广等原因，可能与您最终收入不一致。最终收入以月结后您实际收到的为准
	 */
	public BigDecimal getPubShareFee() {
		return pubShareFee;
	}

	/**
	 * Sets the 结算预估收入=结算金额*提成。以买家确认收货的付款金额为基数，预估您可能获得的收入。因买家退款、您违规推广等原因，可能与您最终收入不一致。最终收入以月结后您实际收到的为准.
	 *
	 * @param pubShareFee the new 结算预估收入=结算金额*提成。以买家确认收货的付款金额为基数，预估您可能获得的收入。因买家退款、您违规推广等原因，可能与您最终收入不一致。最终收入以月结后您实际收到的为准
	 */
	public void setPubShareFee(BigDecimal pubShareFee) {
		this.pubShareFee = pubShareFee;
	}

	/**
	 * Gets the 买家通过购物车购买的每个商品对应的订单编号，此订单编号并未在淘宝买家后台透出.
	 *
	 * @return the 买家通过购物车购买的每个商品对应的订单编号，此订单编号并未在淘宝买家后台透出
	 */
	public String getTradeId() {
		return tradeId;
	}

	/**
	 * Sets the 买家通过购物车购买的每个商品对应的订单编号，此订单编号并未在淘宝买家后台透出.
	 *
	 * @param tradeId the new 买家通过购物车购买的每个商品对应的订单编号，此订单编号并未在淘宝买家后台透出
	 */
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	/**
	 * Gets the 二方：佣金收益的第一归属者； 三方：从其他淘宝客佣金中进行分成的推广者.
	 *
	 * @return the 二方：佣金收益的第一归属者； 三方：从其他淘宝客佣金中进行分成的推广者
	 */
	public Integer getTkOrderRole() {
		return tkOrderRole;
	}

	/**
	 * Sets the 二方：佣金收益的第一归属者； 三方：从其他淘宝客佣金中进行分成的推广者.
	 *
	 * @param tkOrderRole the new 二方：佣金收益的第一归属者； 三方：从其他淘宝客佣金中进行分成的推广者
	 */
	public void setTkOrderRole(Integer tkOrderRole) {
		this.tkOrderRole = tkOrderRole;
	}

	/**
	 * Gets the 订单确认收货后且商家完成佣金支付的时间.
	 *
	 * @return the 订单确认收货后且商家完成佣金支付的时间
	 */
	public Date getTkEarningTime() {
		return tkEarningTime;
	}

	/**
	 * Sets the 订单确认收货后且商家完成佣金支付的时间.
	 *
	 * @param tkEarningTime the new 订单确认收货后且商家完成佣金支付的时间
	 */
	public void setTkEarningTime(Date tkEarningTime) {
		this.tkEarningTime = tkEarningTime;
	}

	/**
	 * Gets the 推广位管理下的推广位名称对应的ID，同时也是pid=mm_1_2_3中的“3”这段数字.
	 *
	 * @return the 推广位管理下的推广位名称对应的ID，同时也是pid=mm_1_2_3中的“3”这段数字
	 */
	public Integer getAdzoneId() {
		return adzoneId;
	}

	/**
	 * Sets the 推广位管理下的推广位名称对应的ID，同时也是pid=mm_1_2_3中的“3”这段数字.
	 *
	 * @param adzoneId the new 推广位管理下的推广位名称对应的ID，同时也是pid=mm_1_2_3中的“3”这段数字
	 */
	public void setAdzoneId(Integer adzoneId) {
		this.adzoneId = adzoneId;
	}

	/**
	 * Gets the 从结算佣金中分得的收益比率.
	 *
	 * @return the 从结算佣金中分得的收益比率
	 */
	public BigDecimal getPubShareRate() {
		return pubShareRate;
	}

	/**
	 * Sets the 从结算佣金中分得的收益比率.
	 *
	 * @param pubShareRate the new 从结算佣金中分得的收益比率
	 */
	public void setPubShareRate(BigDecimal pubShareRate) {
		this.pubShareRate = pubShareRate;
	}

	/**
	 * Gets the 维权标签，0 含义为非维权 1 含义为维权订单.
	 *
	 * @return the 维权标签，0 含义为非维权 1 含义为维权订单
	 */
	public Integer getRefundTag() {
		return refundTag;
	}

	/**
	 * Sets the 维权标签，0 含义为非维权 1 含义为维权订单.
	 *
	 * @param refundTag the new 维权标签，0 含义为非维权 1 含义为维权订单
	 */
	public void setRefundTag(Integer refundTag) {
		this.refundTag = refundTag;
	}

	/**
	 * Gets the 平台给与的补贴比率，如天猫、淘宝、聚划算等.
	 *
	 * @return the 平台给与的补贴比率，如天猫、淘宝、聚划算等
	 */
	public BigDecimal getSubsidyRate() {
		return subsidyRate;
	}

	/**
	 * Sets the 平台给与的补贴比率，如天猫、淘宝、聚划算等.
	 *
	 * @param subsidyRate the new 平台给与的补贴比率，如天猫、淘宝、聚划算等
	 */
	public void setSubsidyRate(BigDecimal subsidyRate) {
		this.subsidyRate = subsidyRate;
	}

	/**
	 * Gets the 提成=收入比率*分成比率。指实际获得收益的比率.
	 *
	 * @return the 提成=收入比率*分成比率。指实际获得收益的比率
	 */
	public BigDecimal getTkTotalRate() {
		return tkTotalRate;
	}

	/**
	 * Sets the 提成=收入比率*分成比率。指实际获得收益的比率.
	 *
	 * @param tkTotalRate the new 提成=收入比率*分成比率。指实际获得收益的比率
	 */
	public void setTkTotalRate(BigDecimal tkTotalRate) {
		this.tkTotalRate = tkTotalRate;
	}

	/**
	 * Gets the 商品所属的根类目，即一级类目的名称.
	 *
	 * @return the 商品所属的根类目，即一级类目的名称
	 */
	public String getItemCategoryName() {
		return itemCategoryName;
	}

	/**
	 * Sets the 商品所属的根类目，即一级类目的名称.
	 *
	 * @param itemCategoryName the new 商品所属的根类目，即一级类目的名称
	 */
	public void setItemCategoryName(String itemCategoryName) {
		this.itemCategoryName = itemCategoryName;
	}

	/**
	 * Gets the 掌柜旺旺.
	 *
	 * @return the 掌柜旺旺
	 */
	public String getSellerNick() {
		return sellerNick;
	}

	/**
	 * Sets the 掌柜旺旺.
	 *
	 * @param sellerNick the new 掌柜旺旺
	 */
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	/**
	 * Gets the 推广者的会员id.
	 *
	 * @return the 推广者的会员id
	 */
	public Long getPubId() {
		return pubId;
	}

	/**
	 * Sets the 推广者的会员id.
	 *
	 * @param pubId the new 推广者的会员id
	 */
	public void setPubId(Long pubId) {
		this.pubId = pubId;
	}

	/**
	 * Gets the 推广者赚取佣金后支付给阿里妈妈的技术服务费用的比率.
	 *
	 * @return the 推广者赚取佣金后支付给阿里妈妈的技术服务费用的比率
	 */
	public BigDecimal getAlimamaRate() {
		return alimamaRate;
	}

	/**
	 * Sets the 推广者赚取佣金后支付给阿里妈妈的技术服务费用的比率.
	 *
	 * @param alimamaRate the new 推广者赚取佣金后支付给阿里妈妈的技术服务费用的比率
	 */
	public void setAlimamaRate(BigDecimal alimamaRate) {
		this.alimamaRate = alimamaRate;
	}

	/**
	 * Gets the 平台出资方，如天猫、淘宝、或聚划算等.
	 *
	 * @return the 平台出资方，如天猫、淘宝、或聚划算等
	 */
	public String getSubsidyType() {
		return subsidyType;
	}

	/**
	 * Sets the 平台出资方，如天猫、淘宝、或聚划算等.
	 *
	 * @param subsidyType the new 平台出资方，如天猫、淘宝、或聚划算等
	 */
	public void setSubsidyType(String subsidyType) {
		this.subsidyType = subsidyType;
	}

	/**
	 * Gets the 商品图片.
	 *
	 * @return the 商品图片
	 */
	public String getItemImg() {
		return itemImg;
	}

	/**
	 * Sets the 商品图片.
	 *
	 * @param itemImg the new 商品图片
	 */
	public void setItemImg(String itemImg) {
		this.itemImg = itemImg;
	}

	/**
	 * Gets the 付款预估收入=付款金额*提成。指买家付款金额为基数，预估您可能获得的收入。因买家退款等原因，可能与结算预估收入不一致.
	 *
	 * @return the 付款预估收入=付款金额*提成。指买家付款金额为基数，预估您可能获得的收入。因买家退款等原因，可能与结算预估收入不一致
	 */
	public BigDecimal getPubSharePreFee() {
		return pubSharePreFee;
	}

	/**
	 * Sets the 付款预估收入=付款金额*提成。指买家付款金额为基数，预估您可能获得的收入。因买家退款等原因，可能与结算预估收入不一致.
	 *
	 * @param pubSharePreFee the new 付款预估收入=付款金额*提成。指买家付款金额为基数，预估您可能获得的收入。因买家退款等原因，可能与结算预估收入不一致
	 */
	public void setPubSharePreFee(BigDecimal pubSharePreFee) {
		this.pubSharePreFee = pubSharePreFee;
	}

	/**
	 * Gets the 买家拍下付款的金额（不包含运费金额）.
	 *
	 * @return the 买家拍下付款的金额（不包含运费金额）
	 */
	public BigDecimal getAlipayTotalPrice() {
		return alipayTotalPrice;
	}

	/**
	 * Sets the 买家拍下付款的金额（不包含运费金额）.
	 *
	 * @param alipayTotalPrice the new 买家拍下付款的金额（不包含运费金额）
	 */
	public void setAlipayTotalPrice(BigDecimal alipayTotalPrice) {
		this.alipayTotalPrice = alipayTotalPrice;
	}

	/**
	 * Gets the 商品标题.
	 *
	 * @return the 商品标题
	 */
	public String getItemTitle() {
		return itemTitle;
	}

	/**
	 * Sets the 商品标题.
	 *
	 * @param itemTitle the new 商品标题
	 */
	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}

	/**
	 * Gets the 媒体管理下的对应ID的自定义名称.
	 *
	 * @return the 媒体管理下的对应ID的自定义名称
	 */
	public String getSiteName() {
		return siteName;
	}

	/**
	 * Sets the 媒体管理下的对应ID的自定义名称.
	 *
	 * @param siteName the new 媒体管理下的对应ID的自定义名称
	 */
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	/**
	 * Gets the 商品数量.
	 *
	 * @return the 商品数量
	 */
	public Long getItemNum() {
		return itemNum;
	}

	/**
	 * Sets the 商品数量.
	 *
	 * @param itemNum the new 商品数量
	 */
	public void setItemNum(Long itemNum) {
		this.itemNum = itemNum;
	}

	/**
	 * Gets the 补贴金额=结算金额*补贴比率.
	 *
	 * @return the 补贴金额=结算金额*补贴比率
	 */
	public BigDecimal getSubsidyFee() {
		return subsidyFee;
	}

	/**
	 * Sets the 补贴金额=结算金额*补贴比率.
	 *
	 * @param subsidyFee the new 补贴金额=结算金额*补贴比率
	 */
	public void setSubsidyFee(BigDecimal subsidyFee) {
		this.subsidyFee = subsidyFee;
	}

	/**
	 * Gets the 技术服务费=结算金额*收入比率*技术服务费率。推广者赚取佣金后支付给阿里妈妈的技术服务费用.
	 *
	 * @return the 技术服务费=结算金额*收入比率*技术服务费率。推广者赚取佣金后支付给阿里妈妈的技术服务费用
	 */
	public BigDecimal getAlimamaShareFee() {
		return alimamaShareFee;
	}

	/**
	 * Sets the 技术服务费=结算金额*收入比率*技术服务费率。推广者赚取佣金后支付给阿里妈妈的技术服务费用.
	 *
	 * @param alimamaShareFee the new 技术服务费=结算金额*收入比率*技术服务费率。推广者赚取佣金后支付给阿里妈妈的技术服务费用
	 */
	public void setAlimamaShareFee(BigDecimal alimamaShareFee) {
		this.alimamaShareFee = alimamaShareFee;
	}

	/**
	 * Gets the 买家在淘宝后台显示的订单编号.
	 *
	 * @return the 买家在淘宝后台显示的订单编号
	 */
	public String getTradeParentId() {
		return tradeParentId;
	}

	/**
	 * Sets the 买家在淘宝后台显示的订单编号.
	 *
	 * @param tradeParentId the new 买家在淘宝后台显示的订单编号
	 */
	public void setTradeParentId(String tradeParentId) {
		this.tradeParentId = tradeParentId;
	}

	/**
	 * Gets the 订单所属平台类型，包括天猫、淘宝、聚划算等.
	 *
	 * @return the 订单所属平台类型，包括天猫、淘宝、聚划算等
	 */
	public String getOrderType() {
		return orderType;
	}

	/**
	 * Sets the 订单所属平台类型，包括天猫、淘宝、聚划算等.
	 *
	 * @param orderType the new 订单所属平台类型，包括天猫、淘宝、聚划算等
	 */
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	/**
	 * Gets the 订单创建的时间，该时间同步淘宝，可能会略晚于买家在淘宝的订单创建时间.
	 *
	 * @return the 订单创建的时间，该时间同步淘宝，可能会略晚于买家在淘宝的订单创建时间
	 */
	public Date getTkCreateTime() {
		return tkCreateTime;
	}

	/**
	 * Sets the 订单创建的时间，该时间同步淘宝，可能会略晚于买家在淘宝的订单创建时间.
	 *
	 * @param tkCreateTime the new 订单创建的时间，该时间同步淘宝，可能会略晚于买家在淘宝的订单创建时间
	 */
	public void setTkCreateTime(Date tkCreateTime) {
		this.tkCreateTime = tkCreateTime;
	}

	/**
	 * Gets the 产品类型.
	 *
	 * @return the 产品类型
	 */
	public String getFlowSource() {
		return flowSource;
	}

	/**
	 * Sets the 产品类型.
	 *
	 * @param flowSource the new 产品类型
	 */
	public void setFlowSource(String flowSource) {
		this.flowSource = flowSource;
	}

	/**
	 * Gets the 成交平台.
	 *
	 * @return the 成交平台
	 */
	public String getTerminalType() {
		return terminalType;
	}

	/**
	 * Sets the 成交平台.
	 *
	 * @param terminalType the new 成交平台
	 */
	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
	}

	/**
	 * Gets the 通过推广链接达到商品、店铺详情页的点击时间.
	 *
	 * @return the 通过推广链接达到商品、店铺详情页的点击时间
	 */
	public Date getClickTime() {
		return clickTime;
	}

	/**
	 * Sets the 通过推广链接达到商品、店铺详情页的点击时间.
	 *
	 * @param clickTime the new 通过推广链接达到商品、店铺详情页的点击时间
	 */
	public void setClickTime(Date clickTime) {
		this.clickTime = clickTime;
	}

	/**
	 * Gets the 已付款：指订单已付款，但还未确认收货 已收货：指订单已确认收货，但商家佣金未支付 已结算：指订单已确认收货，且商家佣金已支付成功 已失效：指订单关闭/订单佣金小于0.
	 *
	 * @return the 已付款：指订单已付款，但还未确认收货 已收货：指订单已确认收货，但商家佣金未支付 已结算：指订单已确认收货，且商家佣金已支付成功 已失效：指订单关闭/订单佣金小于0
	 */
	public Integer getTkStatus() {
		return tkStatus;
	}

	/**
	 * Sets the 已付款：指订单已付款，但还未确认收货 已收货：指订单已确认收货，但商家佣金未支付 已结算：指订单已确认收货，且商家佣金已支付成功 已失效：指订单关闭/订单佣金小于0.
	 *
	 * @param tkStatus the new 已付款：指订单已付款，但还未确认收货 已收货：指订单已确认收货，但商家佣金未支付 已结算：指订单已确认收货，且商家佣金已支付成功 已失效：指订单关闭/订单佣金小于0
	 */
	public void setTkStatus(Integer tkStatus) {
		this.tkStatus = tkStatus;
	}

	/**
	 * Gets the 商品单价.
	 *
	 * @return the 商品单价
	 */
	public BigDecimal getItemPrice() {
		return itemPrice;
	}

	/**
	 * Sets the 商品单价.
	 *
	 * @param itemPrice the new 商品单价
	 */
	public void setItemPrice(BigDecimal itemPrice) {
		this.itemPrice = itemPrice;
	}

	/**
	 * Gets the 商品id.
	 *
	 * @return the 商品id
	 */
	public Long getItemId() {
		return itemId;
	}

	/**
	 * Sets the 商品id.
	 *
	 * @param itemId the new 商品id
	 */
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	/**
	 * Gets the 推广位管理下的自定义推广位名称.
	 *
	 * @return the 推广位管理下的自定义推广位名称
	 */
	public String getAdzoneName() {
		return adzoneName;
	}

	/**
	 * Sets the 推广位管理下的自定义推广位名称.
	 *
	 * @param adzoneName the new 推广位管理下的自定义推广位名称
	 */
	public void setAdzoneName(String adzoneName) {
		this.adzoneName = adzoneName;
	}

	/**
	 * Gets the 佣金比率.
	 *
	 * @return the 佣金比率
	 */
	public BigDecimal getTotalCommissionRate() {
		return totalCommissionRate;
	}

	/**
	 * Sets the 佣金比率.
	 *
	 * @param totalCommissionRate the new 佣金比率
	 */
	public void setTotalCommissionRate(BigDecimal totalCommissionRate) {
		this.totalCommissionRate = totalCommissionRate;
	}

	/**
	 * Gets the 商品链接.
	 *
	 * @return the 商品链接
	 */
	public String getItemLink() {
		return itemLink;
	}

	/**
	 * Sets the 商品链接.
	 *
	 * @param itemLink the new 商品链接
	 */
	public void setItemLink(String itemLink) {
		this.itemLink = itemLink;
	}

	/**
	 * Gets the 媒体管理下的ID，同时也是pid=mm_1_2_3中的“2”这段数字.
	 *
	 * @return the 媒体管理下的ID，同时也是pid=mm_1_2_3中的“2”这段数字
	 */
	public Long getSiteId() {
		return siteId;
	}

	/**
	 * Sets the 媒体管理下的ID，同时也是pid=mm_1_2_3中的“2”这段数字.
	 *
	 * @param siteId the new 媒体管理下的ID，同时也是pid=mm_1_2_3中的“2”这段数字
	 */
	public void setSiteId(Long siteId) {
		this.siteId = siteId;
	}

	/**
	 * Gets the 店铺名称.
	 *
	 * @return the 店铺名称
	 */
	public String getSellerShopTitle() {
		return sellerShopTitle;
	}

	/**
	 * Sets the 店铺名称.
	 *
	 * @param sellerShopTitle the new 店铺名称
	 */
	public void setSellerShopTitle(String sellerShopTitle) {
		this.sellerShopTitle = sellerShopTitle;
	}

	/**
	 * Gets the 订单结算的佣金比率+平台的补贴比率.
	 *
	 * @return the 订单结算的佣金比率+平台的补贴比率
	 */
	public BigDecimal getIncomeRate() {
		return incomeRate;
	}

	/**
	 * Sets the 订单结算的佣金比率+平台的补贴比率.
	 *
	 * @param incomeRate the new 订单结算的佣金比率+平台的补贴比率
	 */
	public void setIncomeRate(BigDecimal incomeRate) {
		this.incomeRate = incomeRate;
	}

	/**
	 * Gets the 佣金金额=结算金额*佣金比率.
	 *
	 * @return the 佣金金额=结算金额*佣金比率
	 */
	public BigDecimal getTotalCommissionFee() {
		return totalCommissionFee;
	}

	/**
	 * Sets the 佣金金额=结算金额*佣金比率.
	 *
	 * @param totalCommissionFee the new 佣金金额=结算金额*佣金比率
	 */
	public void setTotalCommissionFee(BigDecimal totalCommissionFee) {
		this.totalCommissionFee = totalCommissionFee;
	}

	/**
	 * Gets the 预估专项服务费：内容场景专项技术服务费，内容推广者在内容场景进行推广需要支付给阿里妈妈专项的技术服务费用。专项服务费＝付款金额＊专项服务费率。.
	 *
	 * @return the 预估专项服务费：内容场景专项技术服务费，内容推广者在内容场景进行推广需要支付给阿里妈妈专项的技术服务费用。专项服务费＝付款金额＊专项服务费率。
	 */
	public BigDecimal getTkCommissionPreFeeForMediaPlatform() {
		return tkCommissionPreFeeForMediaPlatform;
	}

	/**
	 * Sets the 预估专项服务费：内容场景专项技术服务费，内容推广者在内容场景进行推广需要支付给阿里妈妈专项的技术服务费用。专项服务费＝付款金额＊专项服务费率。.
	 *
	 * @param tkCommissionPreFeeForMediaPlatform the new 预估专项服务费：内容场景专项技术服务费，内容推广者在内容场景进行推广需要支付给阿里妈妈专项的技术服务费用。专项服务费＝付款金额＊专项服务费率。
	 */
	public void setTkCommissionPreFeeForMediaPlatform(BigDecimal tkCommissionPreFeeForMediaPlatform) {
		this.tkCommissionPreFeeForMediaPlatform = tkCommissionPreFeeForMediaPlatform;
	}

	/**
	 * Gets the 结算专项服务费：内容场景专项技术服务费，内容推广者在内容场景进行推广需要支付给阿里妈妈专项的技术服务费用。专项服务费＝结算金额＊专项服务费率。.
	 *
	 * @return the 结算专项服务费：内容场景专项技术服务费，内容推广者在内容场景进行推广需要支付给阿里妈妈专项的技术服务费用。专项服务费＝结算金额＊专项服务费率。
	 */
	public BigDecimal getTkCommissionFeeForMediaPlatform() {
		return tkCommissionFeeForMediaPlatform;
	}

	/**
	 * Sets the 结算专项服务费：内容场景专项技术服务费，内容推广者在内容场景进行推广需要支付给阿里妈妈专项的技术服务费用。专项服务费＝结算金额＊专项服务费率。.
	 *
	 * @param tkCommissionFeeForMediaPlatform the new 结算专项服务费：内容场景专项技术服务费，内容推广者在内容场景进行推广需要支付给阿里妈妈专项的技术服务费用。专项服务费＝结算金额＊专项服务费率。
	 */
	public void setTkCommissionFeeForMediaPlatform(BigDecimal tkCommissionFeeForMediaPlatform) {
		this.tkCommissionFeeForMediaPlatform = tkCommissionFeeForMediaPlatform;
	}

	/**
	 * Gets the 专项服务费率：内容场景专项技术服务费率，内容推广者在内容场景进行推广需要按结算金额支付一定比例给阿里妈妈作为内容场景专项技术服务费，用于提供与内容平台实现产品技术对接等服务。.
	 *
	 * @return the 专项服务费率：内容场景专项技术服务费率，内容推广者在内容场景进行推广需要按结算金额支付一定比例给阿里妈妈作为内容场景专项技术服务费，用于提供与内容平台实现产品技术对接等服务。
	 */
	public BigDecimal getTkCommissionRateForMediaPlatform() {
		return tkCommissionRateForMediaPlatform;
	}

	/**
	 * Sets the 专项服务费率：内容场景专项技术服务费率，内容推广者在内容场景进行推广需要按结算金额支付一定比例给阿里妈妈作为内容场景专项技术服务费，用于提供与内容平台实现产品技术对接等服务。.
	 *
	 * @param tkCommissionRateForMediaPlatform the new 专项服务费率：内容场景专项技术服务费率，内容推广者在内容场景进行推广需要按结算金额支付一定比例给阿里妈妈作为内容场景专项技术服务费，用于提供与内容平台实现产品技术对接等服务。
	 */
	public void setTkCommissionRateForMediaPlatform(BigDecimal tkCommissionRateForMediaPlatform) {
		this.tkCommissionRateForMediaPlatform = tkCommissionRateForMediaPlatform;
	}

	/**
	 * Gets the 会员运营id.
	 *
	 * @return the 会员运营id
	 */
	public Long getSpecialId() {
		return specialId;
	}

	/**
	 * Sets the 会员运营id.
	 *
	 * @param specialId the new 会员运营id
	 */
	public void setSpecialId(Long specialId) {
		this.specialId = specialId;
	}

	/**
	 * Gets the 渠道关系id.
	 *
	 * @return the 渠道关系id
	 */
	public Long getRelationId() {
		return relationId;
	}

	/**
	 * Sets the 渠道关系id.
	 *
	 * @param relationId the new 渠道关系id
	 */
	public void setRelationId(Long relationId) {
		this.relationId = relationId;
	}

	/**
	 * Gets the 预售时期，用户对预售商品支付定金的付款时间，可能略晚于在淘宝付定金时间.
	 *
	 * @return the 预售时期，用户对预售商品支付定金的付款时间，可能略晚于在淘宝付定金时间
	 */
	public Date getTkDepositTime() {
		return tkDepositTime;
	}

	/**
	 * Sets the 预售时期，用户对预售商品支付定金的付款时间，可能略晚于在淘宝付定金时间.
	 *
	 * @param tkDepositTime the new 预售时期，用户对预售商品支付定金的付款时间，可能略晚于在淘宝付定金时间
	 */
	public void setTkDepositTime(Date tkDepositTime) {
		this.tkDepositTime = tkDepositTime;
	}

	/**
	 * Gets the 预售时期，用户对预售商品支付定金的付款时间.
	 *
	 * @return the 预售时期，用户对预售商品支付定金的付款时间
	 */
	public Date getTbDepositTime() {
		return tbDepositTime;
	}

	/**
	 * Sets the 预售时期，用户对预售商品支付定金的付款时间.
	 *
	 * @param tbDepositTime the new 预售时期，用户对预售商品支付定金的付款时间
	 */
	public void setTbDepositTime(Date tbDepositTime) {
		this.tbDepositTime = tbDepositTime;
	}

	/**
	 * Gets the 预售时期，用户对预售商品支付的定金金额.
	 *
	 * @return the 预售时期，用户对预售商品支付的定金金额
	 */
	public BigDecimal getDepositPrice() {
		return depositPrice;
	}

	/**
	 * Sets the 预售时期，用户对预售商品支付的定金金额.
	 *
	 * @param depositPrice the new 预售时期，用户对预售商品支付的定金金额
	 */
	public void setDepositPrice(BigDecimal depositPrice) {
		this.depositPrice = depositPrice;
	}

	/**
	 * Gets the 开发者调用api的appkey.
	 *
	 * @return the 开发者调用api的appkey
	 */
	public String getAppKey() {
		return appKey;
	}

	/**
	 * Sets the 开发者调用api的appkey.
	 *
	 * @param appKey the new 开发者调用api的appkey
	 */
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	/**
	 * Gets the 非电商淘系子订单号.
	 *
	 * @return the 非电商淘系子订单号
	 */
	public String getTpOrderId() {
		return tpOrderId;
	}

	/**
	 * Sets the 非电商淘系子订单号.
	 *
	 * @param tpOrderId the new 非电商淘系子订单号
	 */
	public void setTpOrderId(String tpOrderId) {
		this.tpOrderId = tpOrderId;
	}

	/**
	 * Gets the 口碑子订单号.
	 *
	 * @return the 口碑子订单号
	 */
	public String getAlscId() {
		return alscId;
	}

	/**
	 * Sets the 口碑子订单号.
	 *
	 * @param alscId the new 口碑子订单号
	 */
	public void setAlscId(String alscId) {
		this.alscId = alscId;
	}

	/**
	 * Gets the 口碑父订单号.
	 *
	 * @return the 口碑父订单号
	 */
	public String getAlscPid() {
		return alscPid;
	}

	/**
	 * Sets the 口碑父订单号.
	 *
	 * @param alscPid the new 口碑父订单号
	 */
	public void setAlscPid(String alscPid) {
		this.alscPid = alscPid;
	}

}
