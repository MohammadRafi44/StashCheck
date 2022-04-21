package net.zatca.base;

import com.example.base.BaseTest;
import com.example.base.ExcelManager;
import com.example.base.MobileDriverManager;
import com.example.utils.Helper;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.Map;

import static io.appium.java_client.remote.AutomationName.ANDROID_UIAUTOMATOR2;


public class ZatcaMobileTest extends BaseTest {

    @Override
    public DesiredCapabilities addCapabilities(String testName) throws Exception {
        Map<String, String> data = ExcelManager.getMobileSettingsDetailsAsMap();

        // Other Settings
        MobileDriverManager.appiumUrl = new URL(data.get("AppiumURL"));

        // Desired Capabilities
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        // Browser Stack Capabilities
        if (data.get("DeviceType").equalsIgnoreCase("browserstack")) {
            desiredCapabilities.setCapability("project", data.get("Project"));
            desiredCapabilities.setCapability("build", data.get("Build"));
            desiredCapabilities.setCapability("app", data.get("AppURL"));
            desiredCapabilities.setCapability("name", testName);

        }

        // Device Capabilities
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, data.get("DeviceName"));
        if (data.get("PlatformName").equalsIgnoreCase("android")) {
            desiredCapabilities.setCapability(AndroidMobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
            desiredCapabilities.setCapability(AndroidMobileCapabilityType.VERSION, data.get("Version"));
            desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, data.get("NoReset"));
            if (data.get("AutomationName").equalsIgnoreCase("uiautomator2")) {
                desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, ANDROID_UIAUTOMATOR2);
            } else {
                throw new Exception(data.get("AutomationName") + "  Automation Name not supported.");
            }
        } else if (data.get("PlatformName").equalsIgnoreCase("ios")) {
            desiredCapabilities.setCapability(AndroidMobileCapabilityType.PLATFORM_NAME, Platform.IOS);
        } else {
            throw new Exception(data.get("PlatformName") + "  platform not supported.");
        }

        // App Details
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, data.get("AppPackage"));
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, data.get("AppActivity"));

        // Other Capabilities
        desiredCapabilities.setCapability("newCommandTimeout", 100000);
        desiredCapabilities.setCapability("autoGrantPermissions", data.get("AutoGrantPermissions"));

        //Helper.log(desiredCapabilities.toString());
        return desiredCapabilities;
    }

}
