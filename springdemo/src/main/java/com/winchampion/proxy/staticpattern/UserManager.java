package com.winchampion.proxy.staticpattern;

/**
 * Created by super on 2016/6/15.
 */
public interface UserManager {
    public void addUser(String userId,String userName);
    public void delUser(String userId);
    public void modifyUser(String userId,String userName);
    public String findUser(String userId);
}
