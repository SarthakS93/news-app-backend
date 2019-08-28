package com.sarthak.newsapp.controller.health;

import com.sarthak.newsapp.model.health.Health;
import com.sarthak.newsapp.service.health.HealthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/health")
public class HealthController {

    private final static Logger log = LoggerFactory.getLogger(HealthController.class);

    @Autowired
    private HealthService healthService;

    @GetMapping(value = "/pulse", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getPulse() {
        log.debug("Inside getPulse");
        return "OK";
    }

    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Health getHealth() {
        log.debug("Inside getHealth");
        return healthService.deepHealthCheck();
    }

}
