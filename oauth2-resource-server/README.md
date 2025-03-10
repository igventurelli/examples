# Spring Boot OAuth2 Resource Server with Auth0

## 📌 Overview
This project demonstrates how to secure a **Spring Boot API** using **OAuth2 Resource Server** with **Auth0** as the authorization provider. It showcases how to authenticate API requests with **JWT tokens** and configure Spring Security to validate tokens issued by Auth0.

## 🚀 Features
- **OAuth2 Resource Server**: Implements Spring Boot as an OAuth2 resource server.
- **JWT Authentication**: Secures API endpoints using JSON Web Tokens.
- **Custom Security Configuration**: Configures Spring Security to handle JWT validation.
- **Auth0 Integration**: Uses Auth0 as the identity provider.

## 🛠️ Technologies Used
- **Java 17+**
- **Spring Boot**
- **Spring Security**
- **OAuth2 Resource Server**
- **Auth0**
- **Maven**

```
oauth2-resource-server/
├── src/main/java/io/igventurelli/spring_boot_filters_interceptors
│   ├── controller/                             # Controllers to showcase behavior
│   └── Oauth2ResourceServerApplication.java    # Main Spring Boot application
```

## ⚡ Getting Started

### **Prerequisites**
- An **Auth0 account** (Sign up at [Auth0](https://auth0.com))
- A configured **Auth0 API** (with an `Issuer URI` and `Audience`)

### **Clone the Repository**
```sh
git clone https://github.com/igventurelli/examples.git
cd examples/oauth2-resource-server

# Set Up Auth0 Configuration
# Update the application.yml file with your Auth0 domain and API identifier:

spring:
  security:
    oauth2:
      resourceserver:
        jwt:
          issuer-uri: https://your-auth0-domain/
```

### **Run with Maven**
```sh
mvn spring-boot:run
```

## 📜 License
This project is for educational purposes only and is not intended for production use without further optimization and testing.

