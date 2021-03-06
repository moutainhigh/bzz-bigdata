/**
 * Copyright &copy; 2015-2020 <a href="http://www.xiaostarstar.com/">XSS</a> All rights reserved.
 */
package com.bzz.cloud.model;


import java.util.Date;

/**
 * 企业核心数据Entity
 * @author admin
 * @version 2018-03-03
 */
public class CCustSale  {

	private String id;
	private String gongchang;		// 工厂
	private String daqu;		// 大区
	private String chengshi;		// 城市群
	private String yewuyuan;		// 业务员
	private String custNo;		// 客户代码
	private String custName;		// 客户名称
	private String dapinleimiaoshu;		// 大品类描述
	private String yijipinleimiaoshu;		// 一级品类描述
	private String erjipinleimiaoshu;		// 二级品类描述
	private String sanjipinleimiaoshu;		// 三级品类描述
	private String chanpinxianmiaoshu;		// 产品线描述
	private String wuliaobianma;		// 物料编码
	private String wuliaomiaoshu;		// 物料描述
	private Double xiang;		// 箱
	private Double dun;		// 吨
	private Double xiaoshoushouru;		// 销售收入
	private Double jingzhi;		// 净值
	private Double shuie;		// 税额
	private Double zhanlvjine;		// 战略价金额
	private Double zhekoujine;		// 折扣金额
	private Double zhekoubili;		// 折扣百分比
	private String shoudafangjiancheng;		// 售达方简称
	private Date fapiaoshiqi;		// 出具发票日期
	private String dingdanbianhao;		// 订单号码
	private Date danjuriqi;		// 单据日期
	private String kucundidian;		// 库存地点
	private String caigoubianhao;		// 采购订单号码
	private Date beginFapiaoshiqi;		// 开始 出具发票日期
	private Date endFapiaoshiqi;		// 结束 出具发票日期

	protected String remarks;	// 备注
	protected String createBy;	// 创建者
	protected Date createDate;	// 创建日期
	protected String updateBy;	// 更新者
	protected Date updateDate;	// 更新日期
	protected String delFlag; 	// 删除标记（0：正常；1：删除；2：审核）


	public CCustSale() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGongchang() {
		return gongchang;
	}

	public void setGongchang(String gongchang) {
		this.gongchang = gongchang;
	}

	public String getDaqu() {
		return daqu;
	}

	public void setDaqu(String daqu) {
		this.daqu = daqu;
	}

	public String getChengshi() {
		return chengshi;
	}

	public void setChengshi(String chengshi) {
		this.chengshi = chengshi;
	}

	public String getYewuyuan() {
		return yewuyuan;
	}

	public void setYewuyuan(String yewuyuan) {
		this.yewuyuan = yewuyuan;
	}

	public String getCustNo() {
		return custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getDapinleimiaoshu() {
		return dapinleimiaoshu;
	}

	public void setDapinleimiaoshu(String dapinleimiaoshu) {
		this.dapinleimiaoshu = dapinleimiaoshu;
	}

	public String getYijipinleimiaoshu() {
		return yijipinleimiaoshu;
	}

	public void setYijipinleimiaoshu(String yijipinleimiaoshu) {
		this.yijipinleimiaoshu = yijipinleimiaoshu;
	}

	public String getErjipinleimiaoshu() {
		return erjipinleimiaoshu;
	}

	public void setErjipinleimiaoshu(String erjipinleimiaoshu) {
		this.erjipinleimiaoshu = erjipinleimiaoshu;
	}

	public String getSanjipinleimiaoshu() {
		return sanjipinleimiaoshu;
	}

	public void setSanjipinleimiaoshu(String sanjipinleimiaoshu) {
		this.sanjipinleimiaoshu = sanjipinleimiaoshu;
	}

	public String getChanpinxianmiaoshu() {
		return chanpinxianmiaoshu;
	}

	public void setChanpinxianmiaoshu(String chanpinxianmiaoshu) {
		this.chanpinxianmiaoshu = chanpinxianmiaoshu;
	}

	public String getWuliaobianma() {
		return wuliaobianma;
	}

	public void setWuliaobianma(String wuliaobianma) {
		this.wuliaobianma = wuliaobianma;
	}

	public String getWuliaomiaoshu() {
		return wuliaomiaoshu;
	}

	public void setWuliaomiaoshu(String wuliaomiaoshu) {
		this.wuliaomiaoshu = wuliaomiaoshu;
	}

	public Double getXiang() {
		return xiang;
	}

	public void setXiang(Double xiang) {
		this.xiang = xiang;
	}

	public Double getDun() {
		return dun;
	}

	public void setDun(Double dun) {
		this.dun = dun;
	}

	public Double getXiaoshoushouru() {
		return xiaoshoushouru;
	}

	public void setXiaoshoushouru(Double xiaoshoushouru) {
		this.xiaoshoushouru = xiaoshoushouru;
	}

	public Double getJingzhi() {
		return jingzhi;
	}

	public void setJingzhi(Double jingzhi) {
		this.jingzhi = jingzhi;
	}

	public Double getShuie() {
		return shuie;
	}

	public void setShuie(Double shuie) {
		this.shuie = shuie;
	}

	public Double getZhanlvjine() {
		return zhanlvjine;
	}

	public void setZhanlvjine(Double zhanlvjine) {
		this.zhanlvjine = zhanlvjine;
	}

	public Double getZhekoujine() {
		return zhekoujine;
	}

	public void setZhekoujine(Double zhekoujine) {
		this.zhekoujine = zhekoujine;
	}

	public Double getZhekoubili() {
		return zhekoubili;
	}

	public void setZhekoubili(Double zhekoubili) {
		this.zhekoubili = zhekoubili;
	}

	public String getShoudafangjiancheng() {
		return shoudafangjiancheng;
	}

	public void setShoudafangjiancheng(String shoudafangjiancheng) {
		this.shoudafangjiancheng = shoudafangjiancheng;
	}

	public Date getFapiaoshiqi() {
		return fapiaoshiqi;
	}

	public void setFapiaoshiqi(Date fapiaoshiqi) {
		this.fapiaoshiqi = fapiaoshiqi;
	}

	public String getDingdanbianhao() {
		return dingdanbianhao;
	}

	public void setDingdanbianhao(String dingdanbianhao) {
		this.dingdanbianhao = dingdanbianhao;
	}

	public Date getDanjuriqi() {
		return danjuriqi;
	}

	public void setDanjuriqi(Date danjuriqi) {
		this.danjuriqi = danjuriqi;
	}

	public String getKucundidian() {
		return kucundidian;
	}

	public void setKucundidian(String kucundidian) {
		this.kucundidian = kucundidian;
	}

	public String getCaigoubianhao() {
		return caigoubianhao;
	}

	public void setCaigoubianhao(String caigoubianhao) {
		this.caigoubianhao = caigoubianhao;
	}

	public Date getBeginFapiaoshiqi() {
		return beginFapiaoshiqi;
	}

	public void setBeginFapiaoshiqi(Date beginFapiaoshiqi) {
		this.beginFapiaoshiqi = beginFapiaoshiqi;
	}

	public Date getEndFapiaoshiqi() {
		return endFapiaoshiqi;
	}

	public void setEndFapiaoshiqi(Date endFapiaoshiqi) {
		this.endFapiaoshiqi = endFapiaoshiqi;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
}