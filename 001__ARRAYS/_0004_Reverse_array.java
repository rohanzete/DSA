//reverse array

/*


char[] arr = {'H', 'e', 'l', 'l', 'o'};
String str = new String(arr);   THIS ONLY WORK FOR CHAR ARRAY NOT FOR INT ARRAY



TO CONVERT INT ARRAY TO STRING 
//METHODD 2
int[] arr = {1, 2, 3, 4};
String str = Arrays.toString(arr);  //Useful for printing arrays directly
//METHOD 2
USING STRINGBUILDER




 String str = "456";
int num = Integer.parseInt(str);
System.out.println(num + 10); // 466




*/



import java.util.*;
public class _0004_Reverse_array {
public static void main(String args[]){

int arr[]={1,2,3,4};

//method 1

int start=0;
int end=arr.length-1;

while(start<end){
    int temp=arr[end];
    arr[end]=arr[start];
    arr[start]=temp;
    start++;
    end--;
}
System.out.println(Arrays.toString(arr));





// //method 2

// StringBuilder sb=new StringBuilder();
// for(int num : arr){
//     sb.append(num);
    
// }

// System.out.println(sb);//1234
// sb.reverse();
// String s= sb.toString();//stringbuilder ko string me convert karata haiii 
// System.out.println(s);


// //not succed



}     
}
