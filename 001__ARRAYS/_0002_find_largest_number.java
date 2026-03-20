//Find the Largest Number in an Array

import java.util.*;
public class _0002_find_largest_number {

    public static int largest(int arr[]){
        int largest=Integer.MIN_VALUE;   //-infinity

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
public static void main(String args[]){
int arr[]={3,1,7,4,9,24};
System.out.println(largest(arr));
}
}
