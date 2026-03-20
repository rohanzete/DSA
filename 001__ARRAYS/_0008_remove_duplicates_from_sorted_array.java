// Input: arr[]=[1,1,2,2,2,3,3]  ---> sorted in non decreasing order
// Output: [1,2,3,_,_,_,_]

// Input: arr[]=[1,1,1,2,2,3,3,3,3,4,4]
// Output: [1,2,3,4,_,_,_,_,_,_,_]


import java.util.*;
public class _0008_remove_duplicates_from_sorted_array {
    public static void removeDuplicates(int arr[]){
        
        int unique=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[unique]){
                unique++;
                arr[unique]=arr[i];
            }
        }
        unique++;
        for(int i=unique;i<arr.length;i++){
            arr[i]=0;
        }

    }
public static void main(String args[]){

//int arr[]={1,1,2,2,2,3,3};
int arr[]={1,1,1,2,2,3,3,3,3,4,4};

removeDuplicates(arr);
System.out.println(Arrays.toString(arr));

}     
}
