FROM openjdk:17
MAINTAINER "premji"
COPY target/RestController-0.0.1-SNAPSHOT.jar  /usr/app/
WORKDIR /usr/app/
EXPOSE 4545
ENTRYPOINT ["java", "-jar", "RestController-0.0.1-SNAPSHOT.jar"]