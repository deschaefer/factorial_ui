FROM amazoncorretto:11.0.6
COPY ./target/factorial_ui-0.0.1-SNAPSHOT.jar factorial_ui.jar
CMD ["java", "-jar", "factorial_ui.jar"]
