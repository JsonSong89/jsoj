package base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;


@SpringBootApplication
@ComponentScan(basePackages = {

})
public class MyTestBootApplication extends SpringBootServletInitializer {

    @Autowired
    private Environment environment;

    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext context = SpringApplication.run(MyTestBootApplication.class, args);
        System.out.println(">>>>>>>>>>TaskConfig is " + context.getBean(MyTestBootApplication.class));
    }
}
