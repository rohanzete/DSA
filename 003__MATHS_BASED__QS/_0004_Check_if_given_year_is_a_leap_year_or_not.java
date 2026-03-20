//Check if given year is a leap year or not
// Input: 1996
// Output: Yes
// Explanation: Since 1996 is a leap year answer is “Yes”.

// Input: 2000
// Output: Yes
// Explanation: Since 2000 is a leap year answer is “Yes”.

//leap year : divisible by 400 or divisible by 4 but not by 100 


public class _0004_Check_if_given_year_is_a_leap_year_or_not {
public static void main(String args[]){
int year = 2026;
boolean isLeap=false;

if(year%400==0) isLeap=true;

if(year%4 == 0 && year%100 != 0) isLeap=true;

if(isLeap){
    System.out.println("leap");
}else{
        System.out.println("Not leap");
}


}  
}
