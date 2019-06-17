FROM java:8
VOLUME /eureka-server
EXPOSE 8761
ADD target/teureka-0.0.1-SNAPSHOT.jar eureka-server-1.0.jar
ENTRYPOINT ["java", "-jar", "eureka-server-1.0.jar"]