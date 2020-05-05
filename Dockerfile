FROM openjdk
COPY target/calculator-1.0-SNAPSHOT.jar /home
WORKDIR /home
CMD ["java" , "-jar" , "calculator-1.0-SNAPSHOT.jar"]