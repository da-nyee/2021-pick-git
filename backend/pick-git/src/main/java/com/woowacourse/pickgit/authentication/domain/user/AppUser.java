package com.woowacourse.pickgit.authentication.domain.user;

public abstract class AppUser {

    private String username;
    private String accessToken;

    protected AppUser(String username, String accessToken) {
        this.username = username;
        this.accessToken = accessToken;
    }

    public String getUsername() {
        return username;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public abstract boolean isGuest();
}
