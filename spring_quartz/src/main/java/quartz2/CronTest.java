package quartz2;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

public class CronTest {
    public static void main(String[] args) throws SchedulerException, InterruptedException {
        String cron="0/5 * 20 16 3 ? 2020";
        JobDetail jobDetail = JobBuilder.newJob(ExecutorCenter.class).
                withIdentity("getUp", "myPlan").build();
        Trigger trigger = TriggerBuilder.newTrigger().
                withIdentity("trigger", "myPlan").
                withSchedule(
                        CronScheduleBuilder.cronSchedule(cron)
                       ).startNow().build();

        StdSchedulerFactory factory = new StdSchedulerFactory();
        Scheduler scheduler = factory.getScheduler();
        scheduler.scheduleJob(jobDetail, trigger);
        scheduler.start();
    }
}
