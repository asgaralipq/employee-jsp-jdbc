FROM open.jdk:8
EXPOSE 8080
ADD target/employee-jsp-jdbc.war employee-jsp-jdbc.war
ENTRYPOINT ["java","-war","/employee-jsp-jdbc.war"]