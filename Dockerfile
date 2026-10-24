FROM gradle:9.8.2-jdk17 AS build
WORKDIR /workspace

COPY --chown=gradle:gradle . .
RUN gradle --no-daemon bootJar

FROM eclipse-temurin:17-jre
WORKDIR /app

COPY --from=build /workspace/build/libs/openshift-demo-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

USER 10001
ENTRYPOINT ["java", "-jar", "/app/app.jar"]