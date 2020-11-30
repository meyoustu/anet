package com.meyoustu.anet;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Date;
import java.util.LinkedHashMap;

public class HttpHeader extends LinkedHashMap<String, String> implements HttpHeaderConstants {

    private FirstLine firstLine;

    public HttpHeader setFirstLine(FirstLine firstLine) {
        this.firstLine = firstLine;
        return this;
    }


    public HttpHeader putWWWAuthenticate(String wwwAuthenticate) {
        put(WWW_AUTHENTICATE, wwwAuthenticate);
        return this;
    }


    public HttpHeader putAuthorization(String authorization) {
        put(AUTHORIZATION, authorization);
        return this;
    }

    public HttpHeader putProxyAuthenticate(String proxyAuthenticate) {
        put(PROXY_AUTHENTICATE, proxyAuthenticate);
        return this;
    }

    public HttpHeader putProxyAuthorization(String proxyAuthorization) {
        put(PROXY_AUTHORIZATION, proxyAuthorization);
        return this;
    }

    public HttpHeader putAge(String age) {
        put(AGE, age);
        return this;
    }

    public HttpHeader putCacheControl(String cacheControl) {
        put(CACHE_CONTROL, cacheControl);
        return this;
    }

    public HttpHeader putClearSiteData(String clearSiteData) {
        put(CLEAR_SITE_DATA, clearSiteData);
        return this;
    }

    public HttpHeader putExpires(String expires) {
        put(EXPIRES, expires);
        return this;
    }

    public HttpHeader putPragma(String pragma) {
        put(PRAGMA, pragma);
        return this;
    }

    public HttpHeader putWarning(String warning) {
        put(WARNING, warning);
        return this;
    }

    public HttpHeader putAcceptCH(String acceptCH) {
        put(ACCEPT_CH, acceptCH);
        return this;
    }

    public HttpHeader putAcceptCHLifetime(String acceptCHLifetime) {
        put(ACCEPT_CH_LIFETIME, acceptCHLifetime);
        return this;
    }

    public HttpHeader putEarlyData(String earlyData) {
        put(EARLY_DATA, earlyData);
        return this;
    }

    public HttpHeader putContentDPR(String contentDPR) {
        put(CONTENT_DPR, contentDPR);
        return this;
    }

    public HttpHeader putDPR(String dpr) {
        put(DPR, dpr);
        return this;
    }

    public HttpHeader putDeviceMemory(String deviceMemory) {
        put(DEVICE_MEMORY, deviceMemory);
        return this;
    }

    public HttpHeader putSaveData(String saveData) {
        put(SAVE_DATA, saveData);
        return this;
    }

    public HttpHeader putViewportWidth(String viewportWidth) {
        put(VIEWPORT_WIDTH, viewportWidth);
        return this;
    }

    public HttpHeader putWidth(String width) {
        put(WIDTH, width);
        return this;
    }

    public HttpHeader putLastModified(String lastModified) {
        put(LAST_MODIFIED, lastModified);
        return this;
    }

    public HttpHeader putETag(String eTag) {
        put(ETAG, eTag);
        return this;
    }

    public HttpHeader putIfMatch(String ifMatch) {
        put(IF_MATCH, ifMatch);
        return this;
    }

    public HttpHeader putIfNoneMatch(String ifNoneMatch) {
        put(IF_NONE_MATCH, ifNoneMatch);
        return this;
    }

    public HttpHeader putIfModifiedSince(String ifModifiedSince) {
        put(IF_MODIFIED_SINCE, ifModifiedSince);
        return this;
    }

    public HttpHeader putIfUnmodifiedSince(String ifUnmodifiedSince) {
        put(IF_UNMODIFIED_SINCE, ifUnmodifiedSince);
        return this;
    }

    public HttpHeader putVary(String vary) {
        put(VARY, vary);
        return this;
    }

    public HttpHeader putConnection(String connection) {
        put(CONNECTION, connection);
        return this;
    }

