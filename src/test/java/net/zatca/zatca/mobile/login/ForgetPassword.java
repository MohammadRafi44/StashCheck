package net.zatca.zatca.mobile.login;

import com.example.base.MobileActions;
import net.zatca.ZatcaModule;
import net.zatca.base.ZatcaMobileTest;
import org.testng.annotations.Test;

import java.util.Map;

public class ForgetPassword extends ZatcaMobileTest {

    @Test(dataProvider = "testDataProvider", testName = "TC003", description = "test")
    public void forgotPasswordTest(Map<String, String> data) throws Exception {
        ZatcaModule zatcaModule = new ZatcaModule();
        zatcaModule.zatcaApp.pages.loginPage.forgotPassword(data);
        zatcaModule.zatcaApp.pages.profilePage.enterOTP();
        zatcaModule.zatcaApp.pages.loginPage.verificationCodeLabelClick();
        zatcaModule.zatcaApp.pages.loginPage.doneButtonClick_ForgotPassword();






    }
}
