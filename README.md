# 🚀 Sign-Up Automation Test | AutomationExercise.com

This project automates the **Sign-Up** functionality on [AutomationExercise.com](https://automationexercise.com) using:
- **Selenium WebDriver**
- **TestNG**
- **Data Generator(Fake data) for test data**
- **Page Object Model (POM)**
- **Test-Driven Development (TDD)**
- **Allure Reporting**
- **Maven**

---

## ✅ Objective

Automate the **Sign-Up** process and verify that the message **"ACCOUNT CREATED!"** is displayed upon successful registration.

---

## 🧪 Test Scenario

**Test Case:** Sign-Up with Valid Data  
**Steps:**
1. Open [https://automationexercise.com](https://automationexercise.com)
2. Click on **Signup / Login**
3. Enter valid `name` and `email` from JSON
4. Click on **Signup**
5. Fill in all required fields in the account information form
6. Click **Create Account**
7. Assert that **"ACCOUNT CREATED!"** appears
8. (Optional) Log out or delete the account after validation

---

## 🗂 Project Structure

```
SignUpAutomation/
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── pages/                  
│   │       │   ├── HomePage.java
│   │       │   ├── SignupPage.java
│   │       │   └── AccountCreatedPage.java
│   │       └── utils/
│   │           └── DataGenrator.java
│   └── test/
│       └── java/
│           └── tests/
│               └── SignUpTest.java
├── testdata/
│   └── signupData.json
├── pom.xml
├── testng.xml
└── README.md
```

---

## 🧾 Sample Test Data

```Data Generator
{
  "name": "Omar Test",
  "email": "omar.test001@example.com",
  "password": "Test@123",
  "gender": "Mr",
  "dob_day": "19",
  "dob_month": "7",
  "dob_year": "1995",
  "firstName": "Omar",
  "lastName": "Tester",
  "address": "Test Street 1",
  "country": "India",
  "state": "Cairo",
  "city": "Giza",
  "zipcode": "12345",
  "mobile": "01000000000"
}
```

---

## 🛠️ Setup & Execution

### 1. Clone the Repository
```bash
git clone https://github.com/your-username/signup-automation.git
cd signup-automation
```

### 2. Install Dependencies
Ensure **Java 8+**, **Maven**, and **ChromeDriver** are installed and added to your PATH.

```bash
mvn clean install
```

### 3. Run the Test
```bash
mvn test
```

### 4. Generate Allure Report
```bash
allure serve allure-results
```

---

## 🔍 Key Concepts Used

- ✅ **TestNG** for test structure and assertions
- 📄 **DataGenerator** for test data (no hardcoded values)
- 🧱 **POM (Page Object Model)** for maintainability
- 🧪 **TDD structure**: Test-first development and validation
- 📊 **Allure Reporting** for rich visual test reports

---

## 📸 Sample Assertion

```java
Assert.assertTrue(accountCreatedPage.getConfirmationMessage().contains("ACCOUNT CREATED!"));
```

---

## 🧼 Optional Cleanup

To avoid email duplication errors:
- Generate unique emails per test run using timestamps
- Or delete the test account after validation

---

## 📬 Contact

For issues or contributions, feel free to open a pull request or contact **omar.moeen68@gmail.com**.
