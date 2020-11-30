package com.meyoustu.anet;

interface ConditionalsHeader {
    String LAST_MODIFIED = "Last-Modified";
    String ETAG = "ETag";
    String IF_MATCH = "If-Match";
    String IF_NONE_MATCH = "If-None-Match";
    String IF_MODIFIED_SINCE = "If-Modified-Since";
    String IF_UNMODIFIED_SINCE = "If-Unmodified-Since";
    String VARY = "Vary";
}
