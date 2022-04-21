package net.zatca.zatca.mobile;

import net.zatca.zatca.mobile.pages.ZatcaAppMenu;
import net.zatca.zatca.mobile.pages.ZatcaAppPages;
import net.zatca.zatca.mobile.pages.ZatcaAppProfilePage;

public class ZatcaApp {
    public final ZatcaAppPages pages;
    /*public final ZatcaAppProfilePage profilePages;
    public final ZatcaAppMenu appMenuPages;*/

    public ZatcaApp() {
        pages = new ZatcaAppPages();
       /* profilePages = new ZatcaAppProfilePage();
        appMenuPages=new ZatcaAppMenu();*/
    }
}
