# this is a large image to work from but good for debugging.
FROM openjdk:jdk-buster
COPY ./target/factorial_ui-0.0.1-SNAPSHOT.jar factorial_ui.jar
CMD ["java", "-jar", "factorial_ui.jar"]
