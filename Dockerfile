FROM openjdk:15-jdk-alpine
COPY ./target/relink.jar /reLink/
CMD ["java", "-jar", "/reLink/relink.jar"]
EXPOSE 3080
