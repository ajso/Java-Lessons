package JavaLambdas;

public class LambdaParam {

    public static void main(String[] args) {

        StringFunction exclaim = (s) -> s +"!";
        StringFunction qn = (s) -> {
            String qnString = (s+ "?");
            return qnString;
        };

        printString("Hi There", exclaim );
//        printString("What are you having for breakfast", qn);
        printString("How old are you", qn);
    }

    static void printString(String string, StringFunction sfunc){
        String results = sfunc.run(string);
        System.out.println(results);
    }
}
