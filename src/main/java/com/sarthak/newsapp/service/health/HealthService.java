package com.sarthak.newsapp.service.health;

import com.sarthak.newsapp.model.health.Health;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class HealthService {

    private static final Logger log = LoggerFactory.getLogger(HealthService.class);

    public Health deepHealthCheck() {
        log.debug("Inside getDeepHealthCheck");
        Health health = new Health();
        health.setAppHealth("OK");
        return health;
    }

}
