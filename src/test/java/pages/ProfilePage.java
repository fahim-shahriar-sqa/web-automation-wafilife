package pages;

import org.openqa.selenium.By;
import utilities.DriverSetup;

public class ProfilePage extends BasePage {
    public By logout_btn = By.xpath("//span[normalize-space()='Logout']");
    public String logout_btn_txt = "Logout";
}
