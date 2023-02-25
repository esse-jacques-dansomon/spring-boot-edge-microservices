# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory to /app
WORKDIR /app

# Copy the compiled Spring Boot JAR file to the container
COPY target/mcommandes-0.0.1-SNAPSHOT.jar /app/mcommandes-0.0.1-SNAPSHOT.jar

# Specify the command to run your Spring Boot app
CMD ["java", "-jar", "/app/mcommandes-0.0.1-SNAPSHOT.jar"]