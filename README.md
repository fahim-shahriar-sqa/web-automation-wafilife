# WafiLife Web Automation Testing

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge\&logo=java\&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-Automation-green?style=for-the-badge\&logo=selenium)
![TestNG](https://img.shields.io/badge/TestNG-Testing-red?style=for-the-badge)
![Maven](https://img.shields.io/badge/Maven-Build-blue?style=for-the-badge\&logo=apachemaven)
![GitHub](https://img.shields.io/badge/GitHub-Repository-black?style=for-the-badge\&logo=github)

## 📖 Project Overview

This project is an automated testing framework for the WafiLife e-commerce website. The framework is built using Selenium WebDriver, Java, and TestNG following the Page Object Model (POM) design pattern to ensure maintainability, scalability, and reusability.

The automation suite validates core user journeys including authentication, book searching, author navigation, cart operations, and checkout functionality.

---

## 🚀 Technologies Used

* Java
* Selenium WebDriver
* TestNG
* Maven
* Page Object Model (POM)
* Allure Report
* Git & GitHub

---

## 🏗 Framework Architecture

The framework follows industry-standard automation design practices:

### Features

* Page Object Model (POM)
* Thread-safe WebDriver using ThreadLocal
* Reusable BasePage methods
* Explicit Wait implementation
* Dynamic Locator Handling
* Utility Classes
* Cross-Browser Support
* Scalable Test Structure
* Maven Dependency Management
* Allure Reporting

---

## 📂 Project Structure

```text
## 📂 Project Structure

```text
src
└── test
    └── java
        ├── pages
        │   ├── BasePage
        │   ├── HomePage
        │   ├── SigninPage
        │   ├── ProfilePage
        │   ├── CartPage
        │   └── CheckoutPage
        │
        ├── testcases
        │   ├── TestLoginWithValidCredentials
        │   ├── TestLoginWithInvalidEmail
        │   ├── TestLoginWithInvalidPassword
        │   ├── TestLoginWithEmptyCredentials
        │   ├── TestSignupPage
        │   ├── TestCheckoutPage
        │   └── TestFullProcessFlow
        │
        └── utilities
            └── DriverSetup

testng.xml

```

---

## ✅ Automated Test Scenarios

### Authentication

* Login with valid credentials
* Login with invalid email
* Login with invalid password
* Login with empty credentials
* Signup page validation

### Navigation

* Navigate to Author page
* Validate author listings

### Search Functionality

* Search books using keywords
* Validate search results

### Cart Management

* Add books to cart
* Verify cart contents

### Checkout Process

* Proceed to checkout
* Validate checkout workflow

### End-to-End Flow

* Login
* Search Book
* Add to Cart
* Checkout

---

## 🔧 Setup Instructions

### Clone Repository

```bash
git clone https://github.com/fahim-shahriar-sqa/web-automation-wafilife.git
```

### Navigate to Project

```bash
cd web-automation-wafilife
```

### Install Dependencies

```bash
mvn clean install
```

---

## ▶️ Running Tests

### Run All Tests

```bash
mvn test
```

### Run Through TestNG Suite

```bash
testng.xml
```

### Run Specific Browser

```bash
mvn test -Dbrowser=chrome
```

```bash
mvn test -Dbrowser=firefox
```

```bash
mvn test -Dbrowser=edge
```

---

## 🌐 Browser Support

| Browser | Supported |
| ------- | --------- |
| Chrome  | ✅         |
| Firefox | ✅         |
| Edge    | ✅         |

---

## 📊 Reporting

This project uses Allure Report for test execution reporting.

### Generate Allure Report

```bash
allure serve allure-results
```

The report provides:

* Test execution summary
* Passed/Failed test statistics
* Detailed test steps
* Execution history
* Error logs and stack traces

---

## 💡 Key Highlights

* Industry-standard Page Object Model framework
* Thread-safe WebDriver implementation
* Dynamic locator handling
* Explicit wait strategy
* Reusable BasePage methods
* Cross-browser execution
* Scalable architecture for future enhancements
* Clean and maintainable codebase

---

## 👨‍💻 Author

**Fahim Shahriar**

Software Quality Assurance Engineer

GitHub:
https://github.com/fahim-shahriar-sqa

---

### ⭐ If you find this project useful, consider giving it a star.
