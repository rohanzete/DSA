//Problem Statement: Rearrange a given array such that the first half is arranged in increasing order, and the second half is arranged in decreasing order
// Input: [8 7 1 6 5 9]
// Output: [1 5 6 9 8 7]


import java.util.*;
public class _0006_Rearrange_array_in_increasing_and_decreasing_order {
public static void incDecOrder(int arr[]){
//sort array
Arrays.sort(arr);
//mid find karke middle se end tak reverse karo.
int n=arr.length;
int mid=n/2;
int end=n-1;

while(mid<end){
    int temp=arr[end];
    arr[end]=arr[mid];
    arr[mid]=temp;
    mid++;
    end--;
}
    
}
public static void main(String args[]){
int arr[]={8,7,1,6,5,9};
incDecOrder(arr);
System.out.println(Arrays.toString(arr));
}      
}
