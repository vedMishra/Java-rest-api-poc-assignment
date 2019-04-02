# Java Rest API POC Assignment
This POC is to demonstrate the reading of a provided Json file which contains continents
and contries and their flags.

1.It has a rest api has to get the contries based on continents provided.

2. It has test case junit and script to create schema table for continent.

3. Logger has been provided to trace the program flow

Steps to Run:-

1. just start the spring boot application on server( embedded tomcat server)
2. go to browser and type http://localhost:8080/getCountries/Asia then see the results
based on passing the continents name.
3. json is included in resrource folder as classpath accesible.

## Build

```
./gradlew build
```

## Test

```
./gradlew test
```

## LICENSE

MIT