    public HttpHeader putKeepAlive(String keepAlive) {
        put(KEEP_ALIVE, keepAlive);
        return this;
    }

    public HttpHeader putAccept(String accept) {
        put(ACCEPT, accept);
        return this;
    }

    public HttpHeader putAcceptCharset(String acceptCharset) {
        put(ACCEPT_CHARSET, acceptCharset);
        return this;
    }


    public HttpHeader putAcceptEncoding(String acceptEncoding) {
        put(ACCEPT_ENCODING, acceptEncoding);
        return this;
    }

    public HttpHeader putAcceptLanguage(String acceptLanguage) {
        put(ACCEPT_LANGUAGE, acceptLanguage);
        return this;
    }

    public HttpHeader putExpect(String expect) {
        put(EXPECT, expect);
        return this;
    }

    public HttpHeader putMaxForwards(String maxForwards) {
        put(MAX_FORWARDS, maxForwards);
        return this;
    }

    public HttpHeader putCookie(String cookie) {
        put(COOKIE, cookie);
        return this;
    }

    public HttpHeader putSetCookie(String setCookie) {
        put(SET_COOKIE, setCookie);
        return this;
    }

    public HttpHeader putCookie2(String cookie2) {
        put(COOKIE2, cookie2);
        return this;
    }

    public HttpHeader putSetCookie2(String setCookie2) {
        put(SET_COOKIE2, setCookie2);
        return this;
    }

    public HttpHeader putAccessControlAllowOrigin(String accessControlAllowOrigin) {
        put(ACCESS_CONTROL_ALLOW_ORIGIN, accessControlAllowOrigin);
        return this;
    }


    public HttpHeader putAccessControlAllowCredentials(String accessControlAllowCredentials) {
        put(ACCESS_CONTROL_ALLOW_CREDENTIALS, accessControlAllowCredentials);
        return this;
    }


    public HttpHeader putAccessControlAllowHeaders(String accessControlAllowHeaders) {
        put(ACCESS_CONTROL_ALLOW_HEADERS, accessControlAllowHeaders);
        return this;
    }

    public HttpHeader putAccessControlAllowMethods(String accessControlAllowMethods) {
        put(ACCESS_CONTROL_ALLOW_METHODS, accessControlAllowMethods);
        return this;
    }

    public HttpHeader putAccessControlExposeHeaders(String accessControlExposeHeaders) {
        put(ACCESS_CONTROL_EXPOSE_HEADERS, accessControlExposeHeaders);
        return this;
    }

    public HttpHeader putAccessControlMaxAge(String accessControlMaxAge) {
        put(ACCESS_CONTROL_MAX_AGE, accessControlMaxAge);
        return this;
    }

    public HttpHeader putAccessControlRequestHeaders(String accessControlRequestHeaders) {
        put(ACCESS_CONTROL_REQUEST_HEADERS, accessControlRequestHeaders);
        return this;
    }

    public HttpHeader putAccessControlRequestMethod(String accessControlRequestMethod) {
        put(ACCESS_CONTROL_REQUEST_METHOD, accessControlRequestMethod);
        return this;
    }

    public HttpHeader putOrigin(String origin) {
        put(ORIGIN, origin);
        return this;
    }

    public HttpHeader putTimingAllowOrigin(String timingAllowOrigin) {
        put(TIMING_ALLOW_ORIGIN, timingAllowOrigin);
        return this;
    }

    public HttpHeader putDNT(String dnt) {
        put(DNT, dnt);
        return this;
    }

    public HttpHeader putTk(String tk) {
        put(TK, tk);
        return this;
    }

    public HttpHeader putContentDisposition(String contentDisposition) {
        put(CONTENT_DISPOSITION, contentDisposition);
        return this;
    }

    public HttpHeader putContentLength(String contentLength) {
        put(CONTENT_LENGTH, contentLength);
        return this;
    }

    public HttpHeader putContentLength(long contentLength) {
        return putContentLength(String.valueOf(contentLength));
    }

    public HttpHeader putContentType(String contentType) {
        put(CONTENT_TYPE, contentType);
        return this;
    }

