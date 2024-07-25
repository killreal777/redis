FROM openjdk:17-jdk-slim-buster
WORKDIR /app
COPY target/redis-0.0.1-SNAPSHOT.jar /app/redis.jar
ENTRYPOINT ["java", "-jar", "redis.jar"]
EXPOSE 8080
