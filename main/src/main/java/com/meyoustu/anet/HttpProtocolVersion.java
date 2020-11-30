package com.meyoustu.anet;

public enum HttpProtocolVersion {
    HTTP_0_9("0.9"),
    HTTP_1_0("1.0"),
    HTTP_1_1("1.1"),
    HTTP_2_0("2.0"),
    HTTP_3_0("3.0");

    private String versionName;

    HttpProtocolVersion(String versionName) {
        this.versionName = versionName;
    }


    @Override
    public String toString() {
        return versionName;
    }
}
