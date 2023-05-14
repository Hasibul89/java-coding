package com.hasibul.passgen;
import java.security.SecureRandom;
 

public class Generator {
    protected static String dict = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdedfghijklmnopqrstuvwxyz0123456789";
    public static String gen(int length) {
        // create instance of SecureRandom class
        SecureRandom rand = new SecureRandom();
        String password = "";
        for(int i=0;i<length;i++) {
            int random = rand.nextInt(dict.length());
            password += dict.charAt(random);
        }
        return password;
    }
}

