FROM jenkins/jenkins:lts

USER root

RUN apt-get update && app-get install -y maven

USER jenkins