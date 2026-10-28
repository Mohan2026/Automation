# BlazeDemo UI Automation (Selenium + TestNG)

UI test automation for the [BlazeDemo](https://blazedemo.com) travel booking demo site, built with Java, Selenium WebDriver, and TestNG.

## Tech stack

| Area | Tool |
|---|---|
| Language | Java |
| Build | Maven |
| Browser automation | Selenium WebDriver 3.141.59 |
| Test runner | TestNG 6.14.3 |
| Driver management | WebDriverManager 4.2.1 |

## Application under test

BlazeDemo is a demo flight-booking site. The tests exercise its booking flow in the browser.

## Scenarios covered

<!-- Replace with the tests that are actually in src/test/java/org/newproj -->
- [Scenario 1, e.g. search flights between two cities]
- [Scenario 2, e.g. choose a flight from the results]
- [Scenario 3, e.g. complete a purchase and verify the confirmation page]

## Project structure

```
.
├── src/test/java/org/newproj   # Test classes
├── testng.xml                  # TestNG suite configuration
└── pom.xml                     # Maven dependencies
```

## Prerequisites

- JDK 8 or later
- Maven 3.x
- Google Chrome (or the browser configured in the tests)

WebDriverManager downloads the matching browser driver automatically, so no manual driver setup is needed.

## Running the tests

From the command line:

```bash
mvn clean test
```

To run the suite defined in `testng.xml`:

```bash
mvn test -DsuiteXmlFile=testng.xml
```

Or open the project in your IDE and run `testng.xml` as a TestNG suite.

## Reports

TestNG writes HTML and XML results to `test-output/` after each run. Open `test-output/index.html` in a browser to view them.

## Notes

- The target site is a public demo, so availability and page content can change.
- Dependency versions are older and could be upgraded (Selenium 4, TestNG 7) in a future update.
