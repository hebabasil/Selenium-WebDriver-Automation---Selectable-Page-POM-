Selenium WebDriver Automation – Selectable Page (POM)

This project is a Java-based automated testing suite for the DemoQA Selectable Page.
It uses Selenium WebDriver, TestNG, and the Page Object Model (POM) design pattern to ensure clean, maintainable, and scalable test automation.

🚀 Project Overview

The goal of this automation suite is to verify the functionality of the Selectable interaction on the DemoQA platform, covering both List and Grid views.


🛠️ Technologies Used:


Java → Programming language


Selenium WebDriver → Browser automation


TestNG → Testing framework (assertions & test execution)


WebDriverManager → Automatic driver setup (Chrome)


POM (Page Object Model) → Separation of test logic and page actions


⚙️ Key Features


Test Isolation :
Each test runs independently using @BeforeMethod to reset browser state before execution.


Explicit Waits:
Uses WebDriverWait with ExpectedConditions to handle dynamic elements and ensure stability.


Robust Assertions :
Validates UI state by checking the presence of the active CSS class.
