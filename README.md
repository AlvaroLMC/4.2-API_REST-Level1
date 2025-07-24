# Project S04T02N01 - CRUD with Spring Boot and H2

## Description

This project implements a basic CRUD for the **Fruita** entity using Spring Boot, Spring Data JPA, and the H2 in-memory database.

The `Fruita` entity has the following properties:

- `id` (int): Auto-generated unique identifier.
- `nom` (String): Name of the fruit.
- `quantitatQuilos` (int): Quantity in kilos.

---

## Technologies Used

- Java 11+
- Spring Boot
- Spring Data JPA
- H2 Database (in-memory)
- Maven
- Postman (for API testing)

---

## Running the Project

1. Clone this repository.
2. Open the project in your favorite IDE (IntelliJ, Eclipse, VSCode).
3. Run the main class `S04T02N01Application`.
4. Access the H2 console (optional) at:
   http://localhost:8080/h2-console

- JDBC URL: `jdbc:h2:mem:testdb`
- User: `sa`
- Password: (empty)

---

## Available Endpoints

| Action                 | Method | URL                     | Description                    | JSON Body Example                              |
|------------------------|--------|-------------------------|--------------------------------|-----------------------------------------------|
| Create fruit           | POST   | `/fruit/add`            | Add a new fruit                | `{ "nom": "Apple", "quantitatQuilos": 25 }`  |
| Update fruit           | PUT    | `/fruit/update`         | Modify an existing fruit       | `{ "id": 1, "nom": "Golden Apple", "quantitatQuilos": 30 }` |
| Delete fruit           | DELETE | `/fruit/delete/{id}`    | Delete fruit by id             | N/A                                           |
| Get fruit by id        | GET    | `/fruit/getOne/{id}`    | Get fruit by its id            | N/A                                           |
| Get all fruits         | GET    | `/fruit/getAll`         | Get all fruits                 | N/A                                           |

---
