package Methods;

public class Recursion {

    public static void main(String[] args) {

        int result = sum(20);
        System.out.println(result);
    }
/*
20+[sum(20-1)]
20 + ( 19 + ( 18 + sum(7) ) )
20 + ( 19 + ( 18 + (17+ sum(16) ) ) )
...
...
20 + ( 19 + ( 18 + (17+ sum(16) ) )... (1+ sum(0))
 */
    public static int sum(int k){
        if(k>0){
            return k+sum(k-1);
        }else {
            return 0;
        }
    }

}
