package com.winchampion.exceptions;

/**
 * Created by super on 2016/6/13.
 */
public class MainApp {
    private static final int MAX_PRE_TRANSFER_COIN = 500;

    public boolean isCoinExceedTransferLimits(int coin){
        return coin > MAX_PRE_TRANSFER_COIN;
    }

    //因为CoinNotEnoughException继承了RuntimeException，因此没有被强制抛出
    public void transferCoin(int coin){
        if(!isCoinExceedTransferLimits(coin))
            throw new CoinNotEnoughException(coin);
        //IllegalArgumentException是一个RuntimeException
        if(coin > MAX_PRE_TRANSFER_COIN)
            throw new IllegalArgumentException(coin + " is exceed transfer limits:500");
    }

    public static void main(String[] args) {

    }
}
