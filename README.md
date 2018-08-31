# Spring-Cloud-Eureka-Services-Client-Registry-Discovery
Spring-Cloud-Eureka-Services-Client-Registry-Discovery

## How to Test

### Start Server
Go to server directory
`spring-eureka-server > mvn spring-boot:run`

### Start Client - Student Service
Go to directory
`spring-eureka-client-student-service > mvn spring-boot:run`

### Start Client - School Service
Go to directory
`spring-eureka-client-school-service > mvn spring-boot:run`

## Test Student Service
`http://localhost:8098/students/ABC`
it will return student list in json format

## Test School Service using Eureka client dsicovery
`http://localhost:8099/schools/ABC/students`
it will return student list in json format
