package paraBankTest;

import io.qameta.allure.Description;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import paraBankCustReg.ParaBankCustReg;

public class ParaBankTest {
    ParaBankCustReg custReg = new ParaBankCustReg();

    @BeforeTest
    public void openUrl(){
        custReg.openUrl();
    }

    @Test
    @Description("Your account was created successfully. " +
            "You are now logged in.")
    public void regCustomer(){
        custReg.reg();
        custReg.newCust();
        custReg.verifySignUp();
    }

    @AfterTest
    public void closePage(){
        custReg.tearDown();
    }
}
