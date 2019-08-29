package com.sunrain.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Slf4j
@Order(value = Ordered.LOWEST_PRECEDENCE)
public class CustomeGatewayFilter implements GatewayFilter {

    private static final String COUNT_TIME = "countStarterTime";

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        exchange.getAttributes().put(COUNT_TIME, System.currentTimeMillis());

        return chain.filter(exchange).then(
                Mono.fromRunnable(() -> {
                    Long startTime = exchange.getAttribute(COUNT_TIME);

                    Long endTime = (System.currentTimeMillis() - startTime);

                    log.info(exchange.getRequest().getURI().getRawPath() + ":" + endTime + "ms");
                })
        );
    }
}
