package demo.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Configurable
@EnableScheduling
public class TaskConfig {


    @Scheduled(cron = "0 0 2 * * ?")
    public void reportCurrentByCron() {

    }

    /**
     * 工作时间内每半小时
     */
    @Scheduled(cron = "0 0/30 6-23 * * ?")
    public void workTimeJob() {

    }
}
