package quartz2;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class ExecutorCenter implements Job {
    private MyPlan myPlan=new MyPlan();
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        myPlan.getUp();
    }
}
