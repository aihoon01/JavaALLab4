FROM maven:3.8.6-openjdk-17-slim AS maven-build
WORKDIR /app
COPY pom.xml /app/
RUN mvn dependency:go-offline -B
COPY . /app
RUN mvn clean package -DskipTests

FROM  openjdk:17-jdk-slim AS maven-runtime
WORKDIR /app
COPY --from=maven-build /app/target/*.jar /app/maven.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "app/maven.jar"]