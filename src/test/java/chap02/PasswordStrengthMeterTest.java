package chap02;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PasswordStrengthMeterTest {

    private PasswordStrengthMeter meter = new PasswordStrengthMeter();

    private void assertStrength(String password, PasswordStrength expStr) {
        PasswordStrength result = meter.meter(password);
        assertEquals(expStr, result);
    }

    @Test
    void meetsAllCriteria_Then_String(){
        assertStrength("ab12!2AB", PasswordStrength.STRONG);
        assertStrength("abc!2!AAB", PasswordStrength.STRONG);
       }

    @Test
    void meetsOtherCriteria_except_for_Length_Then_Noramal(){
        assertStrength("ab121@A", PasswordStrength.NORMAL);

    }

    @Test
     void meetsOtherCriteria_except_for_number_Then_Normal() {
        assertStrength("abAGD@#BDD",PasswordStrength.NORMAL);
    }

    @Test
    void nullInput_Then_Invalid(){
        assertStrength(null, PasswordStrength.INVALID);
    }

    @Test
    void mettsOtherCriteria_except_for_Uppercase_Then_Normal(){
        assertStrength("ab12!@df", PasswordStrength.NORMAL);
    }

    @Test
    void meetsOnlyLengthCriteria_Then_Weak(){
        assertStrength("abdefghi", PasswordStrength.WEAK);
    }

    @Test
    void meetsOnlyNumCriteria_Then_Weak(){
        assertStrength("12345", PasswordStrength.WEAK);
    }

    @Test
    void meetsOnlyUppCriteria_Then_Weak(){
        assertStrength("ABZFF", PasswordStrength.WEAK);
    }

    @Test
    void meetsNoCriteria_Then_Weak(){
        assertStrength("abc", PasswordStrength.WEAK);

    }
}
