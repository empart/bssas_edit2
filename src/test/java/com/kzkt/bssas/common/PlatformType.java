package com.kzkt.bssas.common;

/**
 * PlatformType：机构类型
 */
public enum PlatformType {

    BSAAS(10,"机构类型：BSAAS");

    private Integer platformType;

    private String description;

    PlatformType(Integer platformType, String description) {
        this.platformType = platformType;
        this.description = description;
    }

    public Integer getPlatformType() {
        return platformType;
    }

    public String getDescription() {
        return description;
    }
}
