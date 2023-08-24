package com.qi.vps;

import org.apache.logging.log4j.util.Base64Util;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class SubscribeManager {

    private final Map<String, List<String>> subscribeMap = new HashMap<>();

    // 增加一个订阅
    public void addSubscribe(String name, String value) {
        List<String> list = subscribeMap.getOrDefault(name, new ArrayList<>());
        list.add(value);
        subscribeMap.put(name, list);
    }

    // 删除一组订阅
    public void removeSubscribe(String name) {
        subscribeMap.remove(name);
    }

    // 获取一组订阅
    public String getSubscribe(String name) {
        List<String> list = subscribeMap.getOrDefault(name, new ArrayList<>());
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s).append("\n");
        }
        // sb转base64
        return Base64Util.encode(sb.toString());
    }
}
