package com.example.dul.androideatitserver.Model;

public class Tokens {
    private String token;
    private boolean isServerToken;

    public Tokens() {
    }

    public Tokens(String token, boolean isServerToken) {
        this.token = token;
        this.isServerToken = isServerToken;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean isServerToken() {
        return isServerToken;
    }

    public void setServerToken(boolean serverToken) {
        isServerToken = serverToken;
    }

}
