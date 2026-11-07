FROM eclipse-temurin:17 AS build
COPY ./pom.xml ./pom.xml
COPY ./mvnw ./mvnw
COPY .mvn .mvn
COPY ./src ./src
RUN ./mvnw package -DskipTests

FROM eclipse-temurin:17
COPY --from=build ./target/*.jar spring-api.jar
ENTRYPOINT ["java", "-jar", "spring-api.jar"]
