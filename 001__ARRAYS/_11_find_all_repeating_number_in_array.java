// Problem Statement: Find all the repeating elements present in an array.
// Arr[] = [1,1,2,3,4,4,5,2]
// Output: 1,2,4
// Explanation: 1,2 and 4 are the elements which are occurring more than once.


import java.util.*;
public class _11_find_all_repeating_number_in_array {

    public static int[] allRepeatingEle(int arr[]){
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int num:arr){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }

        //store repeating element
        ArrayList<Integer>repeat=new ArrayList<>();


        // map.keySet() → returns all keys of the map
        // map.put(1, "A");
        // map.put(2, "B");
        // map.put(3, "C");
        // System.out.println(map.keySet()); [1, 2, 3]

        // map.get(key) → returns the value associated with the key
        // map.get(1) --> A

        for(int key : map.keySet()){
           if(map.get(key)>2){
            repeat.add(key);
           } 
        }


        //in java to find length of any collection use .size() method.
        int result[]=new int[repeat.size()];
        for(int i=0;i<repeat.size();i++){
           result[i]=repeat.get(i);
        }
        
        return result;     
}
public static void main(String args[]){
   int arr[]={1,1,2,3,4,4,5,2}; 
   int result[]=allRepeatingEle(arr);

   System.out.println(Arrays.toString(result)); // [1, 2, 4]
}     
}
