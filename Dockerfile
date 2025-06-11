FROM eclipse-temurin:17
COPY target/jenkins.jar jenkins1.jar
CMD [ "java","-jar","jenkins1.jar"]

