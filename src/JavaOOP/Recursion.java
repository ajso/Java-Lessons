package JavaOOP;

public class Recursion {
    static int sum(int k){
        if(k>0){
            return k+sum(k-1);
        }else{
            return 0;
        }
    }
}
