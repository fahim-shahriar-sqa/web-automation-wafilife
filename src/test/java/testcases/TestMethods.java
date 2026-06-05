package testcases;

import org.testng.annotations.Test;
import pages.BasePage;

public class TestMethods extends BasePage {


    BasePage basePage = new BasePage();

    @Test
    public void testMethods(){
        basePage.loadAPage("https://www.google.com/");
        System.out.println(basePage.getCurrentUrl());
        System.out.println(basePage.getPageTitle());
        basePage.window_minimize();
        basePage.window_fullscreen();
        basePage.window_maximize();
        basePage.navigateToUrl("https://www.facebook.com/");
        basePage.refresh();
        basePage.navigateBack();
        basePage.navigateForward();
        basePage.navigateToUrl("https://www.google.com/");
        basePage.newTab();
        basePage.newWindow();
        getDriver().close();
        System.out.println(basePage.getHandles());

    }

}
