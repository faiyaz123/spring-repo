FROM openjdk:8
ADD build/libs/vcommon-0.0.1.jar  /usr/src/vcommon-0.0.1.jar
WORKDIR usr/src
ENTRYPOINT ["java","-jar", "vcommon-0.0.1.jar"]