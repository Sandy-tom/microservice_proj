FROM openjdk:17

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} serviceregistery.jar

ENTRYPOINT [ "java", "-jar", "/serviceregistery.jar" ]

EXPOSE 8761