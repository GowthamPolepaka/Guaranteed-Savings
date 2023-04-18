FROM openjdk:17
EXPOSE 8080:8080
RUN mkdir -p /app/
COPY startup.sh .
COPY ./build/install/motorInsurance/ /app/
COPY ./agentlib/applicationinsights-agent-3.4.7.jar  agent.jar
COPY ./agentlib/applicationinsights.json applicationinsights.json
ENV JAVA_OPTS="-javaagent:/agent.jar"
RUN chmod +x /startup.sh
ENTRYPOINT ["./startup.sh"]