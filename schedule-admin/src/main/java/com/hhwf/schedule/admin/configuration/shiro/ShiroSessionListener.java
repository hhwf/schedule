package com.hhwf.schedule.admin.configuration.shiro;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.SessionListener;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * seesionCount 监听类
 * Created by 32958 on 2019/12/4.
 */
public class ShiroSessionListener implements SessionListener{

    private final AtomicInteger sessionCount = new AtomicInteger(0);

    @Override
    public void onStart(Session session) {
        sessionCount.incrementAndGet();
    }

    @Override
    public void onStop(Session session) {
        sessionCount.decrementAndGet();
    }

    @Override
    public void onExpiration(Session session) {
        sessionCount.decrementAndGet();
    }

    /**
     * 获取当前在线人数
     * @return
     */
    public AtomicInteger getSessionCount(){
        return sessionCount;
    }
}
