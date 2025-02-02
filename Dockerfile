FROM curlimages/curl:8.11.1 AS download
ARG OTEL_AGENT_VERSION="2.12.0"
RUN curl --silent --fail -L "https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/download/v${OTEL_AGENT_VERSION}/opentelemetry-javaagent.jar" \
    -o "$HOME/opentelemetry-javaagent.jar"

#FROM maven:3.9.9-liberica-23 AS build
FROM maven:3.9.9-eclipse-temurin-23 AS build
ADD . /build
RUN cd /build && mvn clean package --quiet -DskipTests

FROM bellsoft/liberica-openjdk-debian:23
COPY --from=build /build/target/*.jar /app.jar
COPY --from=download /home/curl_user/opentelemetry-javaagent.jar /opentelemetry-javaagent.jar
ENTRYPOINT ["java", \
  "-javaagent:/opentelemetry-javaagent.jar", \
  "-jar", "/app.jar" \
  ]
