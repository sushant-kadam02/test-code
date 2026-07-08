package com.sample.leetcode;

public class IsSubSequence {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "pqarc";
        boolean flag = true;

        char ch[] = str1.toCharArray();
        int i = 0;
        while(i < ch.length -1 ) {
            if (str2.indexOf(ch[i]) == -1 ) {
                flag = false;
                break;
            }
            i++;
        }

        System.out.println("Is subsequence : "+flag);
    }
}
