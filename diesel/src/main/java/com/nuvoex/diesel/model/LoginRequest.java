package com.nuvoex.diesel.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginRequest {

    @SerializedName("grant_type")
    @Expose
    public String grantType;

    @SerializedName("username")
    @Expose
    public String username;

    @SerializedName("password")
    @Expose
    public String password;

    @SerializedName("identity")
    @Expose
    public String identity;

    public LoginRequest(String username, String password) {
        this.username = username;
        this.password = password;
        this.identity = "vendor";
        this.grantType = "password";
    }

}