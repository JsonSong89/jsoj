package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@SpringBootApplication
@ComponentScan(basePackages = {
        "jsonsong.spider.config",
        "jsonsong.spider.controllers",
})
public class MyBootApplication extends SpringBootServletInitializer {

    @Autowired
    private Environment env;


    public static void main(String[] args) throws Exception {
        final ApplicationContext applicationContext = SpringApplication.run(MyBootApplication.class, args);
    }
}
