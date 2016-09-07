package stringreverse;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        String str = "012";
        System.out.println(recurRev(str));
    }
    
    static String recurRev(String str) {
        if((null == str) || (str.length() <= 1)) {
            return str;
        }
        return recurRev(str.substring(1)) + str.charAt(0);
    }
    
}
