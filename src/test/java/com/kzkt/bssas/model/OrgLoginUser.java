package com.kzkt.bssas.model;

import lombok.Data;

@Data
public class OrgLoginUser {

    private String username;

    private String password;

    private Integer p;

    private Integer d;

    private String deviceId;

    private String platformTypes;

    public OrgLoginUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public OrgLoginUser(String username, String password, String platformTypes) {
        this.username = username;
        this.password = password;
        this.platformTypes = platformTypes;
    }
}

