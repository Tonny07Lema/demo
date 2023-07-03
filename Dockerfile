FROM openjdk:17-jdk-alpine
COPY target/demo-0.0.1-SNAPSHOT.jar aplicacion.jar
ENTRYPOINT ["java","-jar","aplicacion.jar"]