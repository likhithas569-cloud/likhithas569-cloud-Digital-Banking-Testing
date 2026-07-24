# Test Scenarios - Digital Banking Application

## Project

FinTrust Digital Banking Application

## Purpose

This document contains high-level test scenarios to validate the functionality of the digital banking application.

---

# 1. User Registration

| Scenario ID | Test Scenario |
|---|---|
| TS_REG_001 | Verify user can register with valid details |
| TS_REG_002 | Verify registration fails with missing mandatory fields |
| TS_REG_003 | Verify email validation during registration |
| TS_REG_004 | Verify duplicate user registration handling |

---

# 2. User Login

| Scenario ID | Test Scenario |
|---|---|
| TS_LOGIN_001 | Verify login with valid username and password |
| TS_LOGIN_002 | Verify login fails with invalid password |
| TS_LOGIN_003 | Verify login fails with invalid username |
| TS_LOGIN_004 | Verify account locks after multiple failed login attempts |

---

# 3. Multi-Factor Authentication (OTP)

| Scenario ID | Test Scenario |
|---|---|
| TS_OTP_001 | Verify successful login with valid OTP |
| TS_OTP_002 | Verify login fails with incorrect OTP |
| TS_OTP_003 | Verify OTP expiry validation |
| TS_OTP_004 | Verify OTP resend functionality |

---

# 4. Account Dashboard

| Scenario ID | Test Scenario |
|---|---|
| TS_ACC_001 | Verify customer can access account dashboard |
| TS_ACC_002 | Verify account balance is displayed correctly |
| TS_ACC_003 | Verify account details are displayed correctly |
| TS_ACC_004 | Verify recent transactions are displayed |

---

# 5. Beneficiary Management

| Scenario ID | Test Scenario |
|---|---|
| TS_BEN_001 | Verify user can add a new beneficiary |
| TS_BEN_002 | Verify beneficiary details validation |
| TS_BEN_003 | Verify user can delete beneficiary |
| TS_BEN_004 | Verify duplicate beneficiary handling |

---

# 6. Money Transfer

| Scenario ID | Test Scenario |
|---|---|
| TS_PAY_001 | Verify successful money transfer |
| TS_PAY_002 | Verify transfer fails with insufficient balance |
| TS_PAY_003 | Verify transfer amount validation |
| TS_PAY_004 | Verify transaction confirmation message |

---

# 7. Transaction History

| Scenario ID | Test Scenario |
|---|---|
| TS_TXN_001 | Verify user can view transaction history |
| TS_TXN_002 | Verify transaction details are correct |
| TS_TXN_003 | Verify transaction search functionality |
| TS_TXN_004 | Verify transaction filtering options |

---

# 8. Profile Management

| Scenario ID | Test Scenario |
|---|---|
| TS_PROFILE_001 | Verify user can view profile information |
| TS_PROFILE_002 | Verify user can update personal details |
| TS_PROFILE_003 | Verify profile changes are saved successfully |

---

# 9. Logout

| Scenario ID | Test Scenario |
|---|---|
| TS_LOGOUT_001 | Verify user can logout successfully |
| TS_LOGOUT_002 | Verify session expires after logout |
| TS_LOGOUT_003 | Verify user cannot access pages after logout |

---

# Summary

Total Test Scenarios Created:

- Registration: 4
- Login: 4
- OTP: 4
- Account Dashboard: 4
- Beneficiary: 4
- Money Transfer: 4
- Transaction History: 4
- Profile Management: 3
- Logout: 3

Total: 34 Test Scenarios


Author:
Likhitha Naidu Savaram

Project:
Digital Banking Testing Portfolio Project
