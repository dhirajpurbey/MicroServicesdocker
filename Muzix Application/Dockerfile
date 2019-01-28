FROM openjdk:11.0-jdk

ADD ./target/User-0.0.1-SNAPSHOT.jar /muzix/app/User-0.0.1-SNAPSHOT.jar

WORKDIR muzix/app
EXPOSE 8484
ENTRYPOINT ["java","-jar","User-0.0.1-SNAPSHOT.jar"]