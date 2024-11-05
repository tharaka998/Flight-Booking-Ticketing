package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WebDriverUtils {

    // Method to initialize the WebDriver
    public static WebDriver initializeDriver() {
        // Set the path for the ChromeDriver executable (update the path if needed)
        System.setProperty("webdriver.chrome.driver",  "D:\\Automation Projects\\chromedriver-win64\\chromedriver.exe");

        // Optional: Configure ChromeOptions if any specific browser settings are needed
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        // Initialize WebDriver with ChromeOptions


        // Configure implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        return driver;
    }
}
