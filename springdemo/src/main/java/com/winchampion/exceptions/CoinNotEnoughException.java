package com.winchampion.exceptions;

/**
 * Created by super on 2016/6/13.
 */
public class CoinNotEnoughException extends RuntimeException{
    private int coin;

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public CoinNotEnoughException(){

    }

    public CoinNotEnoughException(int coin){
        this.coin = coin;
    }

    @Override
    public String getMessage(){
        return coin + " is exceed transfer limit:500";
    }

    @Override
    public String toString() {
        return "CoinNotEnoughException{" +
                "coin=" + coin +
                '}';
    }
}
