package StringProg;

public class SwapVowels {

    public static void main(String[] args) {
        String s = "icecream";
        System.out.println(s);

        char[] ch = s.toCharArray();

        int left = 0;
        int right = ch.length - 1;

        while (left < right) {
            while (left < right && !isVowel(ch[left])) {
                left++;
            }

            while (left < right && !isVowel(ch[right])) {
                right--;
            }

            if(isVowel(ch[left]) && isVowel(ch[right])) {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }

        }
        System.out.println(ch);
    }

    private static boolean isVowel(char ch) {
        String vowels = "aeiouAEIOU";
        if (vowels.indexOf(ch) != -1) {
            return true;
        } else {
            return false;
        }

    }
}
