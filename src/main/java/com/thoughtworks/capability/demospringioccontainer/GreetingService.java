package com.thoughtworks.capability.demospringioccontainer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

@Service
@Slf4j
public class GreetingService {
    GreetingService() {
        log.info("greet service constructor");
    }
    String sayHi() {
        return "hello world";
    }
}
