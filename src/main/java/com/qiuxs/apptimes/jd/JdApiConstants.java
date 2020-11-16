package com.qiuxs.apptimes.jd;

import com.qiuxs.cuteframework.core.basic.code.annotation.Code;
import com.qiuxs.cuteframework.core.basic.code.annotation.CodeDomain;

public class JdApiConstants {

	@CodeDomain
	public static final String ELITE_ID_DOMAIN = "jd.eliteId.domain";

	@Code(domain = ELITE_ID_DOMAIN, caption = "好券好物")
	public static final int GOOD_COUPON = 1;
	@Code(domain = ELITE_ID_DOMAIN, caption = "精选卖场")
	public static final int JX_MARKET = 2;
	@Code(domain = ELITE_ID_DOMAIN, caption = "9.9包邮")
	public static final int SHIP_FREE_99 = 10;
	@Code(domain = ELITE_ID_DOMAIN, caption = "京东配送")
	public static final int JD_SHIP = 15;
	@Code(domain = ELITE_ID_DOMAIN, caption = "实时热销榜")
	public static final int REAL_TIME_HOT_GOODS = 22;
	@Code(domain = ELITE_ID_DOMAIN, caption = "为你推荐")
	public static final int RECMD_FOR_YOU = 23;
	@Code(domain = ELITE_ID_DOMAIN, caption = "数码家电")
	public static final int DIGITAL_APP = 24;
	@Code(domain = ELITE_ID_DOMAIN, caption = "超市")
	public static final int SUPER_MARKET = 25;
	@Code(domain = ELITE_ID_DOMAIN, caption = "母婴玩具")
	public static final int MB_TOYS = 26;
	@Code(domain = ELITE_ID_DOMAIN, caption = "家具日用")
	public static final int FURNITURE = 27;
	@Code(domain = ELITE_ID_DOMAIN, caption = "美妆穿搭")
	public static final int MAKE_UP = 28;
	@Code(domain = ELITE_ID_DOMAIN, caption = "图书文具")
	public static final int BOOKS = 30;
	/** 今日必推 */
	@Code(domain = ELITE_ID_DOMAIN, caption = "今日必买")
	public static final int TODAY_HOTS = 31;
	@Code(domain = ELITE_ID_DOMAIN, caption = "京东好物")
	public static final int JD_GOODS = 32;
	@Code(domain = ELITE_ID_DOMAIN, caption = "京东秒杀")
	public static final int JD_SECKILL = 33;
	@Code(domain = ELITE_ID_DOMAIN, caption = "拼购商品")
	public static final int PG_GOODS = 34;
	/** 高收益榜 */
	@Code(domain = ELITE_ID_DOMAIN, caption = "买的最多")
	public static final int HIGH_REBATE = 40;
	@Code(domain = ELITE_ID_DOMAIN, caption = "自营热卖榜")
	public static final int JD_SALF_HOT_SALE = 41;
	@Code(domain = ELITE_ID_DOMAIN, caption = "秒杀进行中")
	public static final int SECKILLING = 108;
	/** 自营 */
	@Code(domain = ELITE_ID_DOMAIN, caption = "自营专区")
	public static final int NEW_GOODS = 109;
	@Code(domain = ELITE_ID_DOMAIN, caption = "京东爆品")
	public static final int JD_HOT = 112;
	@Code(domain = ELITE_ID_DOMAIN, caption = "首购商品")
	public static final int FIRST_GOODS = 125;
	/** 高佣榜单 */
	@Code(domain = ELITE_ID_DOMAIN, caption = "高返利榜")
	public static final int HIGH_REBATE_BD = 129;
	@Code(domain = ELITE_ID_DOMAIN, caption = "视频商品")
	public static final int VIDEL_GOODS = 130;
	@Code(domain = ELITE_ID_DOMAIN, caption = "历史最低价商品榜")
	public static final int HIS_LOWER_GOODS = 153;

}
