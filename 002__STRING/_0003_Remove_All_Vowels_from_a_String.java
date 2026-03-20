// Remove all vowels from string
// Input: str = “take u forward”
// Output: "tk  frwrd" 
// Explanation: All vowels are removed from the given String.


public class _0003_Remove_All_Vowels_from_a_String {
    public static void main(String args[]){
    String s="take u forward";

    s=s.toLowerCase();

    String output="";

    for(int i=0;i<s.length();i++){
        char ch =s.charAt(i);

        if(!(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u')){
           output=output+ch;
        }
    }

    System.out.println(output);
    }
}
