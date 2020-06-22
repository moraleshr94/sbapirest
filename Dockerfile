FROM openjdk:11-jdk-slim
COPY "target/pruebaapirest-0.0.1-SNAPSHOT.jar" "app.jar"
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]

#FROM swaggerapi/swagger-ui:latest
#ENV PORT 8080
#EXPOSE 8080
#ENV SWAGGER_JSON "/app/swagger.json"