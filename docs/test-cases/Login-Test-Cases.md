# Login Test Cases - Digital Banking Application

## Project

FinTrust Digital Banking Application

## Feature

User Login Functionality


---

## TC_LOGIN_001

### Test Scenario
Verify user can login with valid credentials

### Preconditions

- User account exists
- Application is available

### Test Data

Username:
testuser@fintrust.com

Password:
ValidPassword123


### Test Steps

1. Open FinTrust Digital Banking application
2. Enter valid username
3. Enter valid password
4. Click Login button

### Expected Result

User should be successfully logged in and redirected to the account dashboard.

### Actual Result

To be updated during execution

### Status

Not Executed


---

## TC_LOGIN_002

### Test Scenario

Verify login fails with invalid password


### Preconditions

- Registered user account exists


### Test Data

Username:
testuser@fintrust.com

Password:
WrongPassword123


### Test Steps

1. Open application login page
2. Enter valid username
3. Enter incorrect password
4. Click Login


### Expected Result

System should display an error message:

"Invalid username or password"


### Actual Result

To be updated during execution


### Status

Not Executed


---

## TC_LOGIN_003

### Test Scenario

Verify login fails when username is empty


### Test Steps

1. Open login page
2. Leave username field empty
3. Enter password
4. Click Login


### Expected Result

System should display validation message for mandatory username field.


### Status

Not Executed


---

## TC_LOGIN_004

### Test Scenario

Verify account lock after multiple failed login attempts


### Test Steps

1. Enter incorrect password multiple times
2. Attempt login repeatedly


### Expected Result

Account should be temporarily locked after maximum failed attempts.


### Status

Not Executed


---

# Test Case Summary

| Test Case ID | Description | Status |
|---|---|---|
| TC_LOGIN_001 | Valid Login | Not Executed |
| TC_LOGIN_002 | Invalid Password | Not Executed |
| TC_LOGIN_003 | Empty Username Validation | Not Executed |
| TC_LOGIN_004 | Account Lock Validation | Not Executed |


Author:

Likhitha Naidu Savaram

Project:

Digital Banking Testing Portfolio Project
