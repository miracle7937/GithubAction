FROM adoptopenjdk/openjdk11:alpine-jre
ADD target/action.jar action.jar
ENTRYPOINT ["java", "-jar","action.jar" ]