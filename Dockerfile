FROM openjdk:11
EXPOSE 8090
COPY target/*.jar /
ENTRYPOINT ["java","-jar","/devops-0.0.1-SNAPSHOT.jar"]
