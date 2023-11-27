package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExClassFind {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Learning how to code java at w3schools");
        boolean found_match = matcher.find();
        if(found_match){
            System.out.println("Match Found..!");
        }else {
            System.out.println("Match not Found.");
        }
    }
}
