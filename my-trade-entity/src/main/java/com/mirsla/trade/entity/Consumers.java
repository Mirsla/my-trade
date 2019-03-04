package com.mirsla.trade.entity;

import java.io.Serializable;
import java.util.Date;

public class Consumers implements Serializable{
	
	private static final long serialVersionUID = -555558646534566580L;
	
    private Integer cId;

    private Integer shopId;

    private Integer uId;

    private String consumerType;

    private String mkey;

    private String createdBy;

    private Date createdWhen;

    private String modifyBy;

    private Date modifyWhen;

    private String cellphoneNo;

    private String wxAccount;

    private String headImg;

    private String openId;

    private String wxaOpenId;

    private String nick;

    private String obtainedMethod;

    private String comeFrom;

    private String comeFromIdent;

    private Boolean validQrcode;

    private Date validQrcodeTime;

    private String comments;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getConsumerType() {
        return consumerType;
    }

    public void setConsumerType(String consumerType) {
        this.consumerType = consumerType;
    }

    public String getMkey() {
        return mkey;
    }

    public void setMkey(String mkey) {
        this.mkey = mkey;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedWhen() {
        return createdWhen;
    }

    public void setCreatedWhen(Date createdWhen) {
        this.createdWhen = createdWhen;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getModifyWhen() {
        return modifyWhen;
    }

    public void setModifyWhen(Date modifyWhen) {
        this.modifyWhen = modifyWhen;
    }

    public String getCellphoneNo() {
        return cellphoneNo;
    }

    public void setCellphoneNo(String cellphoneNo) {
        this.cellphoneNo = cellphoneNo;
    }

    public String getWxAccount() {
        return wxAccount;
    }

    public void setWxAccount(String wxAccount) {
        this.wxAccount = wxAccount;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getWxaOpenId() {
        return wxaOpenId;
    }

    public void setWxaOpenId(String wxaOpenId) {
        this.wxaOpenId = wxaOpenId;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getObtainedMethod() {
        return obtainedMethod;
    }

    public void setObtainedMethod(String obtainedMethod) {
        this.obtainedMethod = obtainedMethod;
    }

    public String getComeFrom() {
        return comeFrom;
    }

    public void setComeFrom(String comeFrom) {
        this.comeFrom = comeFrom;
    }

    public String getComeFromIdent() {
        return comeFromIdent;
    }

    public void setComeFromIdent(String comeFromIdent) {
        this.comeFromIdent = comeFromIdent;
    }

    public Boolean getValidQrcode() {
        return validQrcode;
    }

    public void setValidQrcode(Boolean validQrcode) {
        this.validQrcode = validQrcode;
    }

    public Date getValidQrcodeTime() {
        return validQrcodeTime;
    }

    public void setValidQrcodeTime(Date validQrcodeTime) {
        this.validQrcodeTime = validQrcodeTime;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}