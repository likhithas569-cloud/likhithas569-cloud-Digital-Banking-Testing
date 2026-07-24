# API Testing Documentation - Digital Banking Application

## Project

FinTrust Digital Banking Application


## Purpose

This document contains API testing scenarios performed using Postman.

The objective is to validate backend services, API responses, authentication, and data integrity.


## API Environment

Tool:
Postman

Authentication:
Bearer Token Authentication

Response Format:
JSON


# API-001: User Login API

## Endpoint

POST /api/login


## Purpose

Authenticate registered users and generate access token.


## Request Body

Username:
testuser@fintrust.com

Password:
ValidPassword123


## Expected Response

Status Code:

200 OK


## Test Validations

- Verify status code is 200
- Verify authentication token is generated
- Verify user details are returned



# API-002: Account Balance API

## Endpoint

GET /api/accounts/balance


## Purpose

Retrieve customer account balance information.


## Expected Response

Status Code:

200 OK


## Test Validations

- Verify account number
- Verify balance value
- Verify response format



# API-003: Money Transfer API

## Endpoint

POST /api/transfer


## Purpose

Transfer money between accounts.


## Request Data

Beneficiary:
John Smith

Amount:
500 GBP


## Expected Response

Status Code:

201 Created


## Test Validations

- Verify transaction ID is generated
- Verify transfer status
- Verify transaction details



# API Testing Types Covered

- Positive Testing
- Negative Testing
- Response Validation
- Status Code Validation
- Authentication Testing
- Data Validation



# Tools Used

| Purpose | Tool |
|---|---|
| API Testing | Postman |
| Documentation | GitHub Markdown |
| Version Control | GitHub |



Author:

Likhitha Naidu Savaram


Project:

Digital Banking Testing Portfolio Project
