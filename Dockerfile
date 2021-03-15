FROM open.jdk:8
EXPOSE 8085
ADD target/employee-jsp-jdbc.war employee-jsp-jdbc.war
ENTRYPOINT ["java","-war","/employee-jsp-jdbc.war"]