package demo.controllers;


import org.springframework.beans.factory.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

@RestController
public class MyHomeController {

    @Autowired
    private Environment env;

    @Value("${database.uri}")
    private String uri = "database.uri";

    @RequestMapping(value = "/")
    public String index() {
        String port = env.getProperty("server.port");
        String isinit = env.getProperty("spider.isinit");
        return "service is run on " + port
                + " \n isinit:" + isinit + "version : 0.0.2.00005"
                + " \n mongo:" + uri;
    }

    @RequestMapping(value = "/publish")
    public String publish() {
        InputStream in = null;
        try {
            Process pro = Runtime.getRuntime().exec(new String[]{
                    "myos", "build_spider"});

            pro.waitFor();
            in = pro.getInputStream();
            BufferedReader read = new BufferedReader(new InputStreamReader(in));
            String result = read.readLine();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }


}
