package com.meyoustu.anet;

public enum HttpRequestMethod {

    GET("GET"),
    POST("POST"),
    PUT("PUT"),
    PATCH("PATCH"),
    DELETE("DELETE"),
    COPY("COPY"),
    HEAD("HEAD"),
    OPTIONS("OPTIONS"),
    LINK("LINK"),
    UNLINK("UNLINK"),
    PURGE("PURGE"),
    LOCK("LOCK"),
    UNLOCK("UNLOCK"),
    PROPFIND("PROPFIND"),
    VIEW("VIEW"),
    TRACE("TRACE"),
    CONNECT("CONNECT");

    private String string;

    HttpRequestMethod(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return string;
    }
}
