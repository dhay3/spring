package quartz1;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Test {

    public static void main(String[] args) throws SchedulerException, InterruptedException, ParseException {
        //要将继承job接口的类包装到JObBuilder中
        JobBuilder jobBuilder = JobBuilder.newJob(PlanJob.class);
        //给job加唯一标识符,产生带id实际能用的job
        JobDetail jobDetail = jobBuilder.withIdentity("meeting job", "group1").build();
        //可以通过JObDataMap向execute方法中传值
        JobDataMap jobDataMap = jobDetail.getJobDataMap();
        jobDataMap.put("users", Arrays.asList("zs","wu","ls"));
        //触发器依赖两个对象TriggerBuilder,Schedule
        //trigger工厂
        TriggerBuilder<Trigger> triggerBuilder = TriggerBuilder.newTrigger();
        //添加标识符
        triggerBuilder = triggerBuilder.withIdentity("meeting trigger", "group1");
        triggerBuilder.startNow();//当满足条件时立即执行

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date start = format.parse("2020-03-16 18:46:00");
        Date end = format.parse("2020-03-16 18:46:30");
        //在指定时间段内执行
//        triggerBuilder.startAt(start);
//        triggerBuilder.endAt(end);

        //scheduler工厂
        SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.simpleSchedule();
        //设置间隔时间
        scheduleBuilder.withIntervalInSeconds(1);
        //执行次数,执行一次,重复5次,相当于创建5个线程,内容是execute方法
        scheduleBuilder.withRepeatCount(5);

        //获取触发器
        SimpleTrigger trigger = triggerBuilder.withSchedule(scheduleBuilder).build();

        //调度器工厂
        SchedulerFactory factory = new StdSchedulerFactory();
        //调度器
        Scheduler scheduler = factory.getScheduler();
        //通过调度器结合任务和触发器
        scheduler.scheduleJob(jobDetail, trigger);
        scheduler.start();
        Thread.sleep(6000);
        scheduler.shutdown();//立即关闭
//        scheduler.shutdown(true);
    }
}
