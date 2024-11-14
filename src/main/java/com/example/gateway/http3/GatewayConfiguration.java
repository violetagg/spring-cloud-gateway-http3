package com.example.gateway.http3;

import org.springframework.cloud.gateway.config.HttpClientCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.netty.http.HttpProtocol;

import java.time.Duration;

@Configuration
class GatewayConfiguration {

	@Bean
	HttpClientCustomizer http3HttpClientCustomizer() {
		return httpClient ->
				httpClient
						// Configure HTTP/3 protocol
						.protocol(HttpProtocol.HTTP3)
						// Configure HTTP/3 settings
						.http3Settings(spec -> spec.idleTimeout(Duration.ofSeconds(5))
								.maxData(10_000_000)
								.maxStreamDataBidirectionalLocal(1_000_000));
	}
}