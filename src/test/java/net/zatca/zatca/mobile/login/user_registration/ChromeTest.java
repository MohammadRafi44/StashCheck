package net.zatca.zatca.mobile.login.user_registration;

import net.zatca.ZatcaModule;
import net.zatca.base.ZatcaMobileTest;
import net.zatca.base.ZatcaWebTest;
import org.testng.annotations.Test;

import java.util.Map;

public class ChromeTest extends ZatcaWebTest {

    @Test(dataProvider = "testDataProvider", testName = "TC006", description = "test")
    public void ChromeTestVerify(Map<String, String> data) throws Exception {
        ZatcaModule zatcaModule = new ZatcaModule();
        zatcaModule.zatcaApp.pages.loginPage.GoogleInputTest();

    }
}
