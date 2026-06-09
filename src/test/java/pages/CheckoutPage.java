package pages;

import org.openqa.selenium.By;

public class CheckoutPage extends BasePage{
    public String url = "https://www.wafilife.com/checkout";
    public By name_field = By.xpath("//input[@id='firstName']");
    public String name = "Test";
    public By phone_field = By.xpath("//input[@id='phone']");
    public String phone = "01645678945";
    public By alt_phone_field = By.xpath("//input[@id='alternativePhone']");
    public String alt_phone = "01645624945";
    public By email_field = By.xpath("//input[@id='email']");
    public String email = "test@yopmail.com";
    public By address_field = By.xpath("//textarea[@id='address1']");
    public String address = "123 Main Street, Apt 4B, Springfield, IL 62704, USA";

    public By select_district = By.cssSelector("button[id='headlessui-listbox-button-_R_6rkj55av5tijb_'] span[class='flex truncate items-center text-sm font-medium ltr:pl-2.5 rtl:pr-2.5 relative opacity-70']");
    public By find_district = By.xpath("//input[@placeholder='জেলা খুঁজুন...']");
    public String district = "Narayanganj";
    public By select_district_name = By.xpath("//span[@class='flex items-center']");

    public By select_area = By.xpath("//span[contains(text(),'এরিয়া/উপজেলা সিলেক্ট করুন')]");
    public By find_area = By.xpath("//input[@placeholder='এরিয়া/উপজেলা খুঁজুন...']");
    public String area = "Narayanganj";
    public By select_area_name = By.cssSelector("span[class='block truncate text-sm ltr:pl-2.5 rtl:pr-2.5 md:ltr:pl-3 md:rtl:pr-3 font-normal']");

    public By COD_btn = By.xpath("//input[@value='cod']");
    public By submitOrderBtn = By.xpath("//button[normalize-space()='অর্ডার সাবমিট করুন']");
}
