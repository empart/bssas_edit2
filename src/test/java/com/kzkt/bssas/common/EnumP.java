package com.kzkt.bssas.common;

/**
 * p：登录路径
 */
public enum EnumP {
    WEB(1,"web"),
    ANDROID(2,"ANDROID"),
    IPHONE(3,"IPHONE"),
    ANDROID_PAD(4,"安卓pad"),
    IPAD(5,"IPAD"),
    H5(8,"H5"),
    WEIXIN_SERVER(9,"微信服务号"),
    WEIXIN_MINI_PROGRAM(10,"微信小程序"),
    ORG_ADMIN_PLATFORM(11, "机构管理后台"),
    SUPER_ADMIN_PLATFORM(12,"超管后台" );

    private Integer p;

    private String description;

    EnumP(Integer p, String description) {
        this.p = p;
        this.description = description;
    }

    public Integer getP() {
        return p;
    }

    public String getDescription() {
        return description;
    }

}
