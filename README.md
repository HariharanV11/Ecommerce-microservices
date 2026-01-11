# E-Commerce Application (Spring Boot + React)

This project is a full-stack **E-Commerce application** developed using  
**React.js** for the frontend and **Spring Boot** for the backend, with **MySQL** as the database.

The application demonstrates real **frontend–backend integration** using REST APIs.

---

## Available Scripts (Frontend)

In the `Ecommerce-Frontend` directory, you can run:

### `npm install`

Installs all required dependencies for the React application.

### `npm start`

Runs the app in development mode.  
Open [http://localhost:3000](http://localhost:3000) to view it in your browser.

The page will reload when you make changes.  
Any errors will be shown in the console.

### `npm run build`

Builds the app for production to the `build` folder.  
It bundles React in production mode and optimizes the build for performance.

---

## Backend – Spring Boot

The backend is built using **Spring Boot** and exposes REST APIs consumed by the frontend.

### How to Run Backend

1. Open `Ecommerce-Backend` in IntelliJ / Eclipse
2. Configure MySQL credentials in `application.properties`
3. Run the main Spring Boot application class
4. Backend will start on the configured port (example: `http://localhost:8080`)

---

## Frontend–Backend Connection

- React frontend uses **Axios** for HTTP communication
- Axios base URL points to backend APIs
- REST APIs exchange data in JSON format

Flow:
Frontend → Axios → Spring Boot REST API → MySQL → Response → Frontend

---

## Tech Stack

### Frontend
- React.js
- Axios
- React Router

### Backend
- Spring Boot
- Spring Data JPA
- REST APIs
- MySQL

---

## Database

- MySQL database
- Tables managed using Hibernate
- Auto schema update enabled

---

## Features

- Product listing
- Add product
- Update product
- Delete product
- Cart management
- Checkout functionality

---

## Simplifications Made

- Shipping module removed
- Tax calculation removed
- Search handled on frontend side

These changes were made to keep the project simple and interview-friendly.

---

## Project Purpose

- Demonstrate full-stack development skills
- Show real React ↔ Spring Boot integration
- Suitable for academic projects and interviews

---

## Learn More

- React Documentation: https://reactjs.org/
- Spring Boot Documentation: https://spring.io/projects/spring-boot

---

## Author

Hariharan  
Computer Science Engineering  
Spring Boot | React | MySQL
