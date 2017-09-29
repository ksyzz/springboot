package com.example.demo.util;

import org.mindrot.jbcrypt.BCrypt;

/**
 * Created by fengqian on 2017/8/4 0004.
 * BCrypt加密
 */
public class PassWord {
    public static void main(String[] args) {
        String password = "testHash";
        System.out.println(encode(password));
        System.out.println(encode(password));
        System.out.println(BCrypt.checkpw("testHash", encode(password)));
    }

    private static String encode(String password){
        String salt = BCrypt.gensalt();
        String hash = BCrypt.hashpw(password, salt);
        System.out.println(salt);
        return hash;
    }
}
