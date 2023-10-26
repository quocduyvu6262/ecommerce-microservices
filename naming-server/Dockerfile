FROM openjdk:17
COPY /target/naming-server-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "/app.jar"]