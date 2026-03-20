// Problem Statement: Given an unsorted array, find the median of the given array.

// Median = middle value after sorting

// 1. If number of elements is ODD : 👉 Middle element is median
// 2. If number of elements is EVEN : 👉 Median = average of two middle elements

//[1,2,3] med=2
//[1,2,3,4] med=(2+3)/2



import java.util.*;
public class _0007_find_median_of_array {
    public static void findMedian(int arr[]){
    //sort array fisrt 
    Arrays.sort(arr);
    
    int n=arr.length;
    if(n%2==1){//odd
       int mid=arr[n/2];
       System.out.println(mid);
    }else{//for even
       double mid=(arr[n/2]+arr[n/2]-1)/2.0;
       System.out.println(mid);
    }
    }
public static void main(String args[]){
//int arr[]={3,1,2};
int arr[]={3,1,4,2}; 
findMedian(arr);

}     
}
