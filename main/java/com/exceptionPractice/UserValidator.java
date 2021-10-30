package com.exceptionPractice;

import java.util.regex.Pattern;

public class UserValidator {
    private static final String FIRST_NAME_PATTERN = "^[A-z]{1}[a-z]{2,}";
    private static final String LAST_NAME_PATTERN = "^[A-z]{1}[a-z]{2,}";
    private static final String MOBILE_NUM_PATTERN = "(0/91)?[7-9][0-9]{9}";


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

    public String valiadeLastName(String num) throws UserValidatorExceptions {
        try {
            if (num.length() < 3 || num.contains("@,$,#")) {
                throw new UserValidatorExceptions("Give proper UserName");
            } else {
                Pattern pattern;
                pattern = Pattern.compile(MOBILE_NUM_PATTERN);
                pattern.matcher(num).matches();
            }
        } catch (UserValidatorExceptions userValidatorExceptions) {
            userValidatorExceptions.printStackTrace();
        }
        return num;
    }

    public String valiadeMobileNumber(String num) throws UserValidatorExceptions {
        try {
            if (num.length() > 10) {
                throw new UserValidatorExceptions("Give proper Mobile Number");
            } else {
                Pattern pattern;
                pattern = Pattern.compile(LAST_NAME_PATTERN);
                pattern.matcher(num).matches();
            }
        } catch (UserValidatorExceptions userValidatorExceptions) {
            userValidatorExceptions.printStackTrace();
        }
        return num;
    }

}
