//find factors of number

// Input: n = 6
// Output: [1, 2, 3, 6]  
// Explanation: 6 is divisible by 1,2,3,6.
// Input: n = 9
// Output: [1, 3, 9] 
// Explanation: 9 is divisible by 1,3,9.

import java.util.*;
public class _0005_find_factor_of_number {
public static void main(String args[]){

    LinkedHashSet<Integer>set=new LinkedHashSet<>();
    int num=9;
    for(int i=1;i<=num;i++){
        if(num % i ==0){
           set.add(i);  
        }
    }
    System.out.println(set);
}   
}
