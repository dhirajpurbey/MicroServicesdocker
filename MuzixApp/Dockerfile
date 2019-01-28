FROM openjdk:11.0-jdk

ADD ./target/Track-0.0.1-SNAPSHOT.jar /muzix/app/Track-0.0.1-SNAPSHOT.jar

WORKDIR muzix/app
EXPOSE 8086

ENTRYPOINT ["java","-jar","Track-0.0.1-SNAPSHOT.jar"]