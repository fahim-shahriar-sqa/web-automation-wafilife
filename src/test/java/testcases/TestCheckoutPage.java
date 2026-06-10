package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utilities.DriverSetup;

public class TestCheckoutPage extends DriverSetup {

    BasePage basePage = new BasePage();
    HomePage homePage = new HomePage();
    SigninPage signinPage = new SigninPage();
    ProfilePage profilePage = new ProfilePage();
    CartPage cartPage = new CartPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Test(priority = 1)
    public void login() throws InterruptedException {
        homePage.loadAPage(homePage.url);
        homePage.window_maximize();
        homePage.click(homePage.popup_close);
        homePage.click(homePage.signin_btn);
        signinPage.click(signinPage.login_with_email);
        signinPage.writeOnElement(signinPage.email_input, signinPage.email);
        signinPage.writeOnElement(signinPage.password_input, signinPage.password);
        signinPage.click(signinPage.login_btn);
        Assert.assertEquals(profilePage.getElementText(profilePage.logout_btn), profilePage.logout_btn_txt);
        Assert.assertEquals(profilePage.getElementText(profilePage.personal_info), profilePage.txt);
        System.out.println("logged in Successfully");
    }

    @Test(priority = 2)
    public void addToCart() throws InterruptedException{
        getDriver().navigate().to(homePage.url);
        homePage.clickOnElement(homePage.author);
        homePage.scrollElement(homePage.play_store);
        homePage.clickOnElement(homePage.nextpage_btn);
        homePage.clickOnElement(homePage.author_name);
        homePage.clickOnElement(homePage.book);
        System.out.println("added to cart Successfully");
    }

    @Test(priority = 3)
    public void checkout() throws InterruptedException {
        getDriver().navigate().to(homePage.url);
        homePage.click(homePage.cart_btn);
        cartPage.click(cartPage.order_now);
        checkoutPage.writeOnElement(checkoutPage.name_field, checkoutPage.name);
        checkoutPage.writeOnElement(checkoutPage.phone_field, checkoutPage.phone);
        checkoutPage.writeOnElement(checkoutPage.alt_phone_field, checkoutPage.alt_phone);
        checkoutPage.writeOnElement(checkoutPage.email_field, checkoutPage.email);

        checkoutPage.clickOnElement(checkoutPage.select_district);
        checkoutPage.writeOnElement(checkoutPage.find_district, checkoutPage.district);
        checkoutPage.clickOnElement(checkoutPage.select_district_name);

        checkoutPage.clickOnElement(checkoutPage.select_area);
        checkoutPage.writeOnElement(checkoutPage.find_area, checkoutPage.area);
        checkoutPage.clickOnElement(checkoutPage.select_area_name);

        checkoutPage.writeOnElement(checkoutPage.address_field, checkoutPage.address);
        checkoutPage.click(checkoutPage.COD_btn);
        System.out.println("Order Created Successfully");
    }

    @Test(priority = 4)
    public void logout(){
        homePage.loadAPage(homePage.url);
        homePage.clickOnElement(homePage.signin_btn);
        profilePage.clickOnElement(profilePage.logout_btn);
        homePage.refresh();
        Assert.assertEquals(homePage.getElementText(homePage.signin_btn), "Sign In");
        System.out.println("Logged out Successfully");
//        System.out.println(homePage.getElementText(homePage.signin_btn));
    }
}
