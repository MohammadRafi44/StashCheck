package net.zatca.zatca.mobile.objects;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ZatcaAppLoginObjects {

    // Menu Objects
/*
    public static final By MNU_En = By.xpath("//android.widget.TextView[@text='En']");
    public static final By MNU_Skip = By.xpath("//android.widget.TextView[@text='Skip']");
    public static final By MNU_Hamburger = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.ImageView");
    public static final By MNU_Returns = By.xpath("//android.widget.TextView[@text='Returns']");
    public static final By MNU_Installment_Plans = By.xpath("//android.widget.TextView[@text='Installment Plans']");
    public static final By MNU_All = By.xpath("//android.widget.TextView[@text='ALL']");
*/

  //Forgot UserName Scenario objects
    public static final By FORGOT_PASSWORD_USERNAME_LINK = By.xpath("//android.view.View[@content-desc='Forgot Password or Username?']");
    public static final By USERNAME_IMAGE_LINK= By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView");
    public static final By CORPORATE_IMAGE_LINK= By.xpath("//android.widget.TextView[@text='Corporate']");
    public static final By ID_NUMBER_EDITTEXT= By.xpath("//android.widget.EditText[@text='ID Number']");
    public static final By CONFIRM_BUTTON= By.xpath("//android.widget.TextView[@text='Confirm']");
    public static final By check234= MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");
    public static final By FORGOT_PASSWORD_USERNAME_LABEL= By.xpath("//android.widget.TextView[@text='Forgot Username or Password?']");
    public static final By USERNAME_SENT_TO_MOBILE_NUMBER_LABEL= By.xpath("//android.widget.TextView[@text='Username sent to mobile number']");
    public static final By LOGIN_LABEL= By.xpath("//android.widget.TextView[@text='Log In']");
    public static final By PENDINGBILLS_HOMESCREEN_LABEL= By.xpath("//android.widget.TextView[@text='Pending Bills']");

    //Forgot UserName Scenario objects
    public static final By PASSWORD_IMAGE_LINK = By.xpath("//android.widget.TextView[@text='Password ']");
    public static final By USERNAME_EDITTEXT = By.xpath("//android.widget.EditText[@text='User name']");
    public static final By NEXT_BUTTON = By.xpath("//android.widget.TextView[@text='Next']");
    public static final By ENTER_OTP_FIRST_DIGIT_CLICK = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[4]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.View");
    public static final By DONE_BUTTON = By.xpath("//android.widget.TextView[@text='Done']");
    public static final By VERIFICATIONCODE_LABEL = By.xpath("//android.widget.TextView[@text='Verification Code']");
    public static final By RESEND_VERIFICATION_CODE_TEXT = By.xpath("//android.widget.TextView[@text='Resend Verification Code']");
    public static final By NEW_PASSWORD_TXT = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[4]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");
    public static final By CONFIRM_PASSWORD_TXT = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[4]/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");
    public static final By CREATE_A_SECURE_PASSWORD_TXT_LBL = By.xpath("//android.widget.TextView[@text='Create a Secure Password']");
    public static final By NEXT_BTN = By.xpath("//android.widget.TextView[@text='Next']");
    public static final By LOGIN_BTN_RECOVERPASSWORD = By.xpath("//android.widget.TextView[@text='Log In']");

    //Individual Registration Scenario objects
    public static final By REGISTER_LNK = By.xpath("//android.widget.TextView[@text=\"Don't have an account? Register\"]");
    public static final By INDIVIDUALS_LNK = By.xpath("//android.widget.TextView[@text='Individuals']");
    public static final By ID_TYPE_TXT = By.xpath("//android.widget.EditText[@text='National ID']");
    public static final By DATE_OF_BIRTH_TXT = By.xpath("//android.widget.EditText[@text='dd/MM/yyyy']");
    public static final By NAME_TXT = By.xpath("//android.widget.EditText[@text='Name']");
    public static final By DATE_OF_BIRTH_TXT_UPDATED_VALUE = By.xpath("//android.widget.EditText[@text='17/04/2022']");
    public static final long DOBRegistrationCurrentDate = System.currentTimeMillis();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDateTime now = LocalDateTime.now();
//    System.out.println(dtf.format(now));
  public static final By EMAIL_ADDRESS_TXT = By.xpath("//android.widget.EditText[@text='Email Address']");
    public static final By CONFIRM_EMAIL_ADDRESS_TXT = By.xpath("//android.widget.EditText[@text='Confirm Email']");
    public static final By MOBILE_NUMBER_TXT = By.xpath("//android.widget.EditText[@text='Mobile Number']");
    public static final By CONFIRM_BTN = By.xpath("//android.widget.TextView[@text='Confirm']");
    public static final By NEW_PASSWORD_TXT_REGISTRATION = By.xpath("//android.widget.EditText[@text='New Password']");
    public static final By CONFIRM_PASSWORD_TXT_REGISTRATION = By.xpath("//android.widget.EditText[@text='Repeat Password']");
    public static final By REGISTRATION_SUCCESSFUL_LBL = By.xpath("//android.widget.TextView[@text='Registration Successful']");
    public static final By TIN_NUMBER_CREATED = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView");






  //hi


}
