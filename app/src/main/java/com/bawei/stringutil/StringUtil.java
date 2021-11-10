package com.bawei.stringutil;

/**
 * @author : zhiyu
 * @date : 2021/11/10
 * @content :
 */
public class StringUtil {
    public static boolean isString(String s){
        if (s.trim().equals("")||null==s){
            return false;
        }
        return true;
    }
}
