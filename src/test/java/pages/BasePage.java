package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import utilities.DriverSetup;

public class BasePage extends DriverSetup {

    public WebElement getElement(By locator){
        return getDriver().findElement(locator);
    }

    public void loadAPage(String url){
        getDriver().get(url);
    }

    public String getCurrentUrl(){
        return getDriver().getCurrentUrl();
    }

    public String getPageTitle(){
        return getDriver().getTitle();
    }

    public void window_minimize(){
        getDriver().manage().window().minimize();
    }

    public void window_maximize(){
        getDriver().manage().window().maximize();
    }

    public void window_fullscreen(){
        getDriver().manage().window().fullscreen();
    }

    public void navigateToUrl(String url){
        getDriver().navigate().to(url);
    }

    public void navigateBack(){
        getDriver().navigate().back();
    }

    public void navigateForward(){
        getDriver().navigate().forward();
    }

    public void refresh(){
        getDriver().navigate().refresh();
    }

    public void newTab(){
        getDriver().switchTo().newWindow(WindowType.TAB);
    }

    public void newWindow(){
        getDriver().switchTo().newWindow(WindowType.WINDOW);
    }

    public String getHandles(){
        return getDriver().getWindowHandles().toString();
    }

    public String getElementText(By locator){
        return getElement(locator).getText();
    }

    public void clickOnElement(By locator){
        getElement(locator).click();
    }

    public void clearField(By locator){
        getElement(locator).clear();
    }

    public void writeOnElement(By locator, String text){
        getElement(locator).sendKeys(text);
    }

    public boolean visibleState(By locator){
        return getElement(locator).isDisplayed();
    }

    public boolean enabledState(By locator){
        return getElement(locator).isEnabled();
    }

    public boolean selectedState(By locator){
        return getElement(locator).isSelected();
    }

    public Alert switchToAlert() {
        return DriverSetup.getDriver().switchTo().alert();
    }

    public String getAlertText() {
        return switchToAlert().getText();
    }

    public void acceptAlert() {
        switchToAlert().accept();
    }

    public void dismissAlert() {
        switchToAlert().dismiss();
    }

    public void writeOnAlert(String text) {
        switchToAlert().sendKeys(text);
    }

    public void switchToFrame(By locator) {
        DriverSetup.getDriver().switchTo().frame(getElement(locator));
    }

    public void switchToDefaultContent() {
        DriverSetup.getDriver().switchTo().defaultContent();
    }

    public void switchToParentFrame() {
        DriverSetup.getDriver().switchTo().parentFrame();
    }



    public void scrollAmount(int x, int y){
        Actions actions = new Actions(getDriver());
        actions.scrollByAmount(x,y).build().perform();
    }

    public void scrollElement(By locator){
        Actions actions = new Actions(getDriver());
        actions.scrollToElement(getElement(locator)).build().perform();
    }

    public void movetoElement(By locator){
        Actions actions = new Actions(getDriver());
        actions.moveToElement(getElement(locator)).build().perform();
    }

    public void click(By locator){
        Actions actions = new Actions(getDriver());
        actions.click(getElement(locator)).build().perform();
    }

    public void doubleClick(By locator){
        Actions actions = new Actions(getDriver());
        actions.doubleClick(getElement(locator)).build().perform();
    }

    public void dragAndDrop(By locator1, By locator2){
        Actions actions = new Actions(getDriver());
        actions.dragAndDrop(getElement(locator1),getElement(locator2)).build().perform();
    }
}
