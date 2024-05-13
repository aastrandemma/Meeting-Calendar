package com.github.aastrandemma.model;

import java.security.SecureRandom;
import java.util.Random;

public class User {
    private String username;
    private String password;
    private boolean expired;

    // Constructor for registration
    public User(String username) {
        this.username = username;
    }

    // Constructor for authentication
    public User(String username, String password) {
        this(username);
        this.password = password;
    }

    // Constructor for fetching data for user
    public User(String username, String password, boolean expired) {
        this(username, password);
        this.expired = expired;
    }

    public String getUsername() {
        return username;
    }

    public boolean isExpired() {
        return expired;
    }

    public String userInfo() {
        return "username: " + username + " password: " + password;
    }

    private String generateRandomPassword() {
        String allowedCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int passwordLength = 10;
        StringBuilder stringBuilder = new StringBuilder();

        Random random = new SecureRandom();

        for (int i = 0; i < passwordLength; i++) {
            int randomIndex = random.nextInt(allowedCharacters.length());
            char randomChar = allowedCharacters.charAt(randomIndex);
            stringBuilder.append(randomChar);
        }

        return stringBuilder.toString();
    }

    public void newPassword() {
        this.password = generateRandomPassword();
    }
}