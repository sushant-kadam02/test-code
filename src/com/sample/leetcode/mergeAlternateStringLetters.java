package com.sample.leetcode;

public class mergeAlternateStringLetters {

    public static void main(String[] args) {
        String str1 = "AAA", str2 = "BBB";
        String result = mergeAlternative(str1, str2);
        System.out.println("output : "+result);

    }


    private static String mergeAlternative(String str1, String str2) {
        StringBuffer sb = new StringBuffer();
        int i = 0;
        while (i < str1.length() || i < str2.length()) {
            if (i < str1.length()) {
                sb.append(str1.charAt(i));
            }
            if (i < str2.length()) {
                sb.append(str2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }

}
