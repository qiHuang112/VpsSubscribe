package com.qi.vps;

public class ContextUtil {

    private static ContextUtil instance;

    private ContextUtil() {

    }

    public static ContextUtil getInstance() {
        if (instance == null) {
            instance = new ContextUtil();
        }
        return instance;
    }

    public SubscribeManager subscribeManager;

    public void init(org.springframework.context.ApplicationContext context) {
        subscribeManager = context.getBean(SubscribeManager.class);
    }

}
