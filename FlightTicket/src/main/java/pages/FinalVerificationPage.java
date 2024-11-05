package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FinalVerificationPage {
    private WebDriver driver;

    public FinalVerificationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyFinalDetails(String expectedFrom, String expectedTo, String departureDate) {
        Assert.assertTrue(driver.getPageSource().contains(expectedFrom), "Final departure location does not match.");
        Assert.assertTrue(driver.getPageSource().contains(expectedTo), "Final destination location does not match.");
        Assert.assertTrue(driver.getPageSource().contains(departureDate), "Final departure date does not match.");
    }
}
