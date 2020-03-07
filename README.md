# String Cloud 1

This example project demonstrates cooperation of a simple service (quote) with config service provided by Spring Cloud.

There are two services:
- configserver
- quote

Configserver manages configuration for all microservices. It runs on port 7777 and keeps configuration for all other microservices in classpath:/config directory (see bootstrap.yml and application.yml in src/main/resources). 

Other services (quote) when started (see bootstrap.yml in src/main/resources in quote service) connect to value of spring.cloud.config.uri property (which is localhost:7777) to fetch corresponding configuration.

The configuration for quote service consists of 2 files:
- quote.yml
- quote-development.yml

Both files are merged together to form the final configuration.

quote.yml:

```yaml
server:
  port: 7071

spring:
  datasource:
    hikari:
      connectionTimeout: 20000
      maximumPoolSize: 5
  jpa:
    hibernate:
      ddl-auto: create-drop
      generate-ddl: true
      show-sql: true

quote:
  index: 1
```

quote-development.yml

```yaml
spring:
  datasource:
    url: jdbc:postgresql://${POSTGRESQL_HOST}:5432/postgres
    username: postgres
    password: secret
```

The variable POSTGRES_HOST, depending on runtime environment, can be set thru:
- environment (local development; docker compose)
- config map / secret (kubernetes)

It has to be set in the runtime environment of quote service, ie. quote, during boostrap phase, contacts configserver and fetches spring.database.url property as `jdbc:postgresql://${POSTGRESQL_HOST}:5432/postgres` which is further evaluated to the local value of POSTGRESQL_HOST variable.

Database schema is created every time the quote service is started and dropped once the service is done. It is preloaded (see LoadDatabase.java) with 40 quotes of Albert Einstein.

There are 3 endpoints to call:

- /quotes - to fetch all quotes
- /quotes/{id} - to fetch a particular quote
- /quotes/index - to fetch quote which index is defined in quote confing on configserver (quote.index: 1)

Sample curl commands:

```console
curl http://localhost:7071/quotes
curl http://localhost:7071/quotes/10
curl http://localhost:7071/quotes/index
```
