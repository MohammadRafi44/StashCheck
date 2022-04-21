package net.zatca.zatca.mobile.pages;

import com.example.base.*;
import com.example.utils.Helper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.io.IOException;
import java.util.Map;
import java.util.Random;

import static net.zatca.zatca.mobile.objects.ZatcaAppMenuObjects.MNU_En;
import static net.zatca.zatca.mobile.objects.ZatcaAppMenuObjects.MNU_Skip;
import static net.zatca.zatca.mobile.objects.ZatcaAppLoginObjects.*;

public class ZatcaLoginPage {

    public void forgotUsername(Map<String, String> data) throws Exception {

        MobileActions.sleep(2);
        MobileActions.click(FORGOT_PASSWORD_USERNAME_LINK, "Navigate to English Page");
        MobileActions.sleep(1);
        MobileActions.click(USERNAME_IMAGE_LINK, "Navigate to Login Page");
        MobileActions.sleep(1);
        MobileActions.click(CORPORATE_IMAGE_LINK, "Navigate to Login Page");
        MobileActions.sleep(1);
        MobileActions.click(ID_NUMBER_EDITTEXT);
        MobileActions.sleep(1);
//        MobileActions.enterText(ID_NUMBER_EDITTEXT, data.get("IdNumber"));
//                 desiredCapabilities.setCapability("automationName", "UiAutomator2");
//                desiredCapabilities.setCapability("ensureWebviewsHavePages", true);
//                URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
//                    MobileActions.enterText(ID_NUMBER_EDITTEXT, "7000293154");
        MobileActions.enterText(ID_NUMBER_EDITTEXT, data.get("IdNumber"));
//                MobileElement el1 = (MobileElement) driver.findElementByXPath();
        MobileActions.click(FORGOT_PASSWORD_USERNAME_LABEL);
        MobileActions.sleep(1);
        MobileActions.hideKeyboard();
        MobileActions.sleep(1);
        MobileActions.click(CONFIRM_BUTTON);
        MobileActions.sleep(1);
        Assert.assertTrue(MobileActions.checkIfWebElementExists(USERNAME_SENT_TO_MOBILE_NUMBER_LABEL));
        MobileActions.takeScreenshot();
        Helper.log("Recover User Name - Username sent to mobile number:: Is displayed");
        MobileActions.click(LOGIN_LABEL, "Clicked on Login button on Recover User Name Screen");
        MobileActions.sleep(1);
    }

    public void forgotPassword(Map<String, String> data) throws Exception {
        MobileActions.sleep(2);
        MobileActions.click(FORGOT_PASSWORD_USERNAME_LINK, "Clicked on Forgot password username link ");
        MobileActions.sleep(1);
        MobileActions.click(PASSWORD_IMAGE_LINK, "Clicked on Password Image link");
        MobileActions.sleep(1);
        MobileActions.enterText(USERNAME_EDITTEXT,data.get("TIN"));
        MobileActions.click(FORGOT_PASSWORD_USERNAME_LABEL);
        MobileActions.hideKeyboard();
        MobileActions.click(NEXT_BUTTON);
        MobileActions.sleep(2);
//
    }
    public void verificationCodeLabelClick() {
        MobileActions.click(VERIFICATIONCODE_LABEL,"Clicked on Verification Code Label");
        MobileActions.sleep(3);
    }
    public void resend_Verification_Code_Text_Click() {
        MobileActions.click(RESEND_VERIFICATION_CODE_TEXT,"Clicked on Resend Verification Code Label");
        MobileActions.sleep(4);
    }
    public void doneButtonClick_ForgotPassword() {
        MobileActions.click(DONE_BUTTON,"Clicked on Done Button");
        MobileActions.sleep(2);
    }
        public void new_Password_FillForm(Map<String, String> data) throws Exception {
        MobileActions.enterText(NEW_PASSWORD_TXT,data.get("Password"),"Entered new password");
        MobileActions.sleep(1);
        MobileActions.click(CREATE_A_SECURE_PASSWORD_TXT_LBL,"Clicked on Create Secure Password Text Label");
        MobileActions.sleep(1);
        MobileActions.click(CONFIRM_PASSWORD_TXT);
        adb_Text_Input(data);
        MobileActions.sleep(1);
        MobileActions.click(CREATE_A_SECURE_PASSWORD_TXT_LBL,"Clicked on Create Secure Password Text Label");

//        MobileActions.enterText(CONFIRM_PASSWORD_TXT,data.get("Password"),"Entered confirm password");
        MobileActions.sleep(1);
     }

