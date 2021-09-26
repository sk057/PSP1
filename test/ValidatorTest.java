import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidatorTest {

    // Password requirements testing
    @Test
    public void TestPasswordLengthIsBiggerThanX(){
        PasswordChecker passwordChecker = new PasswordChecker();
        assertEquals(8, passwordChecker.passwordLenght("password"));
    }

    @Test
    public void TestPasswordHasUppercase(){
        PasswordChecker passwordChecker = new PasswordChecker();
        assertTrue(passwordChecker.hasUppercase("Password"));
    }

    @Test
    public void TestPasswordHasSpecialSymbol(){
        PasswordChecker passwordChecker= new PasswordChecker();
        assertTrue(passwordChecker.hasSpecialSymbols("P@ssword?!123$#*"));
    }

    @Test
    public void TestPhoneHasOnlyNumbers(){
        PhoneValidator phoneValidator = new PhoneValidator();
        assertTrue(phoneValidator.hasOnlyNumbers("861234567"));
    }

    @Test
    public void TestPhoneChangeToLithuanianPrefix(){
        PhoneValidator phoneValidator = new PhoneValidator();
        assertEquals("86123456",phoneValidator.changeToLithuanianPrefix("+3706123456"));
    }

    @Test
    public void TestPhoneAddNewPhoneCodesRules(){
        PhoneValidator phoneValidator = new PhoneValidator();
        assertEquals("lv",phoneValidator.addNewPhoneRules(87));
    }

    // Email test requirements
    @Test
    public void TestEmailHasEtaSymbol(){
        EmailValidator emailValidator = new EmailValidator();
        assertTrue(emailValidator.hasEtaSymbol("P@ssword"));
    }

    @Test
    public void TestEmailHasOnlyRightSymbols(){
        EmailValidator emailValidator = new EmailValidator();
        assertTrue(emailValidator.hasOnlyRightSymbols("email@gmail.com"));
    }

    @Test
    public void TestEmailHasRightDomain(){
        EmailValidator emailValidator = new EmailValidator();
        assertTrue(emailValidator.hasRightDomain("email@gmail.com"));
    }
}