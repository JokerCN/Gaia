package com.winchampion.aop.introduce;

import com.winchampion.aop.PerformanceMonitor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

/**
 * Project-name: Gaia
 * Description: ${DESCRIPTION}
 * Created by David Yang on 2016/6/19.
 */
public class ControllablePerformanceMonitor extends DelegatingIntroductionInterceptor implements Monitorable{

    private ThreadLocal<Boolean> MonitorStatusMap = new ThreadLocal<Boolean>();

    @Override
    public void setMonitorActive(boolean active) {
        MonitorStatusMap.set(active);
    }

    //拦截方法
    @Override
    public Object invoke(MethodInvocation mi)throws Throwable{
        Object obj = null;
        //对于支持性能监视可控代理，通过判断其状态决定是否开启性能监控功能
        if(MonitorStatusMap.get() != null && MonitorStatusMap.get()){
            PerformanceMonitor.begin(mi.getClass().getName() + "." +mi.getMethod().getName());
            obj = super.invoke(mi);
            PerformanceMonitor.end();
        }else{
            obj = super.invoke(mi);
        }
        return obj;
    }
}