    public void create_Secure_Password_Text_Click() {
        MobileActions.click(CREATE_A_SECURE_PASSWORD_TXT_LBL,"Clicked on Create Secure Password Text Label");
        MobileActions.sleep(1);
    }
    public void next_Button_Click() {
        MobileActions.click(NEXT_BTN,"Next Button Clicked");
        MobileActions.sleep(2);
        MobileActions.takeScreenshot();
    }
    public void login_Button_Click() {
        MobileActions.click(LOGIN_BTN_RECOVERPASSWORD,"Clicked on Recover Password Button");
        MobileActions.sleep(2);
    }
    public void register_Lnk_Click() {
        MobileActions.sleep(2);
        MobileActions.click(REGISTER_LNK,"Clicked on Register Link");
        MobileActions.sleep(1);
    }
    public void individual_Lnk_Click() {
        MobileActions.click(INDIVIDUALS_LNK,"Clicked on Individual Link");
        MobileActions.sleep(2);
    }
    public void individual_Registration_Form_Fill() {
        MobileActions.sleep(2);
        MobileActions.click(ID_TYPE_TXT);
        MobileActions.sleep(1);
        TouchAction action = new TouchAction(MobileDriverManager.getDriver());
        action.tap(PointOption.point(542, 1279)).release().perform();
        MobileActions.sleep(1/2);
        action.tap(PointOption.point(542, 1279)).release().perform();
        MobileActions.sleep(1/2);
        action.tap(PointOption.point(512, 445)).release().perform();
        MobileActions.sleep(1);


        MobileActions.enterText(ID_NUMBER_EDITTEXT, generate10DigitRandomID(7));
        MobileActions.sleep(1);
        MobileActions.click(DATE_OF_BIRTH_TXT);
        MobileActions.sleep(1);
        TouchAction action2 = new TouchAction(MobileDriverManager.getDriver());
        action.tap(PointOption.point(512, 445)).release().perform();
        MobileActions.sleep(1);
        MobileActions.enterText(DATE_OF_BIRTH_TXT_UPDATED_VALUE,"01/01/1980");
        MobileActions.sleep(1);
        MobileActions.enterText(NAME_TXT,"Test User");
        MobileActions.sleep(1);
        MobileActions.click(NEXT_BTN,"Clicked on Next button on Individual Registration form");
        MobileActions.sleep(1);
    }
    public static String generate10DigitRandomID(int i) {
        try {
            Random rand = new Random();
            int number = rand.nextInt(999999999);
            String s = i + String.format("%09d", number);
            return s;
        } catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    public void contact_Information_Form_Fill(){
        MobileActions.enterText(EMAIL_ADDRESS_TXT,"Test@Test.com");
        MobileActions.sleep(1);
        MobileActions.enterText(CONFIRM_EMAIL_ADDRESS_TXT,"Test@Test.com");
        MobileActions.sleep(1);
        MobileActions.enterText(MOBILE_NUMBER_TXT,"583480823");
        MobileActions.sleep(1);

    }
    public void new_Password_FillForm_RegistrationFeature(Map<String, String> data) throws Exception {
        MobileActions.enterText(NEW_PASSWORD_TXT_REGISTRATION,data.get("Password"),"Entered new password");
        MobileActions.sleep(1);
        MobileActions.enterText(CONFIRM_PASSWORD_TXT_REGISTRATION,data.get("Password"),"Entered new password");
        MobileActions.sleep(1);
    }
    public void confirm_Button_Click(){
        MobileActions.click(CONFIRM_BTN,"Clicked on Confirm button on Contact Information screen");
        MobileActions.sleep(3);
    }
    public void adb_Text_Input(Map<String, String> data) throws IOException {
        String screenScroll = "adb shell input text "+data.get("adbTextInput");
        Runtime.getRuntime().exec(screenScroll);
        Helper.log("ADB Shell entered the provided Text"+data.get("adbTextInput"));
        MobileActions.sleep(1);
    }
    public void adb_Screen_Scroll() throws IOException {
        String screenScroll = "adb shell input swipe 500 1000 300 300";
        Runtime.getRuntime().exec(screenScroll);
        MobileActions.sleep(1);
    }
    public void wait_For_OTP_Input() throws IOException {
        MobileActions.sleep(12);
    }
    public void registration_Successful_Verification(Map<String, String> data){
        MobileActions.click(REGISTRATION_SUCCESSFUL_LBL,
                "Registration Successful message is shown, registration is successful with TIN number"
                        +MobileActions.getText(TIN_NUMBER_CREATED));
        ExcelManager.writeToExcelColumn(data, "Login", "TIN_Created", MobileActions.getText(TIN_NUMBER_CREATED));
        MobileActions.takeScreenshot();
        MobileActions.sleep(3);
    }
    public void GoogleInputTest() {
//    Actions.openUrl("https://www.guru99.com/"); for example here we opened web url link
//    Actions.enterText(By.xpath("//img[@src='https://www.guru99.com/images/home/selenium-logo.png']"), "Entered TestCrew");
//    Actions.click(By.xpath("//a[contains(@data-lasso-id,'147463')]"), "Entered TestCrew");
//        Actions.click(By.xpath("//a[contains(@data-lasso-id,'147463')]"), "Clicked on Sap Beginner Link");
        Actions.click(By.xpath("(//a[@href='/'][contains(.,'Home')])[1]"), "Clicked on Home link");


    }
}