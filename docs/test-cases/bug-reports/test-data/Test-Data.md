# Test Data - Digital Banking Application

## Project

FinTrust Digital Banking Application


## Purpose

This document contains test data required for validating digital banking application functionality.


# Login Test Data

| Test Data ID | Username | Password | Expected Result |
|---|---|---|---|
| TD_LOGIN_001 | testuser@fintrust.com | ValidPassword123 | Login Successful |
| TD_LOGIN_002 | testuser@fintrust.com | WrongPassword123 | Login Failed |
| TD_LOGIN_003 | invaliduser@test.com | ValidPassword123 | User Not Found |


# Registration Test Data

| Field | Test Data |
|---|---|
| First Name | John |
| Last Name | Smith |
| Email | john.smith@test.com |
| Phone Number | 07123456789 |


# Money Transfer Test Data

| Test Data ID | Beneficiary | Amount | Currency | Expected Result |
|---|---|---|---|---|
| TD_TRANSFER_001 | Alice Brown | 500 | GBP | Transfer Successful |
| TD_TRANSFER_002 | David Lee | 0 | GBP | Transfer Failed |
| TD_TRANSFER_003 | Sarah Wilson | -100 | GBP | Validation Error |


# Account Test Data

| Account Type | Account Number | Status |
|---|---|---|
| Current Account | 12345678 | Active |
| Savings Account | 87654321 | Active |


---

Author:

Likhitha Naidu Savaram


Project:

Digital Banking Testing Portfolio Project
