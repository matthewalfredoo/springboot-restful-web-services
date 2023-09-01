FROM eclipse-temurin:17

LABEL maintainer="Matthew Alfredo"

WORKDIR /app

COPY target/springboot-restful-web-services-0.0.1-SNAPSHOT.jar /app/spring-boot-restful-web-services.jar

ENTRYPOINT ["java", "-jar", "spring-boot-restful-web-services.jar"]