package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{
    public String url = "https://www.wafilife.com/";
    public String title = "Buy Islamic Books - Online Book Shop in Bangladesh | Wafilife.com";
    public By popup_close = By.cssSelector(".h-5.w-5[xmlns='http://www.w3.org/2000/svg']");
    public By signin_btn = By.xpath("//span[@aria-label='Authentication']");
    public By author = By.xpath("//span[contains(text(),'লেখক')]");
    public By page_num = By.xpath("//a[normalize-space()='1']");
    public By next_btn = By.xpath("//li[@title='下一页']//a//*[name()='svg']");

}
