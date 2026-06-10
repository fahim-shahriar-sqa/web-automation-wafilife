package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProfilePage;
import pages.SigninPage;
import utilities.DriverSetup;

public class TestLoginWithEmptyCredentials extends DriverSetup {

    HomePage homePage = new HomePage();
    SigninPage signinPage = new SigninPage();
    ProfilePage profilePage = new ProfilePage();

    @Test
    public void loginWithEmptyCredentials(){
        homePage.loadAPage(homePage.url);
        homePage.window_maximize();
        homePage.click(homePage.popup_close);
        homePage.click(homePage.signin_btn);
        signinPage.click(signinPage.login_with_email);
        signinPage.writeOnElement(signinPage.email_input, "");
        signinPage.writeOnElement(signinPage.password_input, "");
        signinPage.click(signinPage.login_btn);

        Assert.assertEquals(signinPage.getElementText(signinPage.empty_email_error), signinPage.empty_email_error_txt);
        Assert.assertEquals(signinPage.getElementText(signinPage.empty_password_error), signinPage.empty_password_error_txt);

        System.out.println(signinPage.getElementText(signinPage.empty_email_error));
        System.out.println(signinPage.getElementText(signinPage.empty_password_error));
    }
}
