# get-me-board-back

## Table of content

* [General Info](###general-info)
* [Technologies](#technologies)
* [Setup](#setup)
* [Build](#build)
* [Launch](#launch)

### General Info

Backend part of the app that facilitates matching the size of the snowboard

### Technologies

* Spring Boot
* Hibernate
* Postgres

### Setup

To setup application

* Change database URL, PORT and DATABASE NAME in **application.properties**

```
spring.datasource.url=jdbc:postgresql://<URL>:<PORT>/<DB_NAME>
```

#### LOCAL SETUP

* Download Postgres Docker image
  `docker pull postgres`
* Run Docker Postgres image
  `docker run -it --rm --name gmb-postgres -p 5432:5432 -e POSTGRES_DB=gmb_postgres -e POSTGRES_USER=gmb_user -e POSTGRES_PASSWORD=gmb postgres`

### Build

To build project use included gradle wrapper

```
$ cd ../book-store-backend
$ ./gradlew build
```

### Launch

To run project execute following commnads

```
$ cd ../book-store-backend/build/libs
$ java -jar book-store-0.0.1-SNAPSHOT.jar