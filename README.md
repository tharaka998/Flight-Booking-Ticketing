
## Getting Started

### Prerequisites

- Java JDK (version 8 or higher)
- Maven
- Chrome browser
- ChromeDriver (place in the `drivers/` folder)

### Installing Dependencies

1. Open the project in an IDE (e.g., IntelliJ IDEA or Eclipse).
2. Ensure all dependencies are installed by running:
   ```bash
   mvn clean install


https://github.com/user-attachments/assets/4dc448ea-7cbe-4b5f-b8ea-329ae94f8d7b


**Configurations**
- Base URL: Defined in Config.java under config/ package. This points to the PHP Travels website.
- Global Variables: Defined in GlobalVariables.java under config/ package. This file holds values such as:
- Departure location (DXB)
- Destination location (CMB)
- Departure date (automatically set to 90 days from the current date)
- Number of adults and children

**  Test Flow**
- The FullTest test class performs the complete booking flow on PHP Travels as outlined below:

**1. Navigating to the Flights Tab**
- Page: FlightsPage
- Action: Opens the Flights tab and selects "One-Way" as the trip type.

**2. Entering Flight Details**
- Page: FlightsPage
- Action: Inputs the departure location (DXB), destination (CMB), and sets the departure date to 90 days from the current date.
- Data: Uses dynamic date generation to calculate the date based on the current date.

**3. Setting Passenger Details**
- Page: FlightsPage
- Action: Opens the passengers modal and sets the number of adults and children (based on values in GlobalVariables).
- Data:
- Adults count: 2
- Children count: 1

**4. Searching for Flights**
- Page: FlightsPage
- Action: Clicks the "Search" button to display available flights based on the provided input.

**5. Verifying Search Results**
- Page: SearchResultsPage
- Verification: Checks that the search results page shows the correct departure location, destination, and passenger count as entered.
- Departure Location: Should match DXB
- Destination Location: Should match CMB
- Adults: 2
- Children: 1
- Selection: Selects the first available flight from the results.

**6. Entering Passenger Information**
- Page: PassengerDetailsPage
- Action: Inputs dummy passenger details such as name, email, and phone number.
- Data:
- Name: "John Doe"
- Email: "johndoe@example.com"
- Phone: "1234567890"
- Navigation: Proceeds to the next page after entering details.

**7. Final Verification on Confirmation Page**
- Page: FinalVerificationPage
- Verification: Confirms that the details displayed on the final page match the initial inputs.
- Departure Location: DXB
- Destination Location: CMB
- Departure Date: Date calculated as 90 days from the current date
- Passenger Details: Name, email, and phone should match the entered values.
- Data Verification
- The following fields are verified during the test flow:

**Flight Search Verification (Search Results Page):**

- Departure and destination locations.
- Passenger count (adults and children).
- Final Confirmation Verification (Final Page):
- 
- Departure and destination locations.
- Departure date.
- Passenger details (name, email, phone).
- Running the Tests
- Running Tests via IDE
- Open FullTest.java in your IDE.
- Right-click on the test file and choose Run 'FullTest' if you have a TestNG plugin installed.
