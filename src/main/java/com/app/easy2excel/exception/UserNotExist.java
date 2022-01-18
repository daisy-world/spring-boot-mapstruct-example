package com.app.easy2excel.exception;

public class UserNotExist extends RuntimeException {
    public UserNotExist(String message) {
        super(message);
    }
}
