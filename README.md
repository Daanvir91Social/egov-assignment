# OpenAPI generated server

Spring Boot Server

## Overview
Clone the project

Create Postgres Server and role using command lines
```
$ psql postgres
$ Create database egov
$ CREATE USER admin WITH ENCRYPTED PASSWORD 'password';
```

Add the respective details in application.properties
```
server.port=8080
spring.jackson.date-format=org.service.RFC3339DateFormat
spring.jackson.serialization.WRITE_DATES_AS_TIMESTAMPS=false
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.PostgreSQLDialect
spring.jpa.generate-ddl=true
spring.jpa.hibernate.show-sql=true
spring.datasource.url=jdbc:postgresql://localhost:5432/egov
spring.datasource.username=admin
spring.datasource.password=password
spring.datasource.driver-class-name=org.postgresql.Driver
```

Now run in your terminal 
```
mvn clean install
```

Run the springboot Application by running src/main/java/org/service/OpenApiGeneratorApplication.java


You can view the api documentation in swagger-ui by pointing to
http://localhost:8080/swagger-ui.html

An example of API request would look like this Curl
```
curl --location 'http://localhost:8080/service/v1/_create' \
--header 'Content-Type: application/json' \
--header 'Accept: */*' \
--data '{
  "requestInfo": {
    "responseInfo": {
      "apiId": "string",
      "ver": "string",
      "ts": 0,
      "resMsgId": "string",
      "msgId": "string",
      "status": "SUCCESSFUL"
    },
    "apiId": "string",
    "ver": "string",
    "ts": 0,
    "action": "string",
    "did": "string",
    "key": "string",
    "msgId": "string",
    "requesterId": "string",
    "authToken": "string",
    "userInfo": {
      "tenantId": "string",
      "id": 0,
      "userName": "string",
      "mobile": "string",
      "email": "string",
      "primaryrole": [
        {
          "name": "string",
          "description": "string"
        }
      ],
      "additionalroles": [
        {
          "tenantId": "string",
          "roles": [
            {
              "name": "string",
              "description": "string"
            }
          ]
        }
      ]
    }
  },
  "service": {
    "tenantId": "pb.amritsar",
    "serviceDefId": "36c12685-9627-441e-b848-64d8fc31d391",
    "referenceId": "string",
    "accountId": "string",
    "clientId": "string",
    "attributes": [
      {
        "attributeCode": "string",
        "value": {},
        "auditDetails": {
          "createdBy": "string",
          "lastModifiedBy": "string",
          "createdTime": 0,
          "lastModifiedTime": 0
        },
        "additionalDetails": {}
      }
    ],
    "auditDetails": {
      "createdBy": "string",
      "lastModifiedBy": "string",
      "createdTime": 0,
      "lastModifiedTime": 0
    },
    "additionalDetails": {}
  }
}'

Change default port value in application.properties
