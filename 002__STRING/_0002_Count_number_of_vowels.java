// Input: string str=”Take u forward is Awesome”
// Output: 
// Vowels: 10
// Consonants: 11
// White spaces: 4


// Example 2:
// Input: string str=”India won the cricket match”
// Output:
// Vowels: 8
// Consonants: 15
// White spaces: 4


public class _0002_Count_number_of_vowels {
public static void main(String args[]){
    String s="Take u forward is Awesome";

    //convert all character in lowercase
    s=s.toLowerCase();

    int vowel=0;
    int consonants=0;
    int spaces=0;

    for(int i=0;i<s.length();i++){
       char ch=s.charAt(i);

       if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
        vowel++;
       }else if(ch>='a' && ch<='z'){
        consonants++;
       }else if(ch==' '){
        spaces++;
       }
    }
    System.out.println("vowel: "+vowel+" "+"consonant: "+consonants+" "+"spaces"+" "+spaces);
}   
}
