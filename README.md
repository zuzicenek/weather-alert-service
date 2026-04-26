# Weather Alert System

Simple Java application demonstrating user registration and notification handling based on location.

## Description

This project simulates a system that sends weather alerts to registered users in specific regions.
Users can choose to receive notifications via SMS, Email, or both.

The application is based on object-oriented design principles and follows a UML class diagram.

## Features

* User registration with location
* Notification system (SMS and Email)
* Multiple notification methods per user
* Singleton pattern for notification sender
* Console-based output (no real SMS/Email sending)

## Technologies

* Java
* Object-Oriented Programming (OOP)

## How to Run

1. Clone the repository
2. Open in IntelliJ IDEA
3. Run the main class

## Project Structure

* `User` – represents a user
* `RegisteredUsers` – manages users
* `Notification` – interface
* `SMSNotification` – SMS implementation
* `EmailNotification` – Email implementation
* `NotificationSender` – Singleton service for sending messages

## Purpose

This project was created as a school assignment to practice:

* OOP design
* Interfaces and inheritance
* Design patterns (Singleton)

## Author

Student project
