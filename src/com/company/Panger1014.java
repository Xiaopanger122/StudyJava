package com.company;

import java.lang.management.MemoryType;
import java.util.*;

public class Panger1014 {
    public static void main(String[] arg) {


        String word = "abcxyzdef";
        System.out.println(word.indexOf("xyz"));
        System.out.println(word.indexOf("yzd"));
        System.out.println(word.indexOf("b"));
        System.out.println(word.indexOf("abc"));
        System.out.println(word.indexOf("mn"));


        ArrayList<Integer> al = new ArrayList<Integer>();
        //System.out.println(al);
        //System.out.println(al.size());

        // al.add(1);
        //al.add(2);


        // System.out.println(al);
        //System.out.println(al.size());
        //System.out.println(al.get(0));
        // al.add(0, 3);

        //  System.out.println(al.get(0));

        for (int bh : al
        ) {
            // System.out.println(bh);


        }

        HashSet<Integer> kt = new HashSet<Integer>();
        //System.out.println(kt.isEmpty());
        kt.add(1);
        kt.add(2);
        kt.add(3);
        kt.add(1);
        //    System.out.println(kt.size());
        //    System.out.println(kt);

        kt.remove(1);
        //  kt.
        //      System.out.println(kt.size());
        //      System.out.println(kt);
    }


