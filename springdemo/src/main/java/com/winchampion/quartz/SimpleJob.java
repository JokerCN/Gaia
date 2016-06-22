package com.winchampion.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

/**
 * Created by super on 2016/6/22.
 */
public class SimpleJob implements Job{
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println(context.getTrigger().getDescription()+" triggered. time is : "+ new Date());
    }
}
