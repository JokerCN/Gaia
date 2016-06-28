package com.winchampion.proxy.staticpattern;

/**
 * Created by super on 2016/6/15.
 */
public class UserManagerImplProxy  implements UserManager{

    private UserManager userManager;

    public UserManagerImplProxy(UserManager userManager){
        this.userManager = userManager;
    }
    @Override
    public void addUser(String userId, String userName) {
        try{
            System.out.println("start-->>addUser() userId-->>" + userId);
            userManager.addUser(userId,userName);
            System.out.println("success-->>addUser()");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("error-->>addUser()");
        }
    }

    @Override
    public void delUser(String userId) {

    }

    @Override
    public void modifyUser(String userId, String userName) {

    }

    @Override
    public String findUser(String userId) {
        return null;
    }
}
