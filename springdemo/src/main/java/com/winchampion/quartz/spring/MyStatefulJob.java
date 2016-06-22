package com.winchampion.quartz.spring;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.StatefulJob;

import java.util.Map;

/**
 * Created by super on 2016/6/22.
 */
public class MyStatefulJob implements StatefulJob{
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        Map dataMap = context.getTrigger().getJobDataMap();
        String count = (String)dataMap.get("count");
        dataMap.put("count","30");
    }
}
