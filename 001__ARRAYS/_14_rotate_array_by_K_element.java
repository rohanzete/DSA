// Rotate array by K elements
// Problem Statement: Given an array of integers, rotating array of elements by k elements either left or right
// Input : nums = [1, 2, 3, 4, 5, 6, 7], k = 2, right
// Output : [6, 7, 1, 2, 3, 4, 5]

// Input : nums = [1, 2, 3, 4, 5, 6], k=2, left
// Output : [3, 4, 5, 6, 1, 2]


import java.util.*;
public class _14_rotate_array_by_K_element {

    public static void reverse(int arr[], int start, int end){
         while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
         }   
    }

    public static void rightRotate(int arr[],int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-1); //reverse entire array
        reverse(arr,0,k-1); //reverse 1st half
        reverse(arr,k,n-1); //revese remaining half
         
    }

    public static void leftRotate(int arr[],int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,k-1); //reverse 0 to k-1
        reverse(arr,k,n-1); //reverse k to end
        reverse(arr,0,n-1); //revese entire

         
    }
public static void main(String args[]){
int arr[]={1,2,3,4,5,6,7};
int k=2;
//rightRotate(arr,k);
//leftRotate(arr,k);
System.out.println(Arrays.toString(arr)); 

}     
}
