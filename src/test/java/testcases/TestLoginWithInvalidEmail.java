package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProfilePage;
import pages.SigninPage;
import utilities.DriverSetup;

public class TestLoginWithInvalidEmail extends DriverSetup {

    HomePage homePage = new HomePage();
    SigninPage signinPage = new SigninPage();
    ProfilePage profilePage = new ProfilePage();

    @Test
    public void loginWithInvalidEmail(){
        homePage.loadAPage(homePage.url);
        homePage.window_maximize();
        homePage.click(homePage.popup_close);
        homePage.click(homePage.signin_btn);
        signinPage.click(signinPage.login_with_email);
        signinPage.writeOnElement(signinPage.email_input, "email");
        signinPage.writeOnElement(signinPage.password_input, signinPage.password);
        signinPage.click(signinPage.login_btn);
        Assert.assertEquals(signinPage.getElementText(signinPage.invalid_email), signinPage.invalid_email_error_text);
    }
}