    public HttpHeader putContentEncoding(String contentEncoding) {
        put(CONTENT_ENCODING, contentEncoding);
        return this;
    }

    public HttpHeader putContentLanguage(String contentLanguage) {
        put(CONTENT_LANGUAGE, contentLanguage);
        return this;
    }

    public HttpHeader putContentLocation(String contentLocation) {
        put(CONTENT_LOCATION, contentLocation);
        return this;
    }

    public HttpHeader putForwarded(String forwarded) {
        put(FORWARDED, forwarded);
        return this;
    }

    public HttpHeader putXForwardedFor(String xForwardedFor) {
        put(X_FORWARDED_FOR, xForwardedFor);
        return this;
    }

    public HttpHeader putXForwardedHost(String xForwardedHost) {
        put(X_FORWARDED_HOST, xForwardedHost);
        return this;
    }

    public HttpHeader putXForwardedProto(String xForwardedProto) {
        put(X_FORWARDED_PROTO, xForwardedProto);
        return this;
    }

    public HttpHeader putVia(String via) {
        put(VIA, via);
        return this;
    }

    public HttpHeader putLocation(String location) {
        put(LOCATION, location);
        return this;
    }

    public HttpHeader putFrom(String from) {
        put(FROM, from);
        return this;
    }

    public HttpHeader putHost(String host) {
        put(HOST, host);
        return this;
    }

    public HttpHeader putReferer(String referer) {
        put(REFERER, referer);
        return this;
    }

    public HttpHeader putReferrerPolicy(String referrerPolicy) {
        put(REFERRER_POLICY, referrerPolicy);
        return this;
    }

    public HttpHeader putUserAgent(String userAgent) {
        put(USER_AGENT, userAgent);
        return this;
    }

    public HttpHeader putAllow(String allow) {
        put(ALLOW, allow);
        return this;
    }

    public HttpHeader putServer(String server) {
        put(SERVER, server);
        return this;
    }

    public HttpHeader putAcceptRanges(String acceptRanges) {
        put(ACCEPT_RANGES, acceptRanges);
        return this;
    }

    public HttpHeader putRange(String range) {
        put(RANGE, range);
        return this;
    }

    public HttpHeader putIfRange(String ifRange) {
        put(IF_RANGE, ifRange);
        return this;
    }

    public HttpHeader putContentRange(String contentRange) {
        put(CONTENT_RANGE, contentRange);
        return this;
    }

    public HttpHeader putCrossOriginEmbedderPolicy(String crossOriginEmbedderPolicy) {
        put(CROSS_ORIGIN_EMBEDDER_POLICY, crossOriginEmbedderPolicy);
        return this;
    }

    public HttpHeader putCrossOriginOpenerPolicy(String crossOriginOpenerPolicy) {
        put(CROSS_ORIGIN_OPENER_POLICY, crossOriginOpenerPolicy);
        return this;
    }

    public HttpHeader putCrossOriginResourcePolicy(String crossOriginResourcePolicy) {
        put(CROSS_ORIGIN_RESOURCE_POLICY, crossOriginResourcePolicy);
        return this;
    }

    public HttpHeader putContentSecurityPolicy(String contentSecurityPolicy) {
        put(CONTENT_SECURITY_POLICY, contentSecurityPolicy);
        return this;
    }

    public HttpHeader putContentSecurityPolicyReportOnly(String contentSecurityPolicyReportOnly) {
        put(CONTENT_SECURITY_POLICY_REPORT_ONLY, contentSecurityPolicyReportOnly);
        return this;
    }

    public HttpHeader putExpectCT(String expectCT) {
        put(EXPECT_CT, expectCT);
        return this;
    }

    public HttpHeader putFeaturePolicy(String featurePolicy) {
        put(FEATURE_POLICY, featurePolicy);
        return this;
    }

    public HttpHeader putOriginIsolation(String originIsolation) {
        put(ORIGIN_ISOLATION, originIsolation);
        return this;
    }

