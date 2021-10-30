package com.exceptionPractice;

import java.util.regex.Pattern;

public class UserValidator {
    private static final String FIRST_NAME_PATTERN = "^[A-z]{1}[a-z]{2,}";


    public String validateFirstName(String fname) throws UserValidatorExceptions {
        try {
            if (fname.length() < 3 || fname.contains("@,$,#")) {
                throw new UserValidatorExceptions("Give proper UserName");
            } else {
                Pattern pattern;
                pattern = Pattern.compile(FIRST_NAME_PATTERN);
                pattern.matcher(fname).matches();
            }
        } catch (UserValidatorExceptions userValidatorExceptions) {
            userValidatorExceptions.printStackTrace();
        }
        return fname;
    }
}
