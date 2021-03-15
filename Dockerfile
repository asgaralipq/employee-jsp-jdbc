FROM open.jdk:8
EXPOSE 8080
ADD target/employee-jsp-jdbc.jar employee-jsp-jdbc.jar
ENTRYPOINT ["java","-jar","/employee-jsp-jdbc.jar"]