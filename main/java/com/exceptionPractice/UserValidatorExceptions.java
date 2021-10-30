package com.exceptionPractice;

public class UserValidatorExceptions extends Exception {
    public UserValidatorExceptions(String fname) {
        super(String.valueOf(fname));
    }

}
