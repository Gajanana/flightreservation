# Flightreservation
Flight Reservation application using webflux

### Prerequisites 
  1. JAVA 11+ JDK
  2. DOCKER Runtime
  3. Favourite IDE (Optional)

### How to run

1. ``` mvn clean compile package -DskipTests -Dverbose ```

2. ``` docker-compose -f docker/docker-compose-postgres.yml up ```

3. ``` java -jar target/dda-0.0.1-SNAPSHOT.jar ```

***
### _REST APIs_
***

#### How to Register user

``` curl -X POST http://localhost:8080/tflight/user/register/20 -d '{"id": 200 , "firstName": "Raj", "lastName":"patil" , "email": "name@smail.com", "phoneNumber":"9876543210"}' -H 'Content-Type: application/json'```

#### Get All users

``` curl http://localhost:8080/tflight/user/```

#### Get user by Id 
``` http://localhost:8080/tflight/user/{id}```
