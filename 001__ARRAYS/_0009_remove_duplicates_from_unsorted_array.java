// Input: arr[]={2,3,1,9,3,1,3,9}
// Output: {2,3,1,9}
// Input: arr[]={4,3,9,2,4,1,10,89,34}
// Output: {4,3,9,2,1,10,89,34}



import java.util.*;
public class _0009_remove_duplicates_from_unsorted_array {
    public static LinkedHashSet<Integer> removeDuplicates(int arr[]){
        //linkedhashset maintains insertion order
        //The elements will appear in the order they were added
        // 2 3 1   o/p --> [2,3,1]
        //duplicate element gets ignored

        // set.add(30);
        // set.add(10);
        // set.add(20);
        // set.add(10); // duplicate hai to skip kar dega add nhi karega
        // System.out.println(set);  // [30, 10, 20]

        LinkedHashSet<Integer>set=new LinkedHashSet<>();
        for(int num : arr){
            set.add(num);
        }
        return set;
    }
public static void main(String args[]){
int arr[]={2,3,1,9,3,1,3,9};
LinkedHashSet<Integer>result=removeDuplicates(arr);   
System.out.println(result);//[2, 3, 1, 9]
}     
}
