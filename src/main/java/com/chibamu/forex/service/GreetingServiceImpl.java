package com.chibamu.forex.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("Greeter")
public class GreetingServiceImpl implements GreetingService
{
    private static Logger LOG = LoggerFactory.getLogger(GreetingServiceImpl.class);

    public void greet(String message)
    {
        LOG.info("Greetings! "+message);
    }
}