    public HttpHeader putStrictTransportSecurity(String strictTransportSecurity) {
        put(STRICT_TRANSPORT_SECURITY, strictTransportSecurity);
        return this;
    }

    public HttpHeader putUpgradeInsecureRequests(String upgradeInsecureRequests) {
        put(UPGRADE_INSECURE_REQUESTS, upgradeInsecureRequests);
        return this;
    }

    public HttpHeader putXContentTypeOptions(String xContentTypeOptions) {
        put(X_CONTENT_TYPE_OPTIONS, xContentTypeOptions);
        return this;
    }

    public HttpHeader putXDownloadOptions(String xDownloadOptions) {
        put(X_DOWNLOAD_OPTIONS, xDownloadOptions);
        return this;
    }

    public HttpHeader putXFrameOptions(String xFrameOptions) {
        put(X_FRAME_OPTIONS, xFrameOptions);
        return this;
    }

    public HttpHeader putXPermittedCrossDomainPolicies(String xPermittedCrossDomainPolicies) {
        put(X_PERMITTED_CROSS_DOMAIN_POLICIES, xPermittedCrossDomainPolicies);
        return this;
    }

    public HttpHeader putXPoweredBy(String xPoweredBy) {
        put(X_POWERED_BY, xPoweredBy);
        return this;
    }

    public HttpHeader putXXSSProtection(String xXSSProtection) {
        put(X_XSS_PROTECTION, xXSSProtection);
        return this;
    }

    public HttpHeader putPublicKeyPins(String publicKeyPins) {
        put(PUBLIC_KEY_PINS, publicKeyPins);
        return this;
    }

    public HttpHeader putPublicKeyPinsReportOnly(String publicKeyPinsReportOnly) {
        put(PUBLIC_KEY_PINS_REPORT_ONLY, publicKeyPinsReportOnly);
        return this;
    }

    public HttpHeader putSecFetchSite(String secFetchSite) {
        put(SEC_FETCH_SITE, secFetchSite);
        return this;
    }

    public HttpHeader putSecFetchMode(String secFetchMode) {
        put(SEC_FETCH_MODE, secFetchMode);
        return this;
    }

    public HttpHeader putSecFetchUser(String secFetchUser) {
        put(SEC_FETCH_USER, secFetchUser);
        return this;
    }

    public HttpHeader putSecFetchDest(String secFetchDest) {
        put(SEC_FETCH_DEST, secFetchDest);
        return this;
    }

    public HttpHeader putLastEventID(String lastEventID) {
        put(LAST_EVENT_ID, lastEventID);
        return this;
    }

    public HttpHeader putNEL(String nel) {
        put(NEL, nel);
        return this;
    }

    public HttpHeader putPingFrom(String pingFrom) {
        put(PING_FROM, pingFrom);
        return this;
    }

    public HttpHeader putPingTo(String pingTo) {
        put(PING_TO, pingTo);
        return this;
    }

    public HttpHeader putReportTo(String reportTo) {
        put(REPORT_TO, reportTo);
        return this;
    }

    public HttpHeader putTransferEncoding(String transferEncoding) {
        put(TRANSFER_ENCODING, transferEncoding);
        return this;
    }

    public HttpHeader putTE(String te) {
        put(TE, te);
        return this;
    }

    public HttpHeader putTrailer(String trailer) {
        put(TRAILER, trailer);
        return this;
    }

    public HttpHeader putSecWebSocketKey(String secWebSocketKey) {
        put(SEC_WEBSOCKET_KEY, secWebSocketKey);
        return this;
    }

    public HttpHeader putSecWebSocketExtensions(String secWebSocketExtensions) {
        put(SEC_WEBSOCKET_EXTENSIONS, secWebSocketExtensions);
        return this;
    }

    public HttpHeader putSecWebSocketAccept(String secWebSocketAccept) {
        put(SEC_WEBSOCKET_ACCEPT, secWebSocketAccept);
        return this;
    }

    public HttpHeader putSecWebSocketProtocol(String secWebSocketProtocol) {
        put(SEC_WEBSOCKET_PROTOCOL, secWebSocketProtocol);
        return this;
    }

