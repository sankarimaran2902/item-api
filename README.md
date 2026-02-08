# Item Management REST API

A lightweight Java backend application built with **Spring Boot** to manage a collection of items. 

## Live Demo
The application is hosted live at: 
[https://awful-electra-selfpace-b2435a44.koyeb.app/api/items](https://awful-electra-selfpace-b2435a44.koyeb.app/api/items)

## Tech Stack
- **Language:** Java 17
- **Framework:** Spring Boot 3.5.10
- **Build Tool:** Maven
- **Hosting:** Koyeb (Containerized)

## Features & API Endpoints

### 1. Add a New Item
- **Endpoint:** `POST /api/items`
- **Body (JSON):**
  ```json
  {
    "name": "Gaming Laptop",
    "description": "High performance laptop",
    "price": 1200.00
  }

##  Key Implementation Details
- **Data Storage:** Implemented using a thread-safe `ConcurrentHashMap` for in-memory storage.
- **Validation:** Added checks to ensure required fields (`name`, `price`) are present before saving.
