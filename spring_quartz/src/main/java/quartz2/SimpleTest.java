package quartz2;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

public class SimpleTest {
    //JobBuilder.newJOb(XXX).withIdentity().build()
    //TriggerBuilder.newTrigger().withIdentity().withSchedule(XXX).startNow().build
    //StdSchedulerFactory factory = new StdSchedulerFactory();
    public static void main(String[] args) throws SchedulerException, InterruptedException {
        //绑定job类,指明job名称和组名,并生成实例
        JobDetail jobDetail = JobBuilder.newJob(ExecutorCenter.class).
                withIdentity("getUp", "myPlan").build();
        //指明trigger 触发器名称和组名,并生成实例,trigger要指定触发时间和次数
        Trigger trigger = TriggerBuilder.newTrigger().
                withIdentity("trigger", "myPlan").
                withSchedule(
                        //repeatSecondlyForever new 了一个SimpleScheduleBuilder实例
                        SimpleScheduleBuilder.repeatSecondlyForever(1).
                                //即使不加startNow()也能执行
                                withRepeatCount(4)).startNow().build();//每一秒执行一次,重复执行4次,一共执行5次

        StdSchedulerFactory factory = new StdSchedulerFactory();
        //获取scheduler 调度器
        Scheduler scheduler = factory.getScheduler();
        //调度器绑定job和trigger
        scheduler.scheduleJob(jobDetail, trigger);
        //启动调度器
        scheduler.start();
        Thread.sleep(6000);
        //关闭调度器
        scheduler.shutdown();
    }
}
