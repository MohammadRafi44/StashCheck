package net.zatca.zatca.mobile.pages;

import com.example.base.Actions;
import com.example.base.MobileActions;
import com.example.base.MobileDriverManager;
import com.example.utils.Helper;
import com.sun.org.apache.xpath.internal.operations.And;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.offset.PointOption;
import net.zatca.ZatcaModule;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static net.zatca.zatca.mobile.objects.ZatcaAppProfilePageObjects.*;
import static net.zatca.zatca.mobile.objects.ZatcaAppMenuObjects.*;
import static net.zatca.zatca.mobile.objects.ZatcaAppLoginObjects.*;

public class ZatcaAppProfilePage {

    public void navigateToHome() {
        MobileActions.sleep(5);
        MobileActions.click(MNU_En,"Navigate to English Page");
        MobileActions.sleep(1);
        MobileActions.click(MNU_Skip,"Navigate to Login Page");
        MobileActions.sleep(4);
    }
    public void fillSignInForm(Map<String, String> data) {
        //MobileActions.waitForElementAtIntervals(TEXT_TIN, 1, 10);
        MobileActions.click(TEXT_TIN);
       // MobileActions.sleep(1);
        MobileActions.enterText(TEXT_TIN, data.get("TIN"), "Entered TIN : " + data.get("TIN"));
        MobileActions.click(TEXT_Password);
       // MobileActions.sleep(1);
        MobileActions.enterText(TEXT_Password, data.get("Password"), "Entered Password : " + data.get("Password"));
    }
    public void hideKeyboard(){
        MobileDriverManager.getDriver().hideKeyboard();
        MobileActions.sleep(2);
    }

    public void logIn() {

        MobileActions.click(BUTTON_Login);
        MobileActions.sleep(2);

    }

    public void enterOTP()throws Exception{
        MobileActions.click(ENTER_OTP_FIRST_DIGIT_CLICK,"Clicked on ENTER OTP First Digit");
//        MobileActions.sleep(1);
        MobileDriverManager.getDriver().pressKey(new KeyEvent(AndroidKey.DIGIT_0));
        MobileDriverManager.getDriver().pressKey(new KeyEvent(AndroidKey.DIGIT_1));
        MobileDriverManager.getDriver().pressKey(new KeyEvent(AndroidKey.DIGIT_0));
        MobileDriverManager.getDriver().pressKey(new KeyEvent(AndroidKey.DIGIT_6));
        // Post entering OTP android keyboard must be hidden to enable Next button control
        MobileDriverManager.getDriver().pressKey(new KeyEvent(AndroidKey.TAB));

        MobileActions.hideKeyboard();
    }
    public void enterOTP_LoginPage()throws Exception{
//        MobileActions.click(ENTER_OTP_FIRST_DIGIT_CLICK,"Clicked on ENTER OTP First Digit");
//        MobileActions.sleep(1);
        MobileDriverManager.getDriver().pressKey(new KeyEvent(AndroidKey.DIGIT_0));
        MobileDriverManager.getDriver().pressKey(new KeyEvent(AndroidKey.DIGIT_1));
        MobileDriverManager.getDriver().pressKey(new KeyEvent(AndroidKey.DIGIT_0));
        MobileDriverManager.getDriver().pressKey(new KeyEvent(AndroidKey.DIGIT_6));
        // Post entering OTP android keyboard must be hidden to enable Next button control
        MobileActions.hideKeyboard();
        MobileActions.sleep(4);
    }

    public void customerProfileValidation(){
        Helper.log("Customer Name: "+MobileActions.getText(LABEL_Customer_Name));
        Helper.log("My Commitments: "+MobileActions.getText(LABEL_Customer_Funds));
        MobileActions.takeScreenshot();
        MobileActions.sleep(1);
    }
    public void homeScreenValidation(){
        Assert.assertTrue(MobileActions.checkIfWebElementExists(PENDINGBILLS_HOMESCREEN_LABEL),"Home screen is shown");
        MobileActions.takeScreenshot();
        MobileActions.sleep(1);
    }
    public void navigateToReturns(){
        MobileActions.click(MNU_Hamburger,"Clicked on hamburger menu");
        MobileActions.sleep(1);
        MobileActions.click(MNU_Returns,"Clicked on Returns");
        MobileActions.sleep(5);
    }

    public void navigateToInstallmentPlans(){
        MobileActions.click(MNU_Hamburger,"Clicked on hamburger menu");
        MobileActions.sleep(1);
        MobileActions.click(MNU_Installment_Plans,"Clicked on Installment Plans");
        MobileActions.sleep(5);
    }

    public void navigateToVATReturns(){
        MobileActions.click(MNU_All,"Clicked on All Tax Types");
        MobileActions.sleep(1);
        TouchAction action = new TouchAction(MobileDriverManager.getDriver());
        action.tap(PointOption.point(537, 1918)).release().perform();
        MobileActions.sleep(1/2);
        action.tap(PointOption.point(537, 1918)).release().perform();
        MobileActions.sleep(1/2);
        action.tap(PointOption.point(537, 1918)).release().perform();
        MobileActions.sleep(1/2);
        action.tap(PointOption.point(936, 1295)).release().perform();
        MobileActions.sleep(1/2);
    }

