package com.winchampion.proxy.staticpattern;

/**
 * Created by super on 2016/6/15.
 */
public class UserManagerImpl implements UserManager{

    @Override
    public void addUser(String userId, String userName) {
        try{
            System.out.println("UserManagerImpl.addUser() userId-->>" + userId);
        }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    @Override
    public void delUser(String userId) {
        System.out.println("UserManagerImpl.delUser() userId-->>" + userId);
    }

    @Override
    public void modifyUser(String userId, String userName) {
        System.out.println("UserManagerImpl.modifyUser() userId-->>" + userId);
    }

    @Override
    public String findUser(String userId) {
        System.out.println("UserManagerImpl.findUser() userId-->>" + userId);
        return "胡浩杰";
    }
}
