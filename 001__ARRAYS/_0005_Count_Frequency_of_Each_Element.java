//Count Frequency of Each Element

import java.util.HashMap;

public class _0005_Count_Frequency_of_Each_Element {

public static HashMap<Integer,Integer> countFreq(int arr[]){
    HashMap<Integer, Integer>map=new HashMap<>();
    for(int num : arr){
       
        if(map.containsKey(num)){
            map.put(num,map.get(num) + 1);
        }else{
             map.put(num,1);
        }
       
    }
    return map;
}
public static void main(String args[]){
int arr[]={1,1,2,1,5,5,1};
System.out.println(countFreq(arr));


}     
}
