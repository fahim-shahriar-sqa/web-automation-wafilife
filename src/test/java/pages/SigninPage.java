package pages;

import org.openqa.selenium.By;

public class SigninPage extends BasePage{
    public String url = "https://www.wafilife.com/signin?redirect=%2Fmy-account";
    public By login_with_email = By.xpath("//button[contains(text(),'ইমেইল দিয়ে লগইন করুন')]");
    public By email_input = By.xpath("//input[@id='email']");
    public By password_input = By.xpath("//input[@id='password']");
    public String email = "test@yopmail.com";
    public String password = "Automation%1234";
    public By login_btn = By.cssSelector("div[class='w-full transition-all duration-200 ease-in-out hidden lg:flex lg:max-w-[650px] 2xl:max-w-[800px] lg:ltr:ml-7 lg:rtl:mr-7 lg:ltr:mr-5 lg:rtl:ml-5 top-bar-search'] form[role='search']");
    public By account_btn = By.xpath("//span[@aria-label='Authentication']");
    public By error_massage = By.cssSelector("div[id='1']");
    public String error_massage_text = "Invalid password. Please check your password and try again." ;
}
