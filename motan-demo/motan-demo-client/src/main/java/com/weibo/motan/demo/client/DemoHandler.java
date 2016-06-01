package com.weibo.motan.demo.client;

import com.weibo.api.motan.config.springsupport.annotation.ApiReference;
import com.weibo.motan.demo.service.MotanDemoService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by fld on 16/6/1.
 */
@Component
public class DemoHandler {
    @ApiReference(basicReferer = "motantestClientBasicConfig2")
//    @Resource(name="motanDemoReferer")
    private MotanDemoService motanDemoService;

    public void test() {
        for (int i = 0; i < 100; i++) {
            System.out.println(motanDemoService.hello("motan" + i));
//            Thread.sleep(500);
        }

    }
}
