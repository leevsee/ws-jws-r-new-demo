package com.leeves.wsjwsrnewdemo.client;

import com.leeves.wsjwsrnewdemo.webservice.LeevesService;
import com.leeves.wsjwsrnewdemo.webservice.LeevesServiceImplService;

import org.springframework.util.Assert;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.ws.BindingProvider;

/**
 * Description: web service Client
 * Package: com.leeves.wsjwsrnewdemo.client
 *
 * @author Leeves
 * @version 1.0.0  2018-07-18
 */
public class WSClient {

    private static final String CONNECTION_TIMEOUT = "javax.xml.hisws.client.connectionTimeout";

    private static final String RECEIVE_TIMEOUT = "javax.xml.hisws.client.receiveTimeout";
    //5秒
    private static long timeOut = 5 * 1000;

    private static final String WS_URL = "http://172.16.11.32:7000/jws/leevesService?wsdl";

    private static LeevesService leevesService = null;

    public static String getInstance(String reqMsg) {

        if (leevesService == null) {
            LeevesServiceImplService leevesServiceImplService;
            try {
                leevesServiceImplService = new LeevesServiceImplService(new URL(WS_URL));
                leevesService = leevesServiceImplService.getLeevesServiceImplPort();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            Assert.notNull(leevesService, "web service client instance must not null!");
            ((BindingProvider) leevesService).getRequestContext().put(CONNECTION_TIMEOUT, timeOut);
            ((BindingProvider) leevesService).getRequestContext().put(RECEIVE_TIMEOUT, timeOut);
        }

        return leevesService.leevesService(reqMsg);
    }

}