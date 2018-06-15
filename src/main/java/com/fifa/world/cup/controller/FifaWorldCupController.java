package com.fifa.world.cup.controller;

import com.fifa.world.cup.publish.gateway.OutboundGateway;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CommonsLog
@RestController
public class FifaWorldCupController {

    @Autowired
    private OutboundGateway messagingGateway;

    @GetMapping("/")
    public String hello() {
        log.info("Fifa Worldcup 2018 Service");
        return "Fifa Worldcup 2018 Service";
    }

    @GetMapping("/hello")
    public String helloMessage() {
        log.info("/hello endpoint");
        return "Hello World";
    }

    @PostMapping("/publishMessage")
    public String publishMessage(@RequestParam("message") String message) {
        messagingGateway.sendToPubsub(message);
        return "Message Sent to Topic. Check Logs to See the Received Message";
    }
}
