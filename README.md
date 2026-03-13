# 🛒 Mic-ECommerce

E-commerce microservice developed with Spring Boot and hexagonal architecture.

## 📋 Description

Mic-ECommerce is an e-commerce web application that provides complete functionality for product management, users, orders, and stock. Implemented following Clean Architecture and Domain-Driven Design (DDD) principles.

## 🛠 Technologies

- **Java 17**
- **Spring Boot 3.0**
- **Spring Security** - Authentication and authorization
- **Spring Data JPA** - Data persistence
- **PostgreSQL** - Main database
- **H2 Database** - Testing database
- **Lombok** - Boilerplate code reduction
- **MapStruct** - Object mapping
- **Thymeleaf** - Template engine
- **Bootstrap** - CSS framework
- **Maven** - Dependency management

## 🏗 Architecture

The project implements **Hexagonal Architecture (Clean Architecture)** with the following layers:

```
src/main/java/com/icodeap/ecommerce/
├── domain/           # Domain entities and business logic
├── application/      # Use cases and application services
└── infrastructure/   # External adapters and configurations
```

### Domain Entities

- **User** - User and user type management
- **Product** - Product catalog
- **Order** - Order management
- **OrderProduct** - Product-order relationships
- **Stock** - Inventory control
- **ItemCart** - Shopping cart

## 🚀 Setup and Execution

### Prerequisites

- Java 17 or higher
- Maven 3.6+
- PostgreSQL 12+

### Database Configuration

1. Create PostgreSQL database:
```sql
CREATE DATABASE ecommercedb;
```

2. Configure credentials in `application-dev.properties`:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/ecommercedb
spring.datasource.username=postgres
spring.datasource.password=postgresql
```

### Running the Application

```bash
# Clone the repository
git clone [repository-url]
cd mic-eccommerce

# Compile the project
./mvnw clean compile

# Run the application
./mvnw spring-boot:run
```

The application will be available at: `http://localhost:9090`

### Configuration Profiles

- **dev** - Development (default)
- **test** - Testing with H2 in-memory database

## 📁 Project Structure

```
mic-eccommerce/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/icodeap/ecommerce/
│   │   │       ├── domain/          # Business entities
│   │   │       ├── application/     # Services and repositories
│   │   │       └── infrastructure/  # Controllers, DTOs, JPA entities
│   │   └── resources/
│   │       ├── static/             # Static resources (CSS, JS)
│   │       └── templates/          # Thymeleaf templates
│   └── test/                       # Unit and integration tests
├── target/                         # Compiled files
└── pom.xml                        # Maven configuration
```

## 🌐 Web Features

### Public Area
- **Home** - Main catalog page
- **Login/Register** - User authentication
- **Product Detail** - Product details

### User Area
- **Shopping List** - Product list
- **Cart** - Shopping cart
- **Order Summary** - Order summary

### Administration Area
- **Dashboard** - Admin panel
- **Product Management** - Product CRUD
- **Stock Management** - Inventory management

## 🧪 Testing

```bash
# Run all tests
./mvnw test

# Run with test profile
./mvnw test -Ptest
```

## 📦 Build

```bash
# Generate executable JAR
./mvnw clean package

# JAR file will be at: target/ecommerce-0.0.1-SNAPSHOT.jar
```

## 🔧 Additional Configuration

### Environment Variables

| Variable | Description | Default Value |
|----------|-------------|---------------|
| `SERVER_PORT` | Application port | 9090 |
| `DB_URL` | Database URL | jdbc:postgresql://localhost:5432/ecommercedb |
| `DB_USERNAME` | Database username | postgres |
| `DB_PASSWORD` | Database password | postgresql |

## 🤝 Contributing

1. Fork the project
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👤 Author

**ICodeAP Team**

## 📞 Support

For support and questions, please contact the development team.
