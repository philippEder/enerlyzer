FROM openjdk:14
EXPOSE 8080
ADD /target/enerlyzer-0.0.1-SNAPSHOT.jar enerlyzer.jar
ENTRYPOINT ["java", "-jar", "enerlyzer.jar"]