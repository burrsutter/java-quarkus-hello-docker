# Java, Quarkus, Hello, with Dockerfile
```
mvn package

java -jar target/java-quarkus-hello-1.0.0-SNAPSHOT-runner.jar

curl localhost:8080

Hello Quarkus 4 12-23-2022 03:13:59 on unknown
```

```
docker build -f src/main/docker/Dockerfile.jvm -t java-quarkus-hello-docker .

docker run -i --rm -p 8080:8080 java-quarkus-hello-docker

curl localhost:8080

Hello Quarkus 1 12-24-2022 03:39:03 on e29c6975f9e3
```