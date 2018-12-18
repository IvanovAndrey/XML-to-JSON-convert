FROM java:8-jre-alpine
RUN apk add --no-cache curl
ADD course-work.jar app.jar
ENTRYPOINT ["sh", "-c", "java -jar /app.jar"]