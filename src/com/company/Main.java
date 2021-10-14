package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // String s = "hello world";
        // System.out.println(s);
        // int sl= s.length();
        //  System.out.println(s.length());

/*        int x = dbg("hello");
        String s = "abc";
        String d = s + x;
        System.out.println("answer is " + x);

        int y = dbg("world!");
        System.out.println("answer is " + y);

        System.out.println("ending here");
        boolean a1 = xbg("abc", 1, 'b');
        boolean a2 = xbg("hellow", 3, 'x');
        System.out.println(a1);
        System.out.println(a2);*/


        //int a = 3;
/*        int[] a = {1, 3, 5, 7, 9, 11};
        System.out.println(a.length);
        System.out.println(a[2]);

        int sum = 0;
        for (int i = 0; i < 6; i = i + 1) {
            System.out.println("ith index = " + i + " is the value of " + a[i]);
            sum = sum + a[i];
        }
        System.out.println(sum);
        System.out.println(sum/a.length);

        String s = "abcdef";
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.startsWith("abc"));
        System.out.println(s.startsWith("abcx"));*/

        int[] arr = {4, 6, 8, 11, 17};
       /* System.out.println(arr.length);
        System.out.println(arr[1]);
        System.out.println(arr[arr.length - 1]);*/

        /*int dbg = 0;
        for (int i = 0; i < arr.length; i = i + 1) {
            System.out.println("i is " + i);
            System.out.println("arr[i] is " + arr[i]);
            if (i % 2 == 0) {
                dbg = dbg + arr[i];
            }


            System.out.println("dng is " + dbg);
        }

        System.out.println(dbg / arr.length);

        int xbg = 0;
        System.out.println(xbg);
        //String[] xiaopanger = {"hello", "rebecca"};
        for (int i = 0; i < xiaopanger.length; i = i + 1) {

            xbg = xbg + xiaopanger[i].length();


            System.out.println("xiaopanger is " + xiaopanger[i]);
            System.out.println(xiaopanger[i].length());
        }





    }

    static int dbg(String xcs) {
        System.out.println("xcs  is " + xcs);

        int a = xcs.length();
        int b = a + 10;
        return b;


    }

    static boolean xbg(String abc, int index, char target) {
        char x = abc.charAt(index);
        boolean y = x == target;
        return y;*/


        String[] brr = {"man", "belt", "columbia", "panther"};
        int t = 0;
        int y = 1000000;
        String z = "xyz";

        for (int i = 0; i < brr.length; i = i + 1) {
            t = t + brr[i].length();


            if (y > brr[i].length()) {
                y = brr[i].length();
                z = brr[i];

            }

        }
        System.out.println("t is " + t);
        System.out.println(z);

        int[] crr = {175, 433, 28, 15, 22, 10008, 999, 222};
        for (int i = crr.length - 1; i >= 0; i--) {
            //   System.out.println(crr[i]);
            if (crr[i] % 2 == 0) {

                System.out.println("I find U " + crr[i]);

                //break;


            } else {
                System.out.println("U R DBG " + crr[i]);

            }



        }


    }


}
