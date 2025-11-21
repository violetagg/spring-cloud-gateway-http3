# Example for configuring HTTP/3 in Spring Cloud Gateway application

## Prerequisites

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