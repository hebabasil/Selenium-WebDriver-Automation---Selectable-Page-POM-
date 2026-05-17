Selenium WebDriver Automation – Selectable Page (POM)

This project is a Java-based automated testing suite for the DemoQA Selectable Page.
It uses Selenium WebDriver, TestNG, and the Page Object Model (POM) design pattern to ensure clean, maintainable, and scalable test automation.

🚀 Project Overview

The goal of this automation suite is to verify the functionality of the Selectable interaction on the DemoQA platform, covering both List and Grid views.

🧪 Test Scenarios Covered
1. Default State Verification
Ensures the List tab is active by default when the page loads.
2. List Selection
Switches to List view
Selects the item: "Dapibus ac facilisis in"
Verifies it becomes active using CSS class validation
3. Grid Selection
Switches to Grid view
Selects the item: "Three"
Verifies it becomes active
🛠️ Technologies Used
Java → Programming language
Selenium WebDriver → Browser automation
TestNG → Testing framework (assertions & test execution)
WebDriverManager → Automatic driver setup (Chrome)
POM (Page Object Model) → Separation of test logic and page actions
📂 Project Structure
src/
├── main/java/
│   └── Pages/
│       └── SelectablePage.java      # Page object model (actions & locators)
│
└── test/java/
    └── TestPackage/
        ├── TestBase.java            # Setup and teardown
        └── SelectableTest.java      # Test cases & assertions
⚙️ Key Features
Test Isolation
Each test runs independently using @BeforeMethod to reset browser state before execution.
Explicit Waits
Uses WebDriverWait with ExpectedConditions to handle dynamic elements and ensure stability.
Robust Assertions
Validates UI state by checking the presence of the active CSS class.
