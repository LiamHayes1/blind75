package twopoints;

public class ValidPalindrome {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        String cleanS = "";
        for (char ch : s.toCharArray())
            if (Character.isLetterOrDigit(ch)) cleanS = cleanS + Character.toLowerCase(ch);

        int left = 0, right = cleanS.length() - 1;

        while (left < right) {
            if (cleanS.charAt(left++) != cleanS.charAt(right--)) return false;
        }

        return true;
    }
}
