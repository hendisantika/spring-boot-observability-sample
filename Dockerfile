FROM curlimages/curl:8.23.0 AS download
ARG OTEL_AGENT_VERSION="2.33.0"
RUN curl --silent --fail -L "https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/download/v${OTEL_AGENT_VERSION}/opentelemetry-javaagent.jar" \
    -o "$HOME/opentelemetry-javaagent.jar"

#FROM maven:3.10.0-liberica-25 AS build
FROM maven:3.10.0-eclipse-temurin-25 AS build
ADD . /build
RUN cd /build && mvn clean package --quiet -DskipTests

FROM bellsoft/liberica-openjdk-debian:25
COPY --from=build /build/target/*.jar /app.jar
COPY --from=download /home/curl_user/opentelemetry-javaagent.jar /opentelemetry-javaagent.jar
ENTRYPOINT ["java", \
  "-javaagent:/opentelemetry-javaagent.jar", \
  "-jar", "/app.jar" \
  ]
