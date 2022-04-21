package net.zatca.zatca.mobile.objects;

import org.openqa.selenium.By;

public class ZatcaAppCommonObjects {

    // Banner Objects
    public static By getBannerMessageObject(String message) {
        String xpath = "//*[contains(@content-desc,'" + message + "')]";
        return By.xpath(xpath);
    }
}
