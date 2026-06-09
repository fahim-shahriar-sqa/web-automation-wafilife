package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{
    public String url = "https://www.wafilife.com/";
    public String title = "Buy Islamic Books - Online Book Shop in Bangladesh | Wafilife.com";
    public By popup_close = By.cssSelector(".h-5.w-5[xmlns='http://www.w3.org/2000/svg']");
    public By signin_btn = By.xpath("//span[@aria-label='Authentication']");
    public String signin_btn_txt = "Account";
    public By author = By.xpath("//span[contains(text(),'লেখক')]");
    public By page_num = By.xpath("//a[normalize-space()='1']");
    public By nextpage_btn = By.xpath("//li[@title='下一页']//a//*[name()='svg']");
    public By play_store = By.xpath("//img[@alt='Play Store']");
    public By author_name = By.xpath("//h3[normalize-space()='Mahbub Hossain']");
    public By book = By.xpath("//a[contains(text(),'Rethingking Rural poverty: Bangladesh as a Case St')]");
    public By order_btn = By.xpath("(//span[contains(text(),'অর্ডার করুন')])[1]");
    public By cart_btn = By.cssSelector("span[class='text-sm font-normal lg:text-15px text-brand-dark ltr:ml-2 rtl:mr-2']");
}