    public void navigateToUnsubmittedVAT(){
        MobileActions.click(FILTER_UnSubmitted,"Clicked on Unsubmitted filter..");
        MobileActions.sleep(2);
        Helper.log("Selected VAT Form Period: "+MobileActions.getText(FORM_VAT));
        MobileActions.sleep(1);
        MobileActions.click(FORM_VAT,"Clicked on VAT Form to submit");
        MobileActions.sleep(2);
    }

    public void submitDeclaration(){
        MobileActions.click(CHK_DECLARATION,"Clicked on Declaration");
        MobileActions.sleep(1);
        MobileActions.click(BUTTON_NEXT,"Submit Declaration->Clicked on Next button");
        MobileActions.sleep(1);
    }

    public void submitVATReturnForm(){

        MobileActions.click(BUTTON_NEXT,"Submit Declaration->Clicked on Next button");
        MobileActions.sleep(1);
    }
    public void fillVATOnSalesForm(Map<String, String> data){

        List<MobileElement> textboxes = MobileDriverManager.getDriver().findElementsByClassName("android.widget.EditText");

        for(MobileElement textbox : textboxes){
            System.out.println(textbox.getText());

            if(textbox.getText().equals("0.00")){
                textbox.click();
                textbox.sendKeys(data.get("StandardRateSaleAmt"));
                break;
            }
        }
    MobileDriverManager.getDriver().hideKeyboard();

    }

    public void fillVATOnPurchasesForm(Map<String, String> data){

        List<MobileElement> textboxes = MobileDriverManager.getDriver().findElementsByClassName("android.widget.EditText");

        for(MobileElement textbox : textboxes){
            System.out.println(textbox.getText());

            if(textbox.getText().equals("0.00")){
                textbox.click();
                textbox.sendKeys(data.get("StandardRatePurchaseAmt"));
                break;
            }

        }

        /*MobileDriverManager.getDriver().pressKey(new KeyEvent(AndroidKey.TAB));
        MobileActions.click(CHK_DECLARATION,"Clicked on Declaration");
        MobileActions.sleep(1);
        MobileActions.click(BUTTON_NEXT,"Clicked on Next button");
        MobileActions.sleep(1);*/
        MobileDriverManager.getDriver().hideKeyboard();
    }

    public void clickNext(){
        MobileActions.click(BUTTON_NEXT,"Fill VAT On Purchase -> Clicked on Next button");
        MobileActions.sleep(2);
    }
    public void fillCorrectionsAmt(Map<String, String> data){

        List<MobileElement> textboxes = MobileDriverManager.getDriver().findElementsByClassName("android.widget.EditText");

        for(MobileElement textbox : textboxes){
            System.out.println(textbox.getText());

            if(textbox.getText().equals("0.00")){
                textbox.click();
                textbox.sendKeys(data.get("CorrectionsAmt"));
                break;
            }
        }
        MobileDriverManager.getDriver().hideKeyboard();

    }
    public void netVATSDue(Map<String,String> data){
        /*MobileActions.click(TEXT_CorrectionsFromPrevPeriod,"Clicked on Corrections from previous Period text box");
        MobileActions.enterText(TEXT_CorrectionsFromPrevPeriod,data.get("CorrectionsAmt"));*/
        fillCorrectionsAmt(data);
        //MobileDriverManager.getDriver().hideKeyboard();
        clickNext();
        MobileActions.sleep(2);
    }
    public void summaryVATReturn() throws IOException {

        String command = "adb shell input swipe 500 1000 300 300";
        Runtime.getRuntime().exec(command);
        MobileActions.takeScreenshot();
        MobileActions.sleep(2);
        String command1 = "adb shell input swipe 530 1820 530 1120";
        Runtime.getRuntime().exec(command1);
        MobileActions.sleep(2);
        MobileActions.click(CHK_SUMMARY_DECLARATION,"Summary VAT Return -> Clicked on Declaration");
        MobileActions.sleep(1);
        MobileActions.click(BUTTON_Submit,"Clicked on Submit");
        MobileActions.sleep(15);
        MobileActions.takeScreenshot();
        MobileActions.sleep(1);
    }
    public void captureReferenceNumber(){
        Helper.log("Reference Number: "+MobileActions.getText(LABEL_Reference_Number));
        Helper.log("Taxable Period: "+MobileActions.getText(LABEL_Taxable_Period));
        MobileActions.click(BUTTON_Refresh,"Clicked on Refresh");
        MobileActions.sleep(2);
        MobileActions.takeScreenshot();
        MobileActions.sleep(1);
    }

    public void payNow(){
        MobileActions.click(BUTTON_PayNow,"Clicked on Pay Now");
    }
    public void paymentMethod(){
        MobileActions.takeScreenshot();
        MobileActions.sleep(1);
        MobileActions.click(BUTTON_SADAD,"Clicked on SADAD");
        MobileActions.sleep(1);
        MobileActions.takeScreenshot();
        MobileActions.sleep(1);
        MobileActions.click(BUTTON_Done,"Clicked on Done");

    }


}
