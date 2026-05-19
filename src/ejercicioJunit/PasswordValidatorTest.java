package ejercicioJunit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    @Test
    void nullPasswordShouldBeInvalid() {
        PasswordValidator validator = new PasswordValidator();
        boolean result = validator.isValid(null);
        assertFalse(result);
    }


    @Test
    void shortPasswordShouldBeInvalid() {
        PasswordValidator validator = new PasswordValidator();
        boolean result = validator.isValid("abc12");
        assertFalse(result);
    }


    @Test
    void passwordWithoutNumbersShouldBeInvalid() {
        PasswordValidator validator = new PasswordValidator();
        boolean result = validator.isValid("abcdefgh");
        assertFalse(result);
    }


    @Test
    void validPasswordShouldReturnTrue() {
        PasswordValidator validator = new PasswordValidator();
        boolean result = validator.isValid("Password1");
        assertTrue(result);
    }
}
