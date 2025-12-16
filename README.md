# TaxEase - Core Project 💸

**Turning Complexity into Clarity.**

This repository contains the core implementation of **TaxEase**, a tax management platform designed to simplify tax filing for Individuals (B2C) and SMEs (B2B). 

This project was developed for the *Professional Skills for Engineers (HPI)* course.

## 📋 Project Overview
The goal of this simplified prototype is to demonstrate the **Backend Logic** and **Data Modeling** of the TaxEase ecosystem. It simulates the flow of a user scanning documents to automate their tax return.

### Key Features
* **Object-Oriented Design:** Strong use of inheritance and polymorphism to handle `Individual` and `Corporate` users.
* **Simulated AI/OCR Engine:** A service that mocks document recognition (Payslips vs. Invoices) based on filenames.
* **Deduction Logic:** An automated engine that calculates tax liabilities by offsetting income with deductible expenses.
* **CLI (Command Line Interface):** A clean text-based interface to interact with the model.

## 📂 Project Structure
The code follows **Clean Code principles**, organizing responsibilities into specific packages:

* `src/taxease/model` → **The Data:** Defines the core entities (User, TaxReturn, Document).
* `src/taxease/service` → **The Logic:** Contains the *TaxCalculatorService* and *OcrService*.
* `src/Main.java` → **The Interface:** The entry point for the CLI demonstration.

## 🚀 How to Run
1.  Clone this repository.
2.  Open the project in **IntelliJ IDEA**.
3.  Run the `Main.java` file.
4.  Follow the on-screen instructions:
    * **To simulate Income:** Enter a filename containing "payslip" (e.g., `january_payslip.pdf`).
    * **To simulate Deductions:** Enter a filename containing "invoice" (e.g., `lunch_invoice.jpg`).

## 👥 Authors
* **Javier Martin Rodríguez**
* **Tomás Santana Suárez**
* **Carlos Montesdeoca Vega**
* **Alejandro Delgado Valera**

---
*Developed for ULPGC - HPI 2025*