    public HttpHeader putSecWebSocketVersion(String secWebSocketVersion) {
        put(SEC_WEBSOCKET_VERSION, secWebSocketVersion);
        return this;
    }


    public HttpHeader putAcceptPushPolicy(String acceptPushPolicy) {
        put(ACCEPT_PUSH_POLICY, acceptPushPolicy);
        return this;
    }

    public HttpHeader putAcceptSignature(String acceptSignature) {
        put(ACCEPT_SIGNATURE, acceptSignature);
        return this;
    }

    public HttpHeader putAltSvc(String altSvc) {
        put(ALT_SVC, altSvc);
        return this;
    }

    public HttpHeader putDate(String date) {
        put(DATE, date);
        return this;
    }

    public HttpHeader putDate(Date date) {
        return putDate(date.toString());
    }

    public HttpHeader putLargeAllocation(String largeAllocation) {
        put(LARGE_ALLOCATION, largeAllocation);
        return this;
    }

    public HttpHeader putLink(String link) {
        put(LINK, link);
        return this;
    }

    public HttpHeader putPushPolicy(String pushPolicy) {
        put(PUSH_POLICY, pushPolicy);
        return this;
    }

    public HttpHeader putRetryAfter(String retryAfter) {
        put(RETRY_AFTER, retryAfter);
        return this;
    }

    public HttpHeader putSignature(String signature) {
        put(SIGNATURE, signature);
        return this;
    }

    public HttpHeader putSignedHeaders(String signedHeaders) {
        put(SIGNED_HEADERS, signedHeaders);
        return this;
    }

    public HttpHeader putServerTiming(String serverTiming) {
        put(SERVER_TIMING, serverTiming);
        return this;
    }

    public HttpHeader putServiceWorkerAllowed(String serviceWorkerAllowed) {
        put(SERVICE_WORKER_ALLOWED, serviceWorkerAllowed);
        return this;
    }

    public HttpHeader putSourceMap(String sourceMap) {
        put(SOURCE_MAP, sourceMap);
        return this;
    }

    public HttpHeader putUpgrade(String upgrade) {
        put(UPGRADE, upgrade);
        return this;
    }

    public HttpHeader putXDNSPrefetchControl(String xDNSPrefetchControl) {
        put(X_DNS_PREFETCH_CONTROL, xDNSPrefetchControl);
        return this;
    }

    public HttpHeader putXFirefoxSpdy(String xFirefoxSpdy) {
        put(X_FIREFOX_SPDY, xFirefoxSpdy);
        return this;
    }

    public HttpHeader putXPingback(String xPingback) {
        put(X_PINGBACK, xPingback);
        return this;
    }

    public HttpHeader putXRequestedWith(String xRequestedWith) {
        put(X_REQUESTED_WITH, xRequestedWith);
        return this;
    }

    public HttpHeader putXRobotsTag(String xRobotsTag) {
        put(X_ROBOTS_TAG, xRobotsTag);
        return this;
    }

    public HttpHeader putXUACompatible(String xUACompatible) {
        put(X_UA_COMPATIBLE, xUACompatible);
        return this;
    }


    public String getWWWAuthenticate() {
        return get(WWW_AUTHENTICATE);
    }

    public String getAuthorization() {
        return get(AUTHORIZATION);
    }

    public String getProxyAuthenticate() {
        return get(PROXY_AUTHENTICATE);
    }

    public String getProxyAuthorization() {
        return get(PROXY_AUTHORIZATION);
    }

    public String getAge() {
        return get(AGE);
    }

    public String getCacheControl() {
        return get(CACHE_CONTROL);
    }

    public String getClearSiteData() {
        return get(CLEAR_SITE_DATA);
    }

    public String getExpires() {
        return get(EXPIRES);
    }

    public String getPragma() {
        return get(PRAGMA);
    }

    public String getWarning() {
        return get(WARNING);
    }

