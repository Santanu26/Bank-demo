```html

<!-- https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-config-monitor -->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-config-monitor</artifactId>
    <version>4.0.4</version>
</dependency>

https://console.hookdeck.com/


All 3 ms is dependent to the configserver. So we have to ensure that 
First we run the configserver successfully, then run others.
To do it, we have to implement liveliness and readiness probe

Liveness: answer: is the container live? True or false
Readiness: answer: is the container ready to receive network traffic? True or False

Inside Spring boot apps, actuator gathers the Liveness and readiness information from the applicationAvailability interface and uses that information in dedicated health indicators:

/actuator/health/liveness
/actuator/health/readiness

# latest RabbitMQ 3.12
docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.12-management

http://localhost:8071/eurekaserver/default
```