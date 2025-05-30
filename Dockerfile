# Stage 1: Build the application
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests
# Stage 2: Run the application of SB
FROM openjdk:17.0.1-jdk-slim
COPY --from=build /app/target/crud-operations-using-springBoot-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
