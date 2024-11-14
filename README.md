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

In `pom.xml` add dependency to [netty-incubator-codec-http3](https://github.com/netty/netty-incubator-codec-http3)
```xml
<dependency>
	<groupId>io.netty.incubator</groupId>
	<artifactId>netty-incubator-codec-http3</artifactId>
	<version>0.0.28.Final</version>
	<scope>runtime</scope>
</dependency>
```
### Configure SSL Bundle

In `application.yml` add the `SSL` configuration
```yaml
ssl:
  bundle:
    jks:
      server-http3:
        key:
          alias: http3
        keystore: ...
```
More information about [SSL Bundle](https://docs.spring.io/spring-boot/reference/features/ssl.html) settings:

## Available endpoints

### Remote Endpoint

```shell
curl --http3 https://localhost:8443/ -v 
```