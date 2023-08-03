package com.chz.pojo;

import com.chz.service.MeetingService;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class PlanJob implements Job {
    private MeetingService meetingService=new MeetingService();
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        JobDataMap map = context.getMergedJobDataMap();
//        for (Map.Entry<String, Object> stringObjectEntry : map.entrySet()) {
//            System.out.println(stringObjectEntry.getKey()+stringObjectEntry.getValue());
//        }
        map.forEach((k,v)-> System.out.println(k+v));
        meetingService.remindMeeting();
    }
}
