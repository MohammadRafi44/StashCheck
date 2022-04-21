package net.zatca.zatca.mobile.pages;

import com.example.base.MobileActions;
import com.example.base.MobileDriverManager;
import com.example.utils.Helper;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import org.openqa.selenium.Dimension;
import org.testng.Assert;

import java.io.IOException;
import java.util.Map;

import static net.zatca.zatca.mobile.objects.ZatcaAppCommonObjects.getBannerMessageObject;

public class ZatcaAppPages {

    public final ZatcaAppMenu menu;
    public final ZatcaAppProfilePage profilePage;
    public final ZatcaLoginPage loginPage;



    public ZatcaAppPages() {
        menu = new ZatcaAppMenu();
        profilePage = new ZatcaAppProfilePage();
        loginPage = new ZatcaLoginPage();

    }

    public void assertBannerDisplayed(Map<String, String> data) throws Exception {
        boolean flag = false;
        for (int i = 1; i < 10; i++) {
            if (MobileActions.checkIfWebElementExists(getBannerMessageObject(data.get("BannerMessage")))) {
                flag = true;
                break;
            }
        }
        MobileActions.takeScreenshot();
        Assert.assertTrue(flag, "Banner displayed - " + data.get("BannerMessage"));
        Helper.log("Banner displayed - " + data.get("BannerMessage"));
    }

    public void swipeToBottom() throws IOException {
        String command = "adb shell input swipe 500 1000 300 300";
        Runtime.getRuntime().exec(command);
    }


}
