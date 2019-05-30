package com.lb.String;

import org.springframework.lang.Nullable;

public abstract class StringUtils extends org.springframework.util.StringUtils {

    public static boolean isNoEmpty(@Nullable Object str) {
        return !isEmpty(str);
    }

    public static boolean isBlank(@Nullable Object str) {
        return !isEmpty(str)?isEmpty(str.toString().trim()):true;
    }

    public static boolean isNoBlank(@Nullable Object str) {
        return !isBlank(str);
    }

}
