# Weather Processor - Data Pipeline with Apache Camel

## 📌 Overview
This project demonstrates a **data pipeline** built with **Apache Camel**. It processes weather data from an external API, applies transformations, and stores the results for further analysis. The example illustrates **data routing, integration patterns, and real-world ETL processing**.

## 🚀 Features
- **Integration with External APIs**: Fetches real-time weather data.
- **Data Transformation**: Applies custom logic to modify and enrich incoming data.
- **Message Routing**: Uses **Apache Camel** for flexible and scalable routing.
- **Storage Support**: Stores processed data in a database or file system.

## 🛠️ Technologies Used
- **Java 17+**
- **Spring Boot**
- **Apache Camel**
- **AWS SQS+**
- **AWS Secrets Manager+**
- **Maven**
- **Docker (Optional)**

## 📂 Project Structure
```
weather-processor/
├── src/main/java/io/igventurelli/weather_processor/
│   ├── WeatherProcessorApplication.java  # Main entry point
│   ├── aws/
│   │   ├── AWSSQSRoute.java              # Listens to SQS
│   │   ├── AWSSecretsManagerRoute.java   # Fetches API key
│   ├── integration/
│   │   ├── WeatherStackRoute.java        # Calls WeatherStack API
│   ├── db/
│   │   ├── PostgresRoute.java            # Persists data to PostgreSQL
│   ├── model/
│   │   ├── WeatherData.java              # Entity for weather data
│   │   ├── WeatherRequest.java           # Entity for weather data
│   │   ├── CurrentWeather.java           # Entity for weather data
│   │   ├── Location.java                 # Entity for weather data
```

## ⚡ Getting Started
### **Clone the Repository**
```sh
git clone https://github.com/igventurelli/examples.git
cd examples/weather-processor
```

### **Run with Docker (Optional, for DB)**
```sh
docker-compose up
```

### **Run with Maven**
```sh
mvn spring-boot:run
```

## 📜 License
This project is for educational purposes only and is not intended for production use without further optimization and testing.

