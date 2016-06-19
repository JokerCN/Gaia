package com.winchampion.aop;

/**
 * Project-name: Gaia
 * Description: ${DESCRIPTION}
 * Created by David Yang on 2016/6/19.
 */
public class ForumServiceImpl implements  ForumService {
    @Override
    public void removeTopic(int topicId) {
        //此处的横切代码被放到代理中实现
        /*PerformanceMonitor.begin("com.winchampion.aop.ForumServiceImpl.removeTopic");*/
        System.out.println("模拟删除Topic记录:" + topicId);
        try{
            Thread.currentThread().sleep(20);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        //此处的横切代码被放到代理中实现
        /*PerformanceMonitor.end();*/
    }

    @Override
    public void removeForum(int forumId) {
        //此处的横切代码被放到代理中实现
        /*PerformanceMonitor.begin("com.winchampion.aop.ForumServiceImpl.removeForum");*/
        System.out.println("模拟删除Forum记录：" + forumId);
        try{
            Thread.currentThread().sleep(40);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        //此处的横切代码被放到代理中实现
        /*PerformanceMonitor.end();*/
    }
}
