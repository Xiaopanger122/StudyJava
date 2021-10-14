package com.company;

public class Panger1013 {

    public static void main(String[] arg) {
        System.out.println("hello");
        String[] kids = new String[5];
        kids[0] = "dabaoge";
        kids[1] = "xiaocangshu";
        kids[2] = "xiaosisi";
        kids[3] = "dalongmao";
        kids[4] = "xiaogouxiong";
        int minlenghth = Integer.MAX_VALUE;

        for (int i = 0; i < kids.length; i++) {
            if (minlenghth < kids[i].length()) {
            } else {
                minlenghth = kids[i].length();
            }
        }

        for (int i = 0; i < kids.length; i++) {
            System.out.println(kids[i] + " " + kids[i].length());
            if (kids[i].length() == 8) {
                break;
            }
        }
        for (String kid : kids
        ) {
            System.out.println(kid);
        }
        System.out.println(minlenghth);

        int i = 0;
        while (i < kids.length) {
            System.out.println(kids[i]);
            i=i+2;
        }
    }

}
