package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class DriverSetup {

    // Reads browser name from JVM argument.
    // Example: mvn test -Dbrowser=chrome
    private static String browser_name = System.getProperty("browser", "chrome");

    // ThreadLocal ensures each test thread gets its own WebDriver instance.
    // Useful for parallel test execution.
    private static final ThreadLocal<WebDriver> DRIVER_THREAD_LOCAL = new ThreadLocal<>();

    // Returns the WebDriver instance associated with the current thread.
    public static void setDriver(WebDriver driver) {
        DriverSetup.DRIVER_THREAD_LOCAL.set(driver);
    }

    public static WebDriver getDriver() {
        return DRIVER_THREAD_LOCAL.get();
    }

    @BeforeMethod
    public void startBrowser(){
        WebDriver driver = getBrowser(browser_name);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        setDriver(driver);
    }

    @AfterMethod
    public void closeBrowser(){
        getDriver().quit();
    }

    // Creates and returns the browser instance based on the provided name.
    public WebDriver getBrowser(String name) {
        if (name.equalsIgnoreCase("edge"))
            return new EdgeDriver();
        else if (name.equalsIgnoreCase("chrome"))
            return new ChromeDriver();
        else if (name.equalsIgnoreCase("firefox"))
            return new FirefoxDriver();
        else {
            throw new RuntimeException("Browser is not available with the given name: " + name);
        }
    }
}