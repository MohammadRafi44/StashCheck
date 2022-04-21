package net.zatca.zatca.mobile.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ZatcaAppProfilePageObjects {

    //Label Objects
    public static final By LABEL_Customer_Name = By.xpath("//android.widget.TextView[@text='Ahmed Yassin Mohamed Sharif']");
    public static final By LABEL_Customer_Funds = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView");

    public static final By LABEL_Reference_Number = By.xpath("//android.widget.TextView[contains(@text,'65')]");
    public static final By LABEL_Taxable_Period = By.xpath("//android.widget.TextView[contains(@text,'Quarter')]");


    //Filters
    public static final By FILTER_UnSubmitted = By.xpath("//android.widget.TextView[@text='Unsubmitted']");

    // Button Objects
    public static final By BUTTON_Login = By.xpath("//android.widget.Button[@index='8']");
    public static final By BUTTON_Submit = By.xpath("//android.widget.TextView[@text='Submit']");

    public static final By BUTTON_Refresh = By.xpath("//android.widget.TextView[@text='Refresh']");
    public static final By BUTTON_PayNow = By.xpath("//android.widget.TextView[@text='Pay Now']");

    public static final By BUTTON_SADAD = By.xpath("//android.widget.TextView[@text='SADAD']");
    public static final By BUTTON_Done = By.xpath("//android.widget.TextView[@text='Done']");
    //Payments Objects


    // Radio Objects

    // Text Objects
    public static final By TEXT_TIN = By.xpath("//android.widget.EditText[@index='0']");
    public static final By TEXT_Password = By.xpath("//android.widget.EditText[@index='1']");

    public static final By TEXT_CorrectionsFromPrevPeriod=By.xpath("//android.widget.EditText[@text='0.00']");

    //Profile Objects

    //VAT Returns Form Objects
    public static final By FORM_VAT = By.xpath("//android.widget.TextView[@text='21AP']");

    public static final By CHK_DECLARATION = By.xpath("//android.widget.ImageView[@index='0']");
    public static final By CHK_SUMMARY_DECLARATION = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView");
    public static final By BUTTON_NEXT = By.xpath("//android.widget.TextView[@text='Next']");




}
