package com.company;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.HashMap;
import java.util.HashSet;

public class Main2 {

    public static void main(String[] args) {
        /*System.out.println(dbg("hello", "world", 100));
        System.out.println(dbg("dabaoge", "xiaokonglong", 2));
        System.out.println(dbg("dalongmao", "xiaoxiongmao", 3));
        System.out.println(battle("dabaoge", "xiaobaoge"));
        String[] players = {"xiaobaoge", "xiaocangshu", "xiaokonglong", "xiaoxiongmao", "xiaogg", "dalongmao", "xiaogouxiong"};
        int sum = 0;

        for (int i = 0; i < players.length; i++) {
            String c = players[i];
            System.out.println(battle("dabaoge", c));
            String winner = battle("dabaoge", c);
            if (winner == "dabaoge") {
                sum++;

            }

        }
        System.out.println(sum);*/

        String[] kids = {"dabaoge", "xiaobaoge", "xiaocangshu"};
        String[] fams = new String[4];
        fams[0] = "xiaosisi";
        for (int i = 0; i < kids.length; i++) {
            fams[i + 1] = kids[i];

        }

        HashSet hs = new HashSet<Integer>();
        hs.add(1);
        hs.add(3);
        hs.add(5);
        System.out.println(hs.size());
        hs.add(5);
        System.out.println(hs.size());
        System.out.println(hs.remove(5));
        System.out.println(hs.size());
        System.out.println(hs.contains(1));

        HashMap hm = new HashMap<Integer, String>();
        hm.put(1, "hello");
        hm.put(3, "world");
        System.out.println(hm.get(1));
        System.out.println(hm.get(3));
        System.out.println(hm.size());
        System.out.println(hm.containsKey(2));


        //   war(fams);


    }


    static int dbg(String xcs, String xkl, int age) {
        int a = xcs.length() + 4;
        int b = xkl.length() * 7;
        int c = a + b;
        return c % age;

    }

    static String battle(String player1, String player2) {
        int x = player1.length();
        int y = player2.length();
        int age = x + y;
        int d = dbg(player2, player1, age);
        if (d % 2 == 0) {
            return player1;

        } else {
            return player2;
        }
    }

    static void war(String[] kids) {
        for (int i = 0; i < kids.length; i++) {
            String pi = kids[i];
            for (int j = 0; j < kids.length; j++) {
                String pj = kids[j];
                if (pi != pj) {
                    String res = battle(pi, pj);
                    System.out.println(pi + " " + pj + " " + res);
                }
            }
        }


    }

/*    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            int a = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (a + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }


        return result;


    }*/


    public int[] twoSum(int[] nums, int target) {
        int[] r = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();


        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            int b = target - a;
            boolean hasb= hm.containsKey(b);
            if (hasb==true) {
                r[0] = i;
                r[1] = hm.get(b);
                return r;

            } else {
                hm.put(a, i);

            }

        }


        return r;


    }
}
