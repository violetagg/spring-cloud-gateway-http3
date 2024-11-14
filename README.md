# Example for configuring HTTP/3 in Spring Cloud Gateway application

## Prerequisites

### Configure Reactor Netty version

Bump `Reactor BOM` version in `pom.xml`
```xml
<properties>
	<reactor-bom.version>2024.0.0</reactor-bom.version>
</properties>
```

### Add dependency to Netty Http3 Codec

In `pom.xml` add dependency to `netty-incubator-codec-http3`
```xml
<dependency>
	<groupId>io.netty.incubator</groupId>
	<artifactId>netty-incubator-codec-http3</artifactId>
	<version>0.0.28.Final</version>
</dependency>
```
### Configure Ssl Bundle

In `application.yml` add the SSL configuration
```yaml
ssl:
  bundle:
    jks:
      http3:
        key:
          alias: http3
        keystore: ...
```
https://docs.spring.io/spring-boot/reference/features/ssl.html

## Available endpoints

### Remote Endpoint

```shell
curl --http3 https://localhost:8080/ -v 
```