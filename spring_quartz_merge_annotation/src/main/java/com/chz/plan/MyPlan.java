package com.chz.plan;

import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class MyPlan {
    @Scheduled(cron = "0/5 * * * * *")
    public void getUp(){
        System.out.println("起床");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
}
