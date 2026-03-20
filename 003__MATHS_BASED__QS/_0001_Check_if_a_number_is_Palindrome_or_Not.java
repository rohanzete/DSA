// Check if a number is Palindrome or Not
// Problem Statement: Given an integer N, return true if it is a palindrome else return false.
// A palindrome is a number that reads the same backward as forward. For example, 121, 1331, and 4554 are palindromes because they remain the same when their digits are reversed.

// Input:N = 4554
// Output:Palindrome Number


public class _0001_Check_if_a_number_is_Palindrome_or_Not {
    public static boolean isPalindrome(int num){
        int number=0;
        int num1=num;
        while(num1>0){
            int digit=num1%10;
            number=number*10+digit;
            num1=num1 /10;
        }
        if(num==number){
            return true;
        }
        return false;
    }
public static void main(String args[]){
int num=4554;
if(isPalindrome(num)){
   System.out.println("palindrome");
}else{
   System.out.println("Not palindrome");
}
}
}


/*

public static void main(String args[]){
    
}

*/