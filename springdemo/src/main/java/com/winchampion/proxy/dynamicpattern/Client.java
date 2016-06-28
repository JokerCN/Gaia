package com.winchampion.proxy.dynamicpattern;

/**
 * Created by super on 2016/6/15.
 */
public class Client {
    public static void main(String[] args) {
        BusinessHandler businessHandler = new BusinessHandler();
        UserManager userManager = (UserManager)businessHandler.newProxyInstance(new UserManagerImpl());

        String name = userManager.test("0001");
        System.out.println("Client.main() --- " + name);
    }
}
