FROM openjdk:18
VOLUME  /tmp
ENV IMG_PATH=/img 
EXPOSE 8080
RUN mkdir -p /img
ADD .\target\demo-0.0.1-SNAPSHOT.war  app.war
ENTRYPOINT [ "java" , "-war","/app.war"]