package pages;

import org.openqa.selenium.By;

public class CartPage extends BasePage{
    public String url = "https://www.wafilife.com/cart";
    public By order_now = By.xpath("(//span[@class='py-0.5'][contains(text(),'অর্ডার করতে এগিয়ে যান')])[1]");

}
