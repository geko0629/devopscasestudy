FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY target/devops-case-study.jar /app/devops-case-study.jar
EXPOSE 8080
CMD ["java", "-jar", "/app/devops-case-study.jar"]