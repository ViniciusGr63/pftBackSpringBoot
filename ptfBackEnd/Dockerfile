
FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/ptfBackEnd-0.0.1-SNAPSHOT.jar /app/ptfBackEnd.jar

EXPOSE 8080

CMD ["java", "-jar", "ptfBackEnd.jar"]
