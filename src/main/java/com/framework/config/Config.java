package com.framework.config;

public class Config {

    private String baseURL;

    private int implicitWait;

    private int explicitWait;

    private int pollingEvery;

    private int pageLoadTimeout;

    private int scriptTimeout;

    private String browser;

    public String getBaseURL() {
        return baseURL;
    }

    public int getImplicitWait() {
        return implicitWait;
    }

    public int getExplicitWait() {
        return explicitWait;
    }

    public int getPollingEvery() {
        return pollingEvery;
    }

    public int getPageLoadTimeout() {
        return pageLoadTimeout;
    }

    public int getScriptTimeout() {
        return scriptTimeout;
    }

    public String getBrowser() {
        return browser;
    }
}
