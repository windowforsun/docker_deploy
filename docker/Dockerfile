FROM openjdk:10-jre-slim
COPY ./out/artifacts/spring_boot_docker_jar_jar/spring-boot-docker-jar.jar /usr/src/hola/
WORKDIR /usr/src/hola
EXPOSE 8080
CMD ["java", "-jar", "spring-boot-docker-jar.jar"]