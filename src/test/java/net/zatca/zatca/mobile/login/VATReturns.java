package net.zatca.zatca.mobile.login;

import net.zatca.ZatcaModule;
import net.zatca.base.ZatcaMobileTest;
import org.testng.annotations.Test;

import java.util.Map;

public class VATReturns extends ZatcaMobileTest {

    @Test(dataProvider = "testDataProvider", testName = "TC001", description = "test")
    public void submitVATReturns(Map<String, String> data) throws Exception {
        ZatcaModule zatcaModule = new ZatcaModule();

        zatcaModule.zatcaApp.pages.profilePage.navigateToHome();
        zatcaModule.zatcaApp.pages.profilePage.fillSignInForm(data);
        zatcaModule.zatcaApp.pages.profilePage.hideKeyboard();
        zatcaModule.zatcaApp.pages.profilePage.logIn();
        zatcaModule.zatcaApp.pages.profilePage.enterOTP();
        zatcaModule.zatcaApp.pages.profilePage.customerProfileValidation();
        zatcaModule.zatcaApp.pages.profilePage.navigateToReturns();
        zatcaModule.zatcaApp.pages.profilePage.navigateToVATReturns();
        zatcaModule.zatcaApp.pages.profilePage.navigateToUnsubmittedVAT();
        zatcaModule.zatcaApp.pages.profilePage.submitDeclaration();
        zatcaModule.zatcaApp.pages.profilePage.submitVATReturnForm();
        zatcaModule.zatcaApp.pages.profilePage.fillVATOnSalesForm(data);
        zatcaModule.zatcaApp.pages.swipeToBottom();
        zatcaModule.zatcaApp.pages.profilePage.clickNext();
        zatcaModule.zatcaApp.pages.profilePage.fillVATOnPurchasesForm(data);
        zatcaModule.zatcaApp.pages.swipeToBottom();
        zatcaModule.zatcaApp.pages.profilePage.clickNext();
        zatcaModule.zatcaApp.pages.profilePage.netVATSDue(data);
        zatcaModule.zatcaApp.pages.profilePage.summaryVATReturn();
        zatcaModule.zatcaApp.pages.profilePage.captureReferenceNumber();
        zatcaModule.zatcaApp.pages.profilePage.payNow();
        zatcaModule.zatcaApp.pages.profilePage.paymentMethod();

    }
    @Test(dataProvider = "testDataProvider", testName = "TC002", description = "test")
    public void installmentPlanZatca(Map<String, String> data) throws Exception {
        ZatcaModule zatcaModule = new ZatcaModule();

        zatcaModule.zatcaApp.pages.profilePage.navigateToHome();
        zatcaModule.zatcaApp.pages.profilePage.fillSignInForm(data);
        zatcaModule.zatcaApp.pages.profilePage.hideKeyboard();
        zatcaModule.zatcaApp.pages.profilePage.logIn();
        zatcaModule.zatcaApp.pages.profilePage.enterOTP();
        zatcaModule.zatcaApp.pages.profilePage.customerProfileValidation();
        zatcaModule.zatcaApp.pages.profilePage.navigateToInstallmentPlans();

    }
}
