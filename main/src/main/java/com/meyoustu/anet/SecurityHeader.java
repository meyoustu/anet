package com.meyoustu.anet;

interface SecurityHeader {
    String CROSS_ORIGIN_EMBEDDER_POLICY = "Cross-Origin-Embedder-Policy";
    String CROSS_ORIGIN_OPENER_POLICY = "Cross-Origin-Opener-Policy";
    String CROSS_ORIGIN_RESOURCE_POLICY = "Cross-Origin-Resource-Policy";
    String CONTENT_SECURITY_POLICY = "Content-Security-Policy";
    String CONTENT_SECURITY_POLICY_REPORT_ONLY = "Content-Security-Policy-Report-Only";
    String EXPECT_CT = "Expect-CT";
    String FEATURE_POLICY = "Feature-Policy";
    String ORIGIN_ISOLATION = "Origin-Isolation";
    String STRICT_TRANSPORT_SECURITY = "Strict-Transport-Security";
    String UPGRADE_INSECURE_REQUESTS = "Upgrade-Insecure-Requests";
    String X_CONTENT_TYPE_OPTIONS = "X-Content-Type-Options";
    String X_DOWNLOAD_OPTIONS = "X-Download-Options";
    String X_FRAME_OPTIONS = "X-Frame-Options";
    String X_PERMITTED_CROSS_DOMAIN_POLICIES = "X-Permitted-Cross-Domain-Policies";
    String X_POWERED_BY = "X-Powered-By";
    String X_XSS_PROTECTION = "X-XSS-Protection";
}
