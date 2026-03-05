FROM openjdk:17

WORKDIR /app

COPY src/program/Calculator.java .

RUN javac Calculator.java

CMD ["java","Calculator"]
