package quartz1;

import org.quartz.*;

//必须让一个类实现Job接口,将想要的方法放入execute
public class PlanJob implements Job {
    MeetingService service=new MeetingService();
    @Override//并发执行
    public void execute(JobExecutionContext context) throws JobExecutionException {
        //这里的key就是name+group
        TriggerKey key = context.getTrigger().getKey();
        JobKey key1 = context.getJobDetail().getKey();
        JobDataMap mergedJobDataMap = context.getMergedJobDataMap();
        mergedJobDataMap.forEach((k,v)-> System.out.println(k+v));
        System.out.println(key+"\n"+key1);
        service.meeting();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end-----");
    }
}
