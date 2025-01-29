# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged JAR file from the target directory (build step)
COPY target/demo-0.0.1-SNAPSHOT.jar /app/demo.jar

# Expose the port the application will run on
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "demo.jar"]

#running steps.

#mvn clean build

# docker build -t demo-app . // in the folder which has the .dockerfile.

#docker images

#docker run -p 8082:8080 demo-app

#Push the Image to Docker Hub
#docker login

#docker tag demo-app your-dockerhub-username/demo-app:latest


#docker push your-dockerhub-username/demo-app:latest

#docker run -d -p 8080:8080 demo-app

#cleanup resources

#docker ps

#docker stop <container_id> 

#docker rm <container_id>

#docker rmi demo-app


