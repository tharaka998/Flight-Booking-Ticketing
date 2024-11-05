package tests;
import config.Config;
import config.GlobalVariables;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;
import utils.WebDriverUtils;

public class FullTest {
    private WebDriver driver;
    private FlightsPage flightsPage;
    private SearchResultsPage searchResultsPage;
    private PassengerDetailsPage passengerDetailsPage;
    private FinalVerificationPage finalVerificationPage;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverUtils.initializeDriver();
        driver.manage().window().maximize();
        driver.get(Config.BASE_URL);
        flightsPage = new FlightsPage(driver);
        searchResultsPage = new SearchResultsPage(driver);
        passengerDetailsPage = new PassengerDetailsPage(driver);
        finalVerificationPage = new FinalVerificationPage(driver);
    }

    @Test
    public void testFlightBooking() {
        flightsPage.goToFlightsTab();
        flightsPage.selectOneWay();
        flightsPage.enterFlightDetails();
        flightsPage.setPassengers();
        flightsPage.searchFlights();
        searchResultsPage.verifySearchResults(GlobalVariables.FROM_LOCATION, GlobalVariables.TO_LOCATION, GlobalVariables.ADULTS_COUNT, GlobalVariables.CHILDREN_COUNT);
        searchResultsPage.selectFirstFlight();
        passengerDetailsPage.enterPassengerDetails("John Doe", "johndoe@example.com", "1234567890");
        passengerDetailsPage.proceedToNextPage();
        finalVerificationPage.verifyFinalDetails(GlobalVariables.FROM_LOCATION, GlobalVariables.TO_LOCATION, GlobalVariables.DEPARTURE_DATE);
    }

//    @AfterMethod
//    public void tearDown() {
//        if (driver != null) { driver.quit(); }
//    }
}