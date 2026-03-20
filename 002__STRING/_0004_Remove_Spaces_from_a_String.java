public class _0004_Remove_Spaces_from_a_String {
    public static void main(String args[]){
        String str="take U forward";
        String output="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                output=output+ch;
            }
        }
        System.out.println(output);
    }
    
}
