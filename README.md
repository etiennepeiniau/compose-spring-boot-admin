# Spring Boot Admin

This demo shows how to start in Docker a Spring Boot Admin application and two Spring Boot application using Docker Compose.

First, you need to install [Docker and Docker Compose](https://docs.docker.com/compose/#installation-and-set-up).

## Run the demo
To run the demo, you just need to start Docker Compose:
```
docker-compose up
```
This command creates tree docker containers one for the admin application and two for the client applications.

You can access the application with the URL: [http://localhost:8080](http://localhost:8080)

You can check the containers status using the command:
```
docker-compose ps
```