    public String getAcceptCH() {
        return get(ACCEPT_CH);
    }

    public String getAcceptCHLifetime() {
        return get(ACCEPT_CH_LIFETIME);
    }

    public String getEarlyData() {
        return get(EARLY_DATA);
    }

    public String getContentDPR() {
        return get(CONTENT_DPR);
    }

    public String getDPR() {
        return get(DPR);
    }

    public String getDeviceMemory() {
        return get(DEVICE_MEMORY);
    }

    public String getSaveData() {
        return get(SAVE_DATA);
    }

    public String getViewportWidth() {
        return get(VIEWPORT_WIDTH);
    }

    public String getWidth() {
        return get(WIDTH);
    }

    public String getLastModified() {
        return get(LAST_MODIFIED);
    }

    public String getETag() {
        return get(ETAG);
    }

    public String getIfMatch() {
        return get(IF_MATCH);
    }

    public String getIfNoneMatch() {
        return get(IF_NONE_MATCH);
    }

    public String getIfModifiedSince() {
        return get(IF_MODIFIED_SINCE);
    }

    public String getIfUnmodifiedSince() {
        return get(IF_UNMODIFIED_SINCE);
    }

    public String getVary() {
        return get(VARY);
    }

    public String getConnection() {
        return get(CONNECTION);
    }

    public String getKeepAlive() {
        return get(KEEP_ALIVE);
    }

    public String getAccept() {
        return get(ACCEPT);
    }

    public String getAcceptCharset() {
        return get(ACCEPT_CHARSET);
    }

    public String getAcceptEncoding() {
        return get(ACCEPT_ENCODING);
    }

    public String getAcceptLanguage() {
        return get(ACCEPT_LANGUAGE);
    }

    public String getExpect() {
        return get(EXPECT);
    }

    public String getMaxForwards() {
        return get(MAX_FORWARDS);
    }

    public String getCookie() {
        return get(COOKIE);
    }

    public String getSetCookie() {
        return get(SET_COOKIE);
    }

    public String getCookie2() {
        return get(COOKIE2);
    }

    public String getSetCookie2() {
        return get(SET_COOKIE2);
    }

    public String getAccessControlAllowOrigin() {
        return get(ACCESS_CONTROL_ALLOW_ORIGIN);
    }

    public String getAccessControlAllowCredentials() {
        return get(ACCESS_CONTROL_ALLOW_CREDENTIALS);
    }

    public String getAccessControlAllowHeaders() {
        return get(ACCESS_CONTROL_ALLOW_HEADERS);
    }

    public String getAccessControlAllowMethods() {
        return get(ACCESS_CONTROL_ALLOW_METHODS);
    }

    public String getAccessControlExposeHeaders() {
        return get(ACCESS_CONTROL_EXPOSE_HEADERS);
    }

    public String getAccessControlMaxAge() {
        return get(ACCESS_CONTROL_MAX_AGE);
    }

    public String getAccessControlRequestHeaders() {
        return get(ACCESS_CONTROL_REQUEST_HEADERS);
    }

    public String getAccessControlRequestMethod() {
        return get(ACCESS_CONTROL_REQUEST_METHOD);
    }

    public String getOrigin() {
        return get(ORIGIN);
    }

    public String getTimingAllowOrigin() {
        return get(TIMING_ALLOW_ORIGIN);
    }

    public String getDNT() {
        return get(DNT);
    }

    public String getTk() {
        return get(TK);
    }

    public String getContentDisposition() {
        return get(CONTENT_DISPOSITION);
    }

    public String getContentLength() {
        return get(CONTENT_LENGTH);
    }

    public String getContentType() {
        return get(CONTENT_TYPE);
    }

    public String getContentEncoding() {
        return get(CONTENT_ENCODING);
    }

    public String getContentLanguage() {
        return get(CONTENT_LANGUAGE);
    }

    public String getContentLocation() {
        return get(CONTENT_LOCATION);
    }

    public String getForwarded() {
        return get(FORWARDED);
    }

    public String getXForwardedFor() {
        return get(X_FORWARDED_FOR);
    }

