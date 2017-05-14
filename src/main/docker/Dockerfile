FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD configure-exam-service-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENV CLOUD_SEA_CONFIG_SERVER_URI=http://139.59.33.41:9001
ENV CLOUD_SEA_CONFIGURE_EXAM_SERVICE=configure-exam-service
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]