package com.winchampion.quartz;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.impl.JobDetailImpl;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.triggers.SimpleTriggerImpl;

import java.util.Date;

/**
 * Created by super on 2016/6/22.
 */
public class SimpleTriggerRunner {
    public static void main(String[] args) {
        try{
            JobDetail jobDetail = new JobDetailImpl("job1_1","jgroup1",SimpleJob.class);
            SimpleTriggerImpl simpleTrigger = new SimpleTriggerImpl("trigger1_1","tgroup1");
            simpleTrigger.setStartTime(new Date());
            simpleTrigger.setRepeatInterval(2000);
            simpleTrigger.setRepeatCount(100);

            SchedulerFactory schedulerFactory = new StdSchedulerFactory();
            Scheduler scheduler = schedulerFactory.getScheduler();
            scheduler.scheduleJob(jobDetail,simpleTrigger);
            scheduler.start();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
