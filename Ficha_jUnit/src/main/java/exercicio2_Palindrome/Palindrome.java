package exercicio2_Palindrome;

public class Palindrome {


    public static boolean isPalindrome(String str) {
        if (str == null  || str.isEmpty()) {
            return false;
        }
        String reversed = reverseString(str);
        return str.equalsIgnoreCase(reversed);
    }
    private static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }





}