    public int majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return nums[n / 2];
    }

    public int countKDifference(int[] nums, int k) {
        int len = nums.length;
        int count = 0;
        for (int i = 0; i <= len - 2; i++) {
            for (int j = i + 1; j <= len - 1; j++) {
                int d = Math.abs(nums[i] - nums[j]);
                if (d == k) {
                    count = count + 1;
                }
            }
        }
        return count;
    }

    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int maxdiff = -1;
        for (int i = 0; i <= n - 2; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                int diff = nums[j] - nums[i];
                if (diff > 0) {
                    if (diff > maxdiff) {
                        maxdiff = diff;
                    }
                }
            }
        }
        return maxdiff;


    }

    public int climbStairs(int n) {
        int[] a = new int[n + 1];
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        for (int i = 3; i <= n; i++) {
            a[i] = a[i - 2] + a[i - 1];
        }
        return a[n];
    }

    public boolean areNumbersAscending(String s) {
        int preint = -1;
        int curint = 0;
        int i = 0;
        while (i < s.length()) {
            if (Character.isDigit(s.charAt(i))) {
                int j = i;
                while (j < s.length() && Character.isDigit(s.charAt(j))) {
                    curint = curint * 10 + (s.charAt(j) - '0');
                    j++;
                }

                if (curint <= preint) {
                    return false;
                } else {
                    preint = curint;
                }
                i = j;
            } else {
                i++;
            }
        }
        return true;
    }

    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String p : patterns) {
            if (word.indexOf(p) > -1) {
                count = count + 1;
            }
        }
        return count;
    }

    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> ga = new HashMap<Character, Integer>();
        for (Character c : s.toCharArray()) {
            if (ga.containsKey(c)) {
                int v = ga.get(c);
                v++;
                ga.put(c, v);
            } else {
                ga.put(c, 1);
            }
        }
        int pre = 0;
        for (Integer cur : ga.values()) {
            if (pre == 0) {
                pre = cur;
            } else {
                if (pre != cur) {
                    return false;
                }
            }
        }
        return true;
    }

    public List<String> commonChars(String[] words) {
        HashMap<Character, Integer> base = new HashMap<>();
        for (char e : words[0].toCharArray()) {
            base.put(e, base.getOrDefault(e, 0) + 1);
        }
        for (int i = 1; i < words.length; i++) {
            HashMap<Character, Integer> next = new HashMap<>();
            for (char ele : words[i].toCharArray()) {
                next.put(ele, next.getOrDefault(ele, 0) + 1);
            }
            for (char k : base.keySet()) {
                int min = Math.min(base.getOrDefault(k, 0), next.getOrDefault(k, 0));
                base.put(k, min);
            }
        }
        ArrayList<String> al = new ArrayList<String>();
        for (char ele : base.keySet()) {
            for (int k = 0; k < base.get(ele); k++) {
                al.add(Character.toString(ele));
            }
        }
        return al;
    }

    public boolean isAnagram(String s, String t) {
        char[] sisi = s.toCharArray();
        char[] titi = t.toCharArray();
        if (sisi.length != titi.length) {
            return false;
        } else {
            Arrays.sort(sisi);
            Arrays.sort(titi);
            for (int i = 0; i < sisi.length; i++) {
                if (sisi[i] != titi[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int i = 0;
        int sum = 0;
        while (i < seats.length) {
            int x = Math.abs(seats[i] - students[i]);
            i++;
            sum = sum + x;
        }
        return sum;
    }

    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        HashSet<Integer> s3 = new HashSet<>();
        for (int i : nums1) {
            s1.add(i);
        }
        for (int i : nums2) {
            s2.add(i);
        }
        for (int i : nums3) {
            s3.add(i);
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int e : s1) {
            if (map.containsKey(e)) {
                int pre = map.get(e) + 1;
                map.put(e, pre);
            } else {
                map.put(e, 1);
            }
        }
        for (int e : s2) {
            if (map.containsKey(e)) {
                int pre = map.get(e) + 1;
                map.put(e, pre);
            } else {
                map.put(e, 1);
            }
        }
        for (int e : s3) {
            if (map.containsKey(e)) {
                int pre = map.get(e) + 1;
                map.put(e, pre);
            } else {
                map.put(e, 1);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int e : map.keySet()) {
            int v = map.get(e);
            if (v >= 2) {
                result.add(e);
            }
        }
        return result;
    }

//    public boolean isValid(String s) {
//        int counta = 0;
//        int countb = 0;
//        int countc = 0;
//        for (char e : s.toCharArray()) {
//            if (e == '(') {
//                counta++;
//            }
//            if (e == ')') {
//                counta--;
//                if (countb > 0 || countc > 0) {
//                    if (counta > 0) return false;
//                }
//            }
//
//            if (e == '[') {
//                countb++;
//            }
//            if (e == ']') {
//                countb--;
//                if (counta > 0 || countc > 0) {
//                    if (countb > 0) return false;
//                }
//            }
//            if (e == '{') {
//                countc++;
//            }
//            if (e == '}') {
//                countc--;
//                if (counta > 0 || countb > 0) {
//                    if (countc > 0) return false;
//                }
//            }
//            if (counta < 0 || countb < 0 || countc < 0) {
//                return false;
//            }
//        }
//        if (counta == 0 && countb == 0 && countc == 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character e : s.toCharArray()) {
            if (e == '(' || e == '[' || e == '{') {
                stack.push(e);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (e == ')') {
                    if (stack.peek() != '(') {
                        return false;
                    }
                }
                if (e == ']') {
                    if (stack.peek() != '[') {
                        return false;
                    }
                }
                if (e == '}') {
                    if (stack.peek() != '{') {
                        return false;
                    }
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

}


class MyQueue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public MyQueue() {
    }

    public void push(int x) {
        s1.push(x);

    }

    public int pop() {
        peek();
        return s2.pop();
    }

    public int peek() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                int t = s1.pop();
                s2.push(t);
            }
        }
        return s2.peek();
    }


    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}

////class Solution {
//    public int maxProfit(int[] prices) {
//        int n = prices.length;
//        int[] rightmax = new int[n];
//        rightmax[n - 1] = prices[n - 1];
//        int max = 0;
//        for (int i = n - 2; i >= 0; i--) {
//            rightmax[i] = Math.max(rightmax[i + 1], prices[i]);
//            int profit = rightmax[i + 1] - prices[i];
//            if (profit > 0 && profit > max) {
//                max = profit;
//            }
//        }
//        return max;
//    }
//}

//

////class Solution {
//    public int smallestEqual(int[] nums) {
//        for (int i = 0; i <= nums.length - 1; i++) {
//            if (i % 10 == nums[i]) {
//                return i;
//            }
//        }
//        return -1;
//    }
//}

//class Solution {
//    public String kthDistinct(String[] arr, int k) {
//        HashMap<String, Integer> count = new HashMap<>();
//        for (String st :
//                arr) {
//            if (count.containsKey(st)) {
//                int times = count.get(st) + 1;
//                count.put(st, times);
//            } else {
//                count.put(st, 1);
//            }
//        }
//        int c=0;
//        for (String st :
//                arr) {
//            if (count.get(st) == 1) {
//                c++;
//                if (k == c) {
//                    return st;
//                }
//            }
//        }
//        return "";
//
//    }
//}

//class Solution {
//    public int finalValueAfterOperations(String[] operations) {
//        int X = 0;
//        for (String e :
//                operations) {
//            if (e.equals("++X")|| e.equals("X++")) {
//                X++;
//            } else X--;
//        }
//        return X;
//    }
//}

//class Solution {
//    public String reversePrefix(String word, char ch) {
//        int x = -1;
//        for (int i = 0; i <= word.length() - 1; i++) {
//            if (word.charAt(i) == ch) {
//                x = i;
//                break;
//            }
//        }
//        if (x == -1) {
//            return word;
//        }
//        StringBuilder sb = new StringBuilder();
//        for (int i = x; i >= 0; i--) {
//            sb.append(word.charAt(i));
//        }
//        return sb.toString() + word.substring(x+1, word.length());
//    }
//}

//class Solution {
//    public int findGCD(int[] nums) {
//        Arrays.sort(nums);
//        int max = nums[nums.length - 1];
//        int min = nums[0];
//        if (max == min)
//            return max;
//        while (max != 0) {
//            int temp = min;
//            min = max;
//            max = temp % max;
//        }
//        return min;
//    }
//}

//class Solution {
//    public int[] getConcatenation(int[] nums) {
//        int n = nums.length;
//        int[] ans = new int[2 * n];
//        for (int i = 0; i < 2 * n; i++) {
//            if (i < n) {
//                ans[i] = nums[i];
//            } else
//                ans[i] = nums[i + n];
//        }
//        return ans;
//
//    }
//}

//

//

//class Solution {
//    public int minimumDifference(int[] nums, int k) {
//        if (k == 1) {
//            return 0;
//        }
//        Arrays.sort(nums);
//        int min = 1000001;
//        for (int i = k - 1; i < nums.length; i++) {
//            int diff = nums[i] - nums[i - k + 1];
//            min = Math.min(diff, min);
//        }
//        return min;
//    }
//}

//class Solution {
//    public int countQuadruplets(int[] nums) {
//        int n = nums.length;
//        int count = 0;
//        for (int a = 0; a <= n - 4; a++) {
//            for (int b = a + 1; b <= n - 3; b++) {
//                for (int c = b + 1; c <= n - 2; c++) {
//                    for (int d = c + 1; d <= n - 1; d++) {
//                        if (nums[a] + nums[b] + nums[c] == nums[d]) {
//                            count = count + 1;
//                        }
//                    }
//                }
//            }
//        }
//        return count;
//    }
//}

//class Solution {
//    public String makeFancyString(String s) {
//        int n = s.length();
//        int i = 0;
//        StringBuilder sb = new StringBuilder();
//        while (i < n) {
//            int j = i;
//            while (j<n && s.charAt(j) == s.charAt(i) ) {
//                j++;
//            }
//
//            int len = j - i;
//            if (len > 2) {
//                sb.append(s.substring(i, i + 2));
//            } else {
//                sb.append(s.substring(i, j));
//            }
//            i = j;
//
//        }
//        return sb.toString();
//    }
//}

//class Solution {
//    public boolean isPrefixString(String s, String[] words) {
//        int i = 0;
//        int j = 0;
//        while (i < s.length() && j < words.length) {
//            if (s.startsWith(words[j], i)) {
//                i = i + words[j].length();
//                j++;
//            } else
//                return false;
//        }
//        return i == s.length();
//    }
//}

//class Solution {
//    public int countTriples(int n) {
//        int[] square = new int[n + 1];
//
//        for (int i = 0; i <= n; i++) {
//            square[i] = i * i;
//        }
//        int count = 0;
//        for (int i = 3; i < n + 1; i++) {
//            int c = square[i];
//            int left = 1;
//            int right = i - 1;
//
//            while (left < right) {
//                if (square[left] + right == c) {
//                    count = count + 1;
//                    left++;
//                    right--;
//                } else if (left + right < c) {
//                    left = left + 1;
//                } else if (left + right > c) {
//                    right = right - 1;
//                }
//            }
//
//        }
//        return count * 2;
//
//    }
//
//}

//class Solution {
//    public int countVowelSubstrings(String word) {
//        int count = 0;
//        for (int i = 0; i < word.length(); i++) {
//            if (word.charAt(i) == 'a' ||
//                    word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
//                HashSet<Character> set = new HashSet<Character>();
//                for (int j = i; j < word.length(); j++) {
//                    if (word.charAt(j) == 'a' ||
//                            word.charAt(j) == 'e' || word.charAt(j) == 'i' || word.charAt(j) == 'o' || word.charAt(j) == 'u') {
//                        set.add(word.charAt(j));
//                        if (set.size() == 5) {
//                            count = count + 1;
//                        }
//                    } else {
//                        break;
//                    }
//                }
//
//            }
//
//        }
//        return count;
//
//    }

//e
//        "abc def ghf"
//
//        "abc"
//        "def"
//}

//class Solution {
//    public int canBeTypedWords(String text, String brokenLetters) {
//        HashSet<Character> bl = new HashSet<>();
//        for (Character letter :
//                brokenLetters.toCharArray()) {
//            bl.add(letter);
//        }
//        int count = 0;
//        String[] arr = text.split(" ");
//        for (String word :
//                arr) {
//            int x = 1;
//            for (Character letter :
//                    word.toCharArray()) {
//                if (bl.contains(letter)) {
//                    x = 0;
//                    break;
//                }
//
//            }
//            count = count + x;
//        }
//        return count;
//    }
//}

//class Solution {
//    public int maxProductDifference(int[] nums) {
//        Arrays.sort(nums);
//        int n = nums.length;
//        int difference = nums[n - 1] * nums[n - 2] - nums[0] * nums[1];
//        return difference;
//    }
//}

//class Solution {
//    public boolean canBeIncreasing(int[] nums) {
//        int n = nums.length;
//        if (n == 2)
//            return true;
//
//        int k = 1;
//        while (k < n - 1 && nums[k] < nums[k + 1]) k +;
//        if (k == n - 1) return true;
//
//
//        for (int i = 1; i < n - 1; i++) {
//            int j = 0;
//            while (j < i - 1) {
//                if (nums[j] < nums[j + 1]) {
//                    j++;
//                } else {
//                    break;
//                }
//
//            }
//            if (j == i - 1) {
//                j = i + 1;
//                while (j < n - 1) {
//                    if (nums[j + 1] > nums[j]) {
//                        j++;
//                    } else break;
//
//                }
//
//            }
//            if (i > 0 && i < n - 1 && nums[i + 1] > nums[i - 1] && j == n - 1) {
//                return true;
//            }
//
//        }
//
//        return false;
//    }
//}

//class Solution {
//    public boolean checkAlmostEquivalent(String word1, String word2) {
//        HashMap<Character, Integer> h1 = new HashMap<>();
//        for (int i = 0; i < word1.length(); i++) {
//
//            if (h1.containsKey(word1.charAt(i))) {
//                int v1 = h1.get(word1.charAt(i)) + 1;
//                h1.put(word1.charAt(i), v1);
//
//            } else {
//                h1.put(word1.charAt(i), 1);
//
//            }
//
//        }
//        for (int i = 0; i < word2.length(); i++) {
//
//            if (h1.containsKey(word2.charAt(i))) {
//                int v2 = h1.get(word2.charAt(i)) - 1;
//                h1.put(word2.charAt(i), v2);
//
//            } else {
//                h1.put(word2.charAt(i), -1);
//            }
//
//        }
//        for (Character c :
//                h1.keySet()) {
//            if (Math.abs(h1.get(c)) >= 3) {
//                return false;
//            }
//        }
//        return true;
//
//    }
//}

//class Solution {
//    public boolean checkAlmostEquivalent(String word1, String word2) {
//
//        int[] arr = new int[26];
//        for (int i = 0; i < word1.length(); i++) {
//            char currentc1 = word1.charAt(i);
//            int position1 = currentc1 - 'a';
//            arr[position1] = arr[position1] + 1;
//        }
//        for (int i = 0; i < word2.length(); i++) {
//            char currentc2 = word2.charAt(i);
//            int position2 = currentc2 - 'a';
//            arr[position2] = arr[position2] - 1;
//            if (arr[position2]<-3){
//                return false;
//            }
//        }
//        for (Integer diff :
//                arr) {
//            if (Math.abs(diff) > 3) {
//                return false;
//            }
//
//        }
//        return true;
//
//    }
//}

//class Solution {
//    public String largestOddNumber(String num) {
//        int n = num.length();
//        for (int i = n - 1; i >= 0; i--) {
//            char c = num.charAt(i);
//            int x = c - '0';
//            if (x % 2 != 0) {
//                return num.substring(0, i + 1);
//
//            }
//
//        }
//        return "";
//
//    }
//}

//class Solution {
//    public boolean makeEqual(String[] words) {
//        HashMap<Character, Integer> arrcha = new HashMap<>();
//        for (String s :
//                words) {
//            for (Character c :
//                    s.toCharArray()) {
//                if (arrcha.containsKey(c)) {
//                    int v = arrcha.get(c) + 1;
//                    arrcha.put(c, v);
//                } else
//                    arrcha.put(c, 1);
//            }
//        }
//        for (Character c :
//                arrcha.keySet()) {
//            int times = arrcha.get(c);
//            if (times % words.length != 0) {
//                return false;
//            }
//
//        }
//        return true;
//
//    }
//}
//

//class Solution {
//    public String sortSentence(String s) {
//        String[] arr = s.split(" ");
//        HashMap<Integer, String> hm = new HashMap<>();
//        for (String word :
//                arr) {
//            char lastchar = word.charAt(word.length() - 1);
//            int order = lastchar - '0';
//            hm.put(order, word.substring(0, word.length() - 1));
//        }
//
//        StringBuilder sb = new StringBuilder();
//        for (int i = 1; i <= arr.length; i++) {
//            sb.append(hm.get(i));
//            if (i < arr.length) {
//                sb.append(" ");
//            }
//
//        }
//        return sb.toString();
//
//    }
//}

//class Solution {
//    public int countGoodSubstrings(String s) {
//        if (s.length() <= 2)
//            return 0;
//        int count = s.length() - 2;
//        for (int i = 0; i <= s.length() - 3; i++) {
//            if (s.charAt(i) == s.charAt(i + 1) || s.charAt(i) == s.charAt(i + 2) || s.charAt(i + 1) == s.charAt(i + 2)) {
//                count--;
//            }
//
//        }
//        return count;
//
//    }
//}

//class Solution {
//    public String replaceDigits(String s) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < s.length(); i++) {
//            if (Character.isDigit(s.charAt(i))) {
//                char prev = s.charAt(i - 1);
//                int add = s.charAt(i) - '0';
//                char app = (char) (prev + add);
//                sb.append(app);
//
//            } else
//                sb.append(s.charAt(i));
//
//        }
//
//        return sb.toString();
//
//    }
//}

//class Solution {
//    public int maxDistance(int[] colors) {
//        int result = 0;
//        for (int i = 0; i < colors.length - 1; i++) {
//            for (int j = i + 1; j < colors.length; j++) {
//                if (colors[j] != colors[i]) {
//                    result = Math.max(result, j - i);
//                }
//
//            }
//
//        }
//        return result;
//
//    }
//}

//class Solution {
//    public int wateringPlants(int[] plants, int capacity) {
//        int result = 1;
//        int leftwater = capacity - plants[0];
//        for (int i = 0; i < plants.length - 1; i++) {
//            if (leftwater >= plants[i + 1]) {
//                result++;
//                leftwater = leftwater - plants[i + 1];
//            } else {
//                result = result + i + 1 + i + 2;
//                leftwater = capacity - plants[i + 1];
//            }
//
//        }
//        return result;
//
//    }
//}

//class Solution {
//    public boolean checkIfPangram(String sentence) {
//        if (sentence.length() < 26)
//            return false;
//        HashSet<Character> hs = new HashSet<>();
//        for (Character c :
//                sentence.toCharArray()) {
//            hs.add(c);
//            if (hs.size() == 26) {
//                return true;
//            }
//
//        }
//        return false;
//
//    }
//}

//class Solution {
//    public String truncateSentence(String s, int k) {
//
//        String[] arr = s.split(" ");
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < k; i++) {
//            if (i == k - 1)
//                sb.append(arr[i]);
//            else {
//                sb.append(arr[i] + " ");
//
//            }
//
//        }
//        return sb.toString();
//    }
//}

//class Solution {
//    public int minOperations(int[] nums) {
//        if (nums.length == 1) {
//            return 0;
//        }
//        int result = 0;
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (nums[i + 1] <= nums[i]) {
//                result = result + nums[i] - nums[i + 1] + 1;
//                nums[i + 1] = nums[i] + 1;
//            }
//        }
//        return result;
//
//    }
//}

//class Solution {
//    public int numberOfMatches(int n) {
//        return (n-1);
//    }
//}

//class Solution {
//    public List<Integer> targetIndices(int[] nums, int target) {
//        Arrays.sort(nums);
//        ArrayList<Integer> result = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == target) {
//                result.add(i);
//            }
//        }
//        return result;
//    }
//}

//class Solution {
//    public int countWords(String[] words1, String[] words2) {
//        HashMap<String, Integer> hs1 = new HashMap<>();
//        HashMap<String, Integer> hs2 = new HashMap<>();
//        for (int i = 0; i < words1.length; i++) {
//            if (hs1.containsKey(words1[i])) {
//                int value1 = hs1.get(words1[i]) + 1;
//                hs1.put(words1[i], value1);
//            } else {
//                hs1.put(words1[i], 1);
//            }
//        }
//        for (int i = 0; i < words2.length; i++) {
//            if (hs2.containsKey(words2[i])) {
//                int value2 = hs2.get(words2[i]) + 1;
//                hs2.put(words2[i], value2);
//            } else {
//                hs2.put(words2[i], 1);
//            }
//        }
//        int result = 0;
//        for (String s :
//                hs1.keySet()) {
//            if (hs1.get(s) == 1) {
//                if (hs2.containsKey(s) && hs2.get(s) == 1) {
//                    result = result + 1;
//                }
//            }
//        }
//        return result;
//    }
//}

//class Solution {
//    public int maxAscendingSum(int[] nums) {
//        int maxsum = 0;
//        int i = 0;
//        while (i < nums.length) {
//            int j = i + 1;
//            int sum = nums[i];
//            while (j < nums.length && nums[j] > nums[j - 1]) {
//                sum = sum + nums[j];
//                j++;
//            }
//            i = j;
//            maxsum = Math.max(maxsum, sum);
//        }
//        return maxsum;
//    }
//
//}

//class Solution {
//    public String mergeAlternately(String word1, String word2) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < Math.max(word1.length(), word2.length()); i++) {
//            if (i < word1.length()) {
//                sb.append(word1.charAt(i));
//            }
//            if (i < word2.length()) {
//                sb.append(word2.charAt(i));
//            }
//        }
//        return sb.toString();
//    }
//}

//class Solution {
//    public int sumOfUnique(int[] nums) {
//        HashMap<Integer, Integer> hm = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (hm.containsKey(nums[i])) {
//                int value = hm.get(nums[i]) + 1;
//                hm.put(nums[i], value);
//            } else {
//                hm.put(nums[i], 1);
//            }
//        }
//        int sum = 0;
//        for (Integer number :
//                hm.keySet()) {
//            if (hm.get(number) == 1) {
//                sum = sum + number;
//            }
//
//        }
//        return sum;
//
//    }
//}

class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int max = 0;
        for (int i = 0; i < gain.length; i++) {
            altitude = altitude + gain[i];
            max = Math.max(altitude, max);
        }
        return max;

    }
}
