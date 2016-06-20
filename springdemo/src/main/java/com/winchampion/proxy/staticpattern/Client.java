package com.winchampion.proxy.staticpattern;

/**
 * Created by super on 2016/6/15.
 */
public class Client {
    public static void main(String[] args) {
        UserManager userManager = new UserManagerImplProxy(new UserManagerImpl());
        userManager.addUser("0001","胡浩杰");
    }
}
