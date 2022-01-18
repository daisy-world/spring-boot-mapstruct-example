package com.app.easy2excel.exception;

public class EmployeeNotExist extends RuntimeException {
    public EmployeeNotExist(String message) {
        super(message);
    }
}
