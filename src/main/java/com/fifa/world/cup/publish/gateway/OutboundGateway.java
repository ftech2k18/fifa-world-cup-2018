package com.fifa.world.cup.publish.gateway;

import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway(defaultRequestChannel = "pubsubOutputChannel")
public interface OutboundGateway {
    void sendToPubsub(String text);
}
