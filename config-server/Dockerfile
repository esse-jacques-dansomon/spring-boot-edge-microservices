# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory to /app
WORKDIR /app

# Copy the compiled Spring Boot JAR file to the container
COPY target/my-spring-boot-app.jar /app/my-spring-boot-app.jar

# Specify the command to run your Spring Boot app
CMD ["java", "-jar", "/app/my-spring-boot-app.jar"]
