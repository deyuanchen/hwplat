FROM frolvlad/alpine-oraclejdk8
VOLUME /tmp
ADD hwplat-eureka-1.0.0.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]