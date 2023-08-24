package com.qi.vps.controller;


import com.qi.vps.ContextUtil;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subscribe")
public class SubscribeController {

    @GetMapping("/{name}")
    public String get(@PathVariable("name") String name) {
        return ContextUtil.getInstance().subscribeManager.getSubscribe(name);
    }

    @PostMapping("/{name}")
    public String add(@PathVariable("name") String name, @RequestBody String value) {
        String[] values = value.split("\n");
        for (String s : values) {
            ContextUtil.getInstance().subscribeManager.addSubscribe(name, s);
        }
        return "success";
    }

    @DeleteMapping("/{name}")
    public String remove(@PathVariable("name") String name) {
        ContextUtil.getInstance().subscribeManager.removeSubscribe(name);
        return "success";
    }
}
