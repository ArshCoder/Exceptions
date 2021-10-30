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


}
