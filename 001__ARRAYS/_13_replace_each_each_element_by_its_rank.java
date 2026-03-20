// Problem Statement: Given an array of N integers, the task is to replace each element of the array by its rank in the array.
// Input:  20 15 26 2 98 6
// Output: 4  3  5  1 6  2
// Explanation: When sorted,the array is 2,6,15,20,26,98. So the rank of 2 is 1,rank of 6 is 2,rank of 15 is 3 and so.



import java.util.*;
public class _13_replace_each_each_element_by_its_rank {
public static void main(String args[]){
int arr[]={20,15,26,2,98,6};

int temp[]=arr.clone();//it copies array
Arrays.sort(temp);

HashMap<Integer,Integer>map=new HashMap<>();

int rank=1;
for(int num:temp){
   if(!map.containsKey(num)){
      map.put(num,rank++);
   } 
}

for(int i=0;i<arr.length;i++){
    arr[i]=map.get(arr[i]);
}
System.out.println(Arrays.toString(arr));// [4, 3, 5, 1, 6, 2]
}   
}
