//check palindrome

public class _0001_check_palindrome {
    public static void main(String args[]){
        String s="madam";
        int start=0;
        int end=s.length()-1;
        boolean isPalindrome=true;

        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
               isPalindrome=false;
            }
            start++;
            end--;
        }

        if(isPalindrome){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }


    }
    
}
