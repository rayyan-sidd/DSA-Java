package DSA.Strings;

public class Palindrome {
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str){

        for(int i=0; i<str.length()/2; i++){
            if(str == null || str.length() == 0){
                return true; //or false as per the interviewer's need.
            }
            char start = str.charAt(i);
            char end = str.charAt(str.length() - i - 1);
            if(start != end){
                return false;
            }
        }
        return true;

    }
}
