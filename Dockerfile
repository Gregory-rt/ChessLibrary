FROM openjdk:8

RUN mkdir /app

COPY target/ChessLibrary-1.0.jar /app/ChessLibrary.jar

WORKDIR /app

CMD ["java", "-jar", "ChessLibrary-1.0.jar"]
