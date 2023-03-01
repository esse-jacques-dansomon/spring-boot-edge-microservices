# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory to /app
WORKDIR /app

# Copy the compiled Spring Boot JAR file to the container
COPY target/microservice-clientui-0.0.1-SNAPSHOT.jar /app/microservice-clientui-0.0.1-SNAPSHOT.jar

# Specify the command to run your Spring Boot app
CMD ["java", "-jar", "/app/microservice-clientui-0.0.1-SNAPSHOT.jar"]