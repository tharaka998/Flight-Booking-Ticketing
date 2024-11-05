package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PassengerDetailsPage {
    private WebDriver driver;
    private By nameInput = By.id("name");
    private By emailInput = By.id("email");
    private By phoneInput = By.id("phone");
    private By nextButton = By.id("next_button");

    public PassengerDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterPassengerDetails(String name, String email, String phone) {
        driver.findElement(nameInput).sendKeys(name);
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(phoneInput).sendKeys(phone);
    }

    public void proceedToNextPage() {
        driver.findElement(nextButton).click();
    }
}
