package com.winchampion.proxy.dynamicpattern;

/**
 * Created by super on 2016/6/15.
 */
public class UserManagerImpl implements UserManager{

    @Override
    public String test(String userId) {
        System.out.println("UserManagerImpl.findUser() userId-->>" + userId);
        return "胡浩杰";
    }
}
