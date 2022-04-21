package net.zatca.zatca.mobile.login;

import net.zatca.ZatcaModule;
import net.zatca.base.ZatcaMobileTest;
import org.testng.annotations.Test;

import java.util.Map;

public class ForgetUserName extends ZatcaMobileTest {

    @Test(dataProvider = "testDataProvider", testName = "TC003", description = "test")
    public void forgotUsernameTest(Map<String, String> data) throws Exception {
        ZatcaModule zatcaModule = new ZatcaModule();
//        zatcaModule.zatcaApp.pages.profilePage.navigateToHome();
        zatcaModule.zatcaApp.pages.loginPage.forgotUsername(data);
        zatcaModule.zatcaApp.pages.profilePage.fillSignInForm(data);
        zatcaModule.zatcaApp.pages.profilePage.hideKeyboard();
        zatcaModule.zatcaApp.pages.profilePage.logIn();
        zatcaModule.zatcaApp.pages.profilePage.enterOTP();
        zatcaModule.zatcaApp.pages.profilePage.homeScreenValidation();

    }
}
