FROM adoptopenjdk/openjdk11:alpine-jre

ADD target/action.jar action.jar
#docker build . -t enkwave_pos_api
ENTRYPOINT ["java", "-jar","action.jar" ]