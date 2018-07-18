package com.leeves.wsjwsrnewdemo;

import com.leeves.wsjwsrnewdemo.client.WSClient;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
public class WsJwsRNewDemoApplicationTests {

    @Test
    public void contextLoads() {
        String resMsg = WSClient.getInstance("jws client");
        System.out.println(resMsg);
    }

}
