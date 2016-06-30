package com.winchampion.guava.preconditions;

import com.google.common.base.Preconditions;

/**
 * Project-name: Gaia
 * Description: ${DESCRIPTION}
 * Created by David Yang on 2016/6/29.
 */
public class PreconditionsTest {
    public static void main(String[] args) {
        /* 检查参数是否为null，若参数不为null该方法直接返回参数引用，否则抛出NullPointerException */
        Preconditions.checkNotNull(null);

        /* 检查参数布尔值是否为true，若为false，抛出IllegalArgumentException*/
        Preconditions.checkArgument(false);

        int i = 0;
        int j = -1;
        /* 便于输出错误消息 */
        Preconditions.checkArgument(i>0,"Argument was %s but expected nonnegative", i);
        Preconditions.checkArgument(i<j,"Expected i < j, but %s >= %s",i,j);
    }
}
