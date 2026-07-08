package com.sample.leetcode;

public class SwapVowels {

    public static void main(String[] args) {

        String sample = "Sushant";

        char ch[] = sample.toCharArray();

        int left = 0, right = sample.length()-1;
        int i = 0;
        while (left < right) {
            System.out.println("Iteration : "+ i++);
            if (left < right && !isVowelCheck(ch[left])) {
                System.out.println("ch[left] : "+ch[left]);
                left++;
            }
            if (left < right && !isVowelCheck(ch[right])) {
                System.out.println("ch[right] : "+ch[right]);
                right--;
            }
            if(isVowelCheck(ch[left]) && isVowelCheck(ch[right])) {
                System.out.println("ch[left]: "+ch[left]+" ch[right]: "+ch[right]);
                char tmp = ch[left];
                ch[left] = ch[right];
                ch[right] = tmp;
                left++;
                right--;
            }
        }
        System.out.println("output : "+ String.valueOf(ch));

    }

    private static boolean isVowelCheck(char ch) {
        String vowels = "aeiouAEIOU";
        if (vowels.indexOf(ch) != -1)
            return true;
        else
            return false;
    }


}
