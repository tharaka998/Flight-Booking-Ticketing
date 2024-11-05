package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import config.GlobalVariables;

public class FlightsPage {
    private WebDriver driver;

    // Define locators for elements on the Flights page
    private By flightsTab = By.xpath("//*[@id=\"tab\"]/li[2]/button"); // Click on Flights tab
    private By oneWayOption = By.xpath("//small[normalize-space()='One Way']"); // Select One-Way option
    private By fromInput = By.xpath("//*[@id=\"onereturn\"]/div[1]/div[1]/div[2]/span/span[1]/span"); // Input for departure location
    private By toInput = By.xpath("//span[@class='select2 select2-container select2-container--default select2-container--below select2-container--focus']//div[@class='mt-2 show active']"); // Input for destination location
    private By departureDateInput = By.xpath("//input[@id='departure']"); // Date picker for departure date
    private By passengersToggle = By.xpath("//a[@href='#passengerModal']"); // Toggle to open passengers modal
    private By adultsCount = By.xpath("//select[@name='adults']"); // Dropdown for number of adults
    private By childrenCount = By.xpath("//select[@name='children']"); // Dropdown for number of children
    private By searchButton = By.xpath("//button[contains(text(),'Search')]"); // Search button

    public FlightsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Navigate to the Flights tab
    public void goToFlightsTab() {
        driver.findElement(flightsTab).click();
    }

    // Select One-Way option
    public void selectOneWay() {
        driver.findElement(oneWayOption).click();
    }

    // Enter flight details such as departure, destination, and date
    public void enterFlightDetails() {
        driver.findElement(fromInput).sendKeys(GlobalVariables.FROM_LOCATION);
        driver.findElement(toInput).sendKeys(GlobalVariables.TO_LOCATION);
        driver.findElement(departureDateInput).sendKeys(GlobalVariables.DEPARTURE_DATE);
    }

    // Set the number of passengers (adults and children)
    public void setPassengers() {
        driver.findElement(passengersToggle).click();
        driver.findElement(adultsCount).sendKeys(String.valueOf(GlobalVariables.ADULTS_COUNT));
        driver.findElement(childrenCount).sendKeys(String.valueOf(GlobalVariables.CHILDREN_COUNT));
    }

    // Perform search for flights
    public void searchFlights() {
        driver.findElement(searchButton).click();
    }
}
