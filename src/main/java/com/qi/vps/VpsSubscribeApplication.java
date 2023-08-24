package com.qi.vps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class VpsSubscribeApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(VpsSubscribeApplication.class, args);
        ContextUtil.getInstance().init(context);
    }

}
