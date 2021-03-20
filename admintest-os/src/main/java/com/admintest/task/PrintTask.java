package com.admintest.task;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Author: 424baopu
 * @Date: 2021/3/20 14:49
 * @Description: 每隔一分钟打印一次
 */

@Component
@EnableScheduling
public class PrintTask {
    @Scheduled(cron="0 0/1 * * * ?")
    public void print() {
        System.out.println("定时任务在打印！");
    }
}
