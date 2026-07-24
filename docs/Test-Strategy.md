# Test Strategy Document

## 1. Introduction

### Purpose

This document defines the testing approach, objectives, scope, resources, and activities required to validate the FinTrust Digital Banking Application.

The goal is to ensure the application is secure, reliable, functional, and provides a good customer experience.

---

# 2. Testing Objectives

The objectives of testing are:

- Verify banking functionalities work as expected
- Identify defects before release
- Validate application security
- Ensure data accuracy
- Verify API responses
- Improve application quality through automation testing

---

# 3. Testing Scope

## In Scope

The following features will be tested:

- User Registration
- User Login
- OTP Authentication
- Account Dashboard
- Account Balance Verification
- Beneficiary Management
- Money Transfer
- Transaction History
- Profile Management
- Logout


## Out of Scope

The following areas are excluded:

- Real banking transactions
- Third-party banking integrations
- Production customer data

---

# 4. Testing Types

## Functional Testing

To verify that application features work according to requirements.

Examples:

- Login validation
- Money transfer validation
- Account balance verification


## Smoke Testing

Performed to verify critical functionalities after a new build.

Examples:

- Application launch
- Login
- Dashboard access


## Regression Testing

Performed after changes to ensure existing functionality is not affected.


## API Testing

Validate backend services:

- Request and response validation
- Status code verification
- Data validation


## Automation Testing

Automated testing will be performed using:

- Selenium WebDriver
- Java
- TestNG

---

# 5. Test Environment

## Application

FinTrust Digital Banking Application


## Browsers

- Google Chrome
- Microsoft Edge


## Operating System

Windows 11


## Tools

| Purpose | Tool |
|---|---|
| Test Management | Jira |
| API Testing | Postman |
| Automation | Selenium WebDriver |
| Programming Language | Java |
| Version Control | GitHub |
| Database Testing | SQL |

---

# 6. Test Execution Approach

Testing will follow these activities:

1. Requirement analysis
2. Test planning
3. Test scenario preparation
4. Test case creation
5. Test execution
6. Defect reporting
7. Regression testing
8. Test closure


---

# 7. Defect Management Process

Defects will be managed using Jira.

Defect lifecycle:

New → Assigned → In Progress → Fixed → Retest → Closed


Defects will include:

- Defect ID
- Summary
- Description
- Severity
- Priority
- Steps to reproduce
- Expected result
- Actual result


---

# 8. Entry Criteria

Testing can start when:

- Requirements are available
- Test environment is ready
- Build is deployed
- Test data is prepared


---

# 9. Exit Criteria

Testing can be completed when:

- All planned test cases are executed
- Critical defects are closed
- Regression testing is completed
- Test results are documented


---

# 10. Risks and Mitigation

| Risk | Mitigation |
|-|-|
| Environment issues | Verify environment before testing |
| Requirement changes | Update test cases regularly |
| Data issues | Maintain valid test data |


---

## Document Information

Version: 1.0

Author:
Likhitha Naidu Savaram

Project:
Digital Banking Testing Portfolio Project
