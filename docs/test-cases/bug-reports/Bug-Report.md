# Bug Report - Digital Banking Application

## Project

FinTrust Digital Banking Application


## Purpose

This document contains defects identified during testing activities.


---

# BUG-001

## Title

Transaction history page does not load after successful payment


## Module

Transaction History


## Severity

High


## Priority

High


## Environment

Browser: Google Chrome

Operating System: Windows 11


## Preconditions

- User is logged into the application
- User has completed a transaction


## Steps to Reproduce

1. Login to the application
2. Navigate to Transaction History
3. Complete a money transfer
4. Refresh the transaction history page


## Expected Result

The latest transaction should be displayed immediately in the transaction history.


## Actual Result

Transaction history page continues loading and the latest transaction is not displayed.


## Status

Open


---

# BUG-002

## Title

Invalid OTP message is not displayed during failed authentication


## Module

Multi-Factor Authentication


## Severity

Medium


## Priority

Medium


## Steps to Reproduce

1. Enter valid username and password
2. Enter incorrect OTP
3. Click Verify


## Expected Result

System should display an "Invalid OTP" error message.


## Actual Result

Page refreshes without displaying an error message.


## Status

Open


---

# BUG-003

## Title

User can enter negative amount during money transfer


## Module

Money Transfer


## Severity

High


## Priority

High


## Steps to Reproduce

1. Login to the application
2. Navigate to Money Transfer
3. Enter negative amount
4. Submit transaction


## Expected Result

System should prevent invalid amount entry.


## Actual Result

Negative amount is accepted.


## Status

Open


---

# Defect Summary

| Bug ID | Module | Severity | Status |
|---|---|---|---|
| BUG-001 | Transaction History | High | Open |
| BUG-002 | OTP Authentication | Medium | Open |
| BUG-003 | Money Transfer | High | Open |


---

Author:

Likhitha Naidu Savaram


Project:

Digital Banking Testing Portfolio Project
