package com.icloud.model;

/**
 * 公众号
 * @author luoqw
 * 2016-9-5下午3:37:24
 */
public class MerchantsMp {
    private Integer id;

    private String wxGh;//微信公众号原始gh号

    private String wxAppId;//公众号APPid

    private String wxAppSecret;//公众号APP密钥

    private String wxMerchantsNo;//公众号对应的商户号

    private String wxMerchantsKey;//商户密钥

    private String wxName;//公众号名称

    private String useStatus;//使用状态(0不可用，1可用)

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWxGh() {
        return wxGh;
    }

    public void setWxGh(String wxGh) {
        this.wxGh = wxGh == null ? null : wxGh.trim();
    }

    public String getWxAppId() {
        return wxAppId;
    }

    public void setWxAppId(String wxAppId) {
        this.wxAppId = wxAppId == null ? null : wxAppId.trim();
    }

    public String getWxAppSecret() {
        return wxAppSecret;
    }

    public void setWxAppSecret(String wxAppSecret) {
        this.wxAppSecret = wxAppSecret == null ? null : wxAppSecret.trim();
    }

    public String getWxMerchantsNo() {
        return wxMerchantsNo;
    }

    public void setWxMerchantsNo(String wxMerchantsNo) {
        this.wxMerchantsNo = wxMerchantsNo == null ? null : wxMerchantsNo.trim();
    }

    public String getWxMerchantsKey() {
        return wxMerchantsKey;
    }

    public void setWxMerchantsKey(String wxMerchantsKey) {
        this.wxMerchantsKey = wxMerchantsKey == null ? null : wxMerchantsKey.trim();
    }

    public String getWxName() {
        return wxName;
    }

    public void setWxName(String wxName) {
        this.wxName = wxName == null ? null : wxName.trim();
    }

    public String getUseStatus() {
        return useStatus;
    }

    public void setUseStatus(String useStatus) {
        this.useStatus = useStatus == null ? null : useStatus.trim();
    }
}