package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SearchResultsPage {
    private WebDriver driver;
    private By firstFlightSelect = By.xpath("//button[contains(text(), 'Select')]");

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifySearchResults(String from, String to, int adultsCount, int childrenCount) {
        Assert.assertTrue(driver.getPageSource().contains(from), "Departure location does not match.");
        Assert.assertTrue(driver.getPageSource().contains(to), "Destination location does not match.");
        Assert.assertTrue(driver.getPageSource().contains("Adults: " + adultsCount), "Adult count does not match.");
        Assert.assertTrue(driver.getPageSource().contains("Children: " + childrenCount), "Children count does not match.");
    }

    public void selectFirstFlight() {
        driver.findElement(firstFlightSelect).click();
    }
}
