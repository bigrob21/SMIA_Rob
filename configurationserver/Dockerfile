FROM maven:3.5-jdk-8 AS init

RUN mkdir /opt/app
VOLUME ["/root/home:../.m2/repository"]
WORKDIR /opt/app
COPY src src
COPY pom.xml .
COPY settings.xml .
RUN mvn clean package -DskipTests -s settings.xml -q

## ENDING MAVEN BUILD NOT THE PACKAGING OF THE APP ITSELF

FROM openjdk:alpine
MAINTAINER Rob Paul
LABEL version="1.0"
LABEL description="Second docker build will actual set up the app, but will retrieve the compiled jar from the first build."
WORKDIR /opt

ENV JAVA_OPTS="-Xms300m -Xmx300m"
COPY --from=init /opt/app/target/configurationserver.jar ${WORKDIR}

ENTRYPOINT exec java -jar ${JAVA_OPTS} configurationserver.jar
EXPOSE 8888