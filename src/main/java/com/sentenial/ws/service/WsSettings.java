package com.sentenial.ws.service;

/**
 * Copyright of Sentenial
 * User: christian.reichel
 */
final class WsSettings {

    private String wsUrl;
    private String username;
    private String password;
    private boolean debugEnabled = false;

    WsSettings() {}

    WsSettings(String wsUrl, String username, String password) {
        this.wsUrl = wsUrl;
        this.username = username;
        this.password = password;
    }

    public String getWsUrl() {
        return wsUrl;
    }

    public void setWsUrl(String wsUrl) {
        this.wsUrl = wsUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isDebugEnabled() {
        return debugEnabled;
    }

    public String getDebugEnabled() {
        return debugEnabled + "";
    }

    public void setDebugEnabled(boolean debugEnabled) {
        this.debugEnabled = debugEnabled;
    }

    @Override
    public String toString() {
        return "WsSettings{" +
                "wsUrl='" + wsUrl + '\'' +
                ", username='" + username + '\'' +
                ", debugEnabled=" + debugEnabled +
                '}';
    }
}