    public String getXForwardedHost() {
        return get(X_FORWARDED_HOST);
    }

    public String getXForwardedProto() {
        return get(X_FORWARDED_PROTO);
    }

    public String getVia() {
        return get(VIA);
    }

    public String getLocation() {
        return get(LOCATION);
    }

    public String getFrom() {
        return get(FROM);
    }

    public String getHost() {
        return get(HOST);
    }

    public String getReferer() {
        return get(REFERER);
    }

    public String getRefererPolicy() {
        return get(REFERRER_POLICY);
    }

    public String getUserAgent() {
        return get(USER_AGENT);
    }

    public String getAllow() {
        return get(ALLOW);
    }

    public String getServer() {
        return get(SERVER);
    }

    public String getAcceptRanges() {
        return get(ACCEPT_RANGES);
    }

    public String getRange() {
        return get(RANGE);
    }

    public String getIfRange() {
        return get(IF_RANGE);
    }

    public String getContentRange() {
        return get(CONTENT_RANGE);
    }

    public String getCrossOriginEmbedderPolicy() {
        return get(CROSS_ORIGIN_EMBEDDER_POLICY);
    }

    public String getCrossOriginOpenerPolicy() {
        return get(CROSS_ORIGIN_OPENER_POLICY);
    }

    public String getCrossOriginResourcePolicy() {
        return get(CROSS_ORIGIN_RESOURCE_POLICY);
    }

    public String getContentSecurityPolicy() {
        return get(CONTENT_SECURITY_POLICY);
    }

    public String getContentSecurityPolicyReportOnly() {
        return get(CONTENT_SECURITY_POLICY_REPORT_ONLY);
    }

    public String getExpectCT() {
        return get(EXPECT_CT);
    }

    public String getFeaturePolicy() {
        return get(FEATURE_POLICY);
    }

    public String getOriginIsolation() {
        return get(ORIGIN_ISOLATION);
    }

    public String getStrictTransportSecurity() {
        return get(STRICT_TRANSPORT_SECURITY);
    }

    public String getUpgradeInsecureRequests() {
        return get(UPGRADE_INSECURE_REQUESTS);
    }

    public String getXContentTypeOptions() {
        return get(X_CONTENT_TYPE_OPTIONS);
    }

    public String getXDownloadOptions() {
        return get(X_DOWNLOAD_OPTIONS);
    }

    public String getXFrameOptions() {
        return get(X_FRAME_OPTIONS);
    }

    public String getXPermittedCrossDomainPolicies() {
        return get(X_PERMITTED_CROSS_DOMAIN_POLICIES);
    }

    public String getXPoweredBy() {
        return get(X_POWERED_BY);
    }

    public String getXXSSProtection() {
        return get(X_XSS_PROTECTION);
    }

    public String getPublicKeyPins() {
        return get(PUBLIC_KEY_PINS);
    }

    public String getPublicKeyPinsReportOnly() {
        return get(PUBLIC_KEY_PINS_REPORT_ONLY);
    }

    public String getSecFetchSite() {
        return get(SEC_FETCH_SITE);
    }

    public String getSecFetchMode() {
        return get(SEC_FETCH_MODE);
    }

    public String getSecFetchUser() {
        return get(SEC_FETCH_USER);
    }

    public String getSecFetchDest() {
        return get(SEC_FETCH_DEST);
    }

    public String getLastEventID() {
        return get(LAST_EVENT_ID);
    }

    public String getNEL() {
        return get(NEL);
    }

    public String getPingFrom() {
        return get(PING_FROM);
    }

    public String getPingTo() {
        return get(PING_TO);
    }

    public String getReportTo() {
        return get(REPORT_TO);
    }

    public String getTransferEncoding() {
        return get(TRANSFER_ENCODING);
    }

    public String getTE() {
        return get(TE);
    }

    public String getTrailer() {
        return get(TRAILER);
    }

    public String getSecWebSocketKey() {
        return get(SEC_WEBSOCKET_KEY);
    }

