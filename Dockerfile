FROM maven:3.5-jdk-8-alpine as build
WORKDIR /app
COPY . /app
RUN mvn package

FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=build /app/target/project2-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["java", "-jar", "./app/project2-0.0.1-SNAPSHOT.jar"]