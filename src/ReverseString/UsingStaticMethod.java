package ReverseString;

public class UsingStaticMethod {
    public String reverse(String s){
        String rev= "";
        for(int i=s.length(); i>0; --i){
            rev = rev+(s.charAt(i-1));
        }
        return rev;
    }
}
