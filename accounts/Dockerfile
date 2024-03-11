#Start with a base image containing java Runtime
FROM openjdk:17-jdk-slim

#INformation aroud who maintains the image
LABEL maintainer=javaexpress.com

#Add the applications's jar to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java","-jar","accounts-0.0.1-SNAPSHOT.jar"]