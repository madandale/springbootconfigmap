FROM openjdk:8-jdk-alpine
VOLUME /tmp
MAINTAINER madan dale
ARG JAR_FILE
COPY target/*.jar /usr/local/share/app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urando","-jar","/usr/local/share/app.jar"]
EXPOSE 9000
