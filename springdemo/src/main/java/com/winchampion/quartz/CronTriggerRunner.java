package com.winchampion.quartz;

import com.winchampion.utils.PropUtils;
import org.quartz.*;
import org.quartz.impl.JobDetailImpl;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.triggers.CronTriggerImpl;

/**
 * Created by super on 2016/6/22.
 */
public class CronTriggerRunner {
    public static void main(String[] args) {
        try{
            JobDetail jobDetail = new JobDetailImpl("job1_2","jGroup1",SimpleJob.class);
            CronTriggerImpl cronTrigger = new CronTriggerImpl("trigger1_2","tgroup1");
            CronExpression cexp = new CronExpression(PropUtils.getPropValue("config.properties","cron"));
            cronTrigger.setCronExpression(cexp);

            SchedulerFactory schedulerFactory = new StdSchedulerFactory();
            Scheduler scheduler = schedulerFactory.getScheduler();
            scheduler.scheduleJob(jobDetail,cronTrigger);
            scheduler.start();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
