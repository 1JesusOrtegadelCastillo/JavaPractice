package other;

public class NumberPalindrome {
    public boolean isPalindrome(int x) {
        String number = Integer.toString(x);
        int numberLength = number.length();

        for(int i = 0; i < numberLength/2 ; i++){
            if(number.charAt(i) != number.charAt(numberLength-(i+1)))
            {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindromeStrBuffer(int x) {
        int temp = x;
        String str1 = String.valueOf(temp);
        StringBuffer str2 = new StringBuffer(str1);
        String str3 = new String(str2.reverse());
        return str1.equals(str3);
    }

}
