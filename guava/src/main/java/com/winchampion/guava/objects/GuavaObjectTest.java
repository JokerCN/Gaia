package com.winchampion.guava.objects;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.collect.ComparisonChain;

/**
 * Project-name: Gaia
 * Description: ${DESCRIPTION}
 * Created by David Yang on 2016/6/29.
 */
public class GuavaObjectTest {
    public static void main(String[] args) {
        //Objects.equal方法
        Objects.equal("a","a");//true
        Objects.equal(null,"a");//false
        Objects.equal("a",null);//false
        Objects.equal(null,null);//true

        //Objects.hashCode方法
        Objects.hashCode("a","b","c","...");

        //MoreObjects.toString
        MoreObjects.toStringHelper(GuavaObjectTest.class).add("x",1).toString();

        //Fluent风格比较器，执行比较直到发现非零的结果，在那之后的比较输入将被忽略
        ComparisonChain.start()
                .compare("a","b")
                .compare(1,2)
                .compare("qqq","www")
                .result();
    }
}
