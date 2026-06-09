package testcases;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;
import pages.SigninPage;
import utilities.DriverSetup;

public class TestMethods extends DriverSetup {
    BasePage basePage = new BasePage();
    HomePage homePage = new HomePage();
    SigninPage signinPage = new SigninPage();

    @Test
    public void loginWithValidCredentials(){
        homePage.loadAPage(homePage.url);
        homePage.window_maximize();
        homePage.click(homePage.popup_close);
        homePage.click(homePage.signin_btn);
        signinPage.click(signinPage.login_with_email);
        signinPage.writeOnElement(signinPage.email_input, signinPage.email);
        signinPage.writeOnElement(signinPage.password_input, signinPage.password);
    }
}
