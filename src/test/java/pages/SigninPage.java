package pages;

import org.openqa.selenium.By;

public class SigninPage extends BasePage{
    public String url = "https://www.wafilife.com/signin?redirect=%2Fmy-account";
    public By login_with_email = By.xpath("//button[contains(text(),'ইমেইল দিয়ে লগইন করুন')]");
    public By email_input = By.xpath("//input[@id='email']");
    public By password_input = By.xpath("//input[@id='password']");
    public String email = "test@yopmail.com";
    public String password = "Automation%1234";
    public By login_btn = By.cssSelector("button[class='group text-base leading-4 inline-flex items-center cursor-pointer transition ease-in-out duration-300 text-center justify-center tracking-[0.2px] rounded placeholder-white focus-visible:outline-none focus:outline-none h-10 md:h-12 bg-brand text-brand-light font-roboto px-3 lg:px-4 py-4 md:py-3.5 lg:py-4 hover:text-white hover:bg-opacity-90 focus:bg-opacity-70 w-full mt-2 tracking-normal h-11 md:h-12 font-15px md:font-15px']");
    public By account_btn = By.xpath("//span[@aria-label='Authentication']");
    //public By error_massage = By.name("name attribute is not available for this element");
    public By error_massage = By.xpath("//div[@role='alert' and contains(.,'Invalid password')]");
    public String error_massage_text = "Invalid password. Please check your password and try again." ;
    public By invalid_email = By.cssSelector(".my-2.text-13px.text-brand-danger.text-opacity-70");
    public String invalid_email_error_text = "অনুগ্রহ করে একটি সঠিক ইমেইল দিন";

}