    public String getSecWebSocketExtensions() {
        return get(SEC_WEBSOCKET_EXTENSIONS);
    }

    public String getSecWebSocketAccept() {
        return get(SEC_WEBSOCKET_ACCEPT);
    }

    public String getSecWebSocketProtocol() {
        return get(SEC_WEBSOCKET_PROTOCOL);
    }

    public String getSecWebSocketVersion() {
        return get(SEC_WEBSOCKET_VERSION);
    }

    public String getAcceptPushPolicy() {
        return get(ACCEPT_PUSH_POLICY);
    }

    public String getAcceptSignature() {
        return get(ACCEPT_SIGNATURE);
    }

    public String getAltSvc() {
        return get(ALT_SVC);
    }

    public String getDate() {
        return get(DATE);
    }

    public String getLargeAllocation() {
        return get(LARGE_ALLOCATION);
    }

    public String getLink(String link) {
        return get(LINK);
    }

    public String getPushPolicy() {
        return get(PUSH_POLICY);
    }

    public String getRetryAfter() {
        return get(RETRY_AFTER);
    }

    public String getSignature() {
        return get(SIGNATURE);
    }

    public String getSignedHeaders() {
        return get(SIGNED_HEADERS);
    }

    public String getServerTiming() {
        return get(SERVER_TIMING);
    }

    public String getServiceWorkerAllowed() {
        return get(SERVICE_WORKER_ALLOWED);
    }

    public String getSourceMap() {
        return get(SOURCE_MAP);
    }

    public String getUpgrade() {
        return get(UPGRADE);
    }

    public String getXDNSPrefetchControl() {
        return get(X_DNS_PREFETCH_CONTROL);
    }

    public String getXFirefoxSpdy() {
        return get(X_FIREFOX_SPDY);
    }

    public String getXPingback() {
        return get(X_PINGBACK);
    }

    public String getXRequestedWith() {
        return get(X_REQUESTED_WITH);
    }

    public String getXRobotsTag() {
        return get(X_ROBOTS_TAG);
    }

    public String getXUACompatible() {
        return get(X_UA_COMPATIBLE);
    }

    public static String encodeURIComponent(String uri) {
        try {
            return URLEncoder.encode(uri, "UTF-8")
                    .replaceAll("\\+", "%20")
                    .replaceAll("\\!", "%21")
                    .replaceAll("\\'", "%27")
                    .replaceAll("\\(", "%28")
                    .replaceAll("\\)", "%29")
                    .replaceAll("\\~", "%7E");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public static class FirstLine {

        private HttpRequestMethod requestMethod = HttpRequestMethod.GET;

        private String uri = "/";

        private HttpProtocolVersion protocolVersion = HttpProtocolVersion.HTTP_1_1;

        public HttpRequestMethod getRequestMethod() {
            return requestMethod;
        }

        public FirstLine setRequestMethod(HttpRequestMethod requestMethod) {
            this.requestMethod = requestMethod;
            return this;
        }

        public String getUri() {
            return uri;
        }

        public FirstLine setUri(String uri) {
            this.uri = uri.startsWith("/") ? uri : "/" + uri;
            return this;
        }

        public HttpProtocolVersion getProtocolVersion() {
            return protocolVersion;
        }

        public FirstLine setProtocolVersion(HttpProtocolVersion protocolVersion) {
            this.protocolVersion = protocolVersion;
            return this;
        }

        @Override
        public String toString() {
            return String.format("%s %s HTTP/%s",
                    requestMethod, uri, protocolVersion);
        }
    }


    @Override
    public String toString() {
        String firstLine = (null != this.firstLine)
                ? this.firstLine.toString() : "";
        StringBuilder headersContent = new StringBuilder();
        for (Entry<String, String> entry : entrySet()) {
            headersContent.append(String.format("%s: %s\n",
                    entry.getKey(), entry.getValue()));
        }
        return null != firstLine
                ? String.format("%s\n%s\n", firstLine, headersContent)
                : headersContent.toString();
    }

}
