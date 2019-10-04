FROM azul/zulu-openjdk-alpine:11-jre
ARG JAR_FILE
VOLUME /tmp
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["sh","-c","java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar"]