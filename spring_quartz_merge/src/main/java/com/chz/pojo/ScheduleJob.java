package com.chz.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ScheduleJob {
    private String jobId;
    private String jobName;
    private String jobGroup;
    private String jobStatus;//0禁用 1启用 2删除
    private String cronExpression;
    private String desc;
}
