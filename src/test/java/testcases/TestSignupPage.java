package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;
import pages.ProfilePage;
import pages.SigninPage;
import utilities.DriverSetup;

public class TestSignupPage extends DriverSetup {
    BasePage basePage = new BasePage();
    HomePage homePage = new HomePage();
    SigninPage signinPage = new SigninPage();
    ProfilePage profilePage = new ProfilePage();

    @Test
    public void loginWithValidCredentials(){
        homePage.loadAPage(homePage.url);
        homePage.window_maximize();
        homePage.click(homePage.popup_close);
        homePage.click(homePage.signin_btn);
        signinPage.click(signinPage.login_with_email);
        signinPage.writeOnElement(signinPage.email_input, signinPage.email);
        signinPage.writeOnElement(signinPage.password_input, signinPage.password);
        signinPage.click(signinPage.login_btn);
        Assert.assertEquals(profilePage.getElementText(profilePage.logout_btn), profilePage.logout_btn_txt);
        homePage.loadAPage(homePage.url);
        homePage.clickOnElement(homePage.signin_btn);
        profilePage.clickOnElement(profilePage.logout_btn);
    }

    @Test
    public void loginWithInvalidEmail(){
        homePage.loadAPage(homePage.url);
        homePage.window_maximize();
        homePage.click(homePage.popup_close);
        homePage.click(homePage.signin_btn);
        signinPage.click(signinPage.login_with_email);
        signinPage.writeOnElement(signinPage.email_input, "email");
        signinPage.writeOnElement(signinPage.password_input, "password");
        signinPage.click(signinPage.login_btn);
        Assert.assertEquals(signinPage.getElementText(signinPage.invalid_email), signinPage.invalid_email_error_text);
    }

    @Test
    public void loginWithInvalidPassword(){
        homePage.loadAPage(homePage.url);
        homePage.window_maximize();
        homePage.click(homePage.popup_close);
        homePage.click(homePage.signin_btn);
        signinPage.click(signinPage.login_with_email);
        signinPage.writeOnElement(signinPage.email_input, signinPage.email);
        signinPage.writeOnElement(signinPage.password_input, "password");
        signinPage.click(signinPage.login_btn);
        Assert.assertEquals(signinPage.getElementText(signinPage.error_massage), signinPage.error_massage_text);
    }

    @Test
    public void loginWithEmptyCredentials(){
        homePage.loadAPage(homePage.url);
        homePage.window_maximize();
        homePage.click(homePage.popup_close);
        homePage.click(homePage.signin_btn);
        signinPage.click(signinPage.login_with_email);
        signinPage.writeOnElement(signinPage.email_input, signinPage.email);
        signinPage.writeOnElement(signinPage.password_input, signinPage.password);
    }


//    @Test(dataProvider = "invalidUserCredentials", dataProviderClass = DataSet.class)
//    public void loginWithInvalidCredentials(String email, String password, String error_message){
//        homePage.loadAPage(homePage.url);
//        homePage.window_maximize();
//        homePage.click(homePage.popup_close);
//        homePage.click(homePage.signin_btn);
//        signinPage.click(signinPage.login_with_email);
//        signinPage.writeOnElement(signinPage.email_input, email);
//        signinPage.writeOnElement(signinPage.password_input, password);
//        signinPage.click(signinPage.login_btn);
//        Assert.assertEquals(signinPage.getElementText(signinPage.error_massage), error_message);
//    }
}
