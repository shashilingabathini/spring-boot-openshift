FROM openjdk:8
EXPOSE 8080
ADD /target/k8-minikube-deployment-0.0.1-SNAPSHOT.jar k8-minikube-sprintboot-demo.jar
ENTRYPOINT ["java" , "-jar","k8-minikube-sprintboot-demo.jar"]