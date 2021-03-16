FROM open.jdk:8
EXPOSE 8085
ADD target/employee-jsp-jdbc.war employee-jsp-jdbc.war
COPY --from=build /employee-jsp-jdbc .
ENTRYPOINT ["java","-war","/employee-jsp-jdbc.war"]