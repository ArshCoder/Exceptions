package com.exceptionPractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {

    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        String result = null;
        try {
            result = validator.validateFirstName("Ar");
        } catch (UserValidatorExceptions e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("Arshjeet",result);
        System.out.println(result);
    }

    @Test
    public void givenFirstName_WhenSpChars_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        String result = null;
        try {
            result = validator.validateFirstName("Arsh@jeet");
        } catch (UserValidatorExceptions e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("Arshjeet", result);
        System.out.println(result);
    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        String result = null;
        try {
            result = validator.valiadeLastName("Br");
        } catch (UserValidatorExceptions e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("Barkade",result);
        System.out.println(result);
    }

    @Test
    public void givenLastName_WhenSpChars_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        String result = null;
        try {
            result = validator.valiadeLastName("Bar#kade");
        } catch (UserValidatorExceptions e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("Barkade", result);
        System.out.println(result);
    }

    public void givenMobileNumber_NotProper() {
        UserValidator validator = new UserValidator();
        String result = null;
        try {
            result = validator.valiadeMobileNumber("77560962711");
        } catch (UserValidatorExceptions e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("7756096271",result);
        System.out.println(result);
    }


}
