FROM eclipse-temurin:17
COPY target/myjenkins.jar myjenkins.jar
CMD ["java", "-jar", "myjenkins.jar"]