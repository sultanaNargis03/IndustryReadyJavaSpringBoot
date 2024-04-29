FROM openjdk:latest
COPY target/emp-mgmt-app.jar emp-mgmt-app.jar
#ADD target/student-app.jar student-app.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar","emp-mgmt-app.jar" ]