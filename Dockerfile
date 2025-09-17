FROM openjdk:17
EXPOSE 8080
ADD target/springboot-docker-image.jar springboot-docker-image.jar
ENTRYPOINT ["java" , "-jar" , "/springboot-docker-image.jar"]