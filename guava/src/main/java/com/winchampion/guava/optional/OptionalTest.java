package com.winchampion.guava.optional;

import com.google.common.base.Optional;

/**
 * Project-name: Gaia
 * Description: ${DESCRIPTION}
 * Created by David Yang on 2016/6/28.
 */
public class OptionalTest {
    public static void main(String[] args) {
        Integer i = 5;

        //创建指定引用的Optional实例，若引用为null则快速失败
        Optional<Integer> ii = Optional.of(i);
//        System.err.println("ii: " + ii);

        //如果为null则抛出空指针异常
//        Optional x = Optional.of(null);

        //创建引用缺失的Optional实例
        Optional absent = Optional.absent();
        System.err.println("absent: " + absent);

        //创建指定引用的Optional实例，若引用为null则表示缺失
        Optional xx = Optional.fromNullable(i);
        Optional xxx = Optional.fromNullable(null);
        System.err.println("xx: " + xx);
        System.err.println("xxx: " + xxx);

        //如果Optional包含非null的引用，返回true
        System.err.println("xx.isPresent(): " + xx.isPresent());
        System.err.println("xxx.isPresent(): " +  xxx.isPresent());

        //get() 返回Optional所包含的引用，若引用缺失，则抛出java.lang.IllegalStateException
        Integer aa = (Integer) xx.get();
        Integer bb = (Integer) xxx.get();
    }
}
