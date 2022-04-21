package net.zatca.zatca.mobile.login.user_registration;

import net.zatca.ZatcaModule;
import net.zatca.base.ZatcaMobileTest;
import org.testng.annotations.Test;

import java.util.Map;

public class IndividualRegistration extends ZatcaMobileTest {

    @Test(dataProvider = "testDataProvider", testName = "TC005", description = "test")
    public void individualRegistrationGCCTest(Map<String, String> data) throws Exception {
        ZatcaModule zatcaModule = new ZatcaModule();
        zatcaModule.zatcaApp.pages.loginPage.register_Lnk_Click();
        zatcaModule.zatcaApp.pages.loginPage.individual_Lnk_Click();
        zatcaModule.zatcaApp.pages.loginPage.individual_Registration_Form_Fill();
        zatcaModule.zatcaApp.pages.loginPage.next_Button_Click();
        zatcaModule.zatcaApp.pages.loginPage.contact_Information_Form_Fill();
        zatcaModule.zatcaApp.pages.loginPage.next_Button_Click();
        zatcaModule.zatcaApp.pages.loginPage.confirm_Button_Click();
        zatcaModule.zatcaApp.pages.loginPage.new_Password_FillForm_RegistrationFeature(data);
        zatcaModule.zatcaApp.pages.loginPage.adb_Screen_Scroll();
        zatcaModule.zatcaApp.pages.loginPage.wait_For_OTP_Input();
        zatcaModule.zatcaApp.pages.loginPage.next_Button_Click();
        zatcaModule.zatcaApp.pages.loginPage.registration_Successful_Verification(data);
    }
}
