package JavaFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFiles {

    public static void main(String[] args) {
        try{
            File myFile = new File("src/JavaFiles/new_file.txt");
            Scanner myReaderScanner = new Scanner(myFile);

            while (myReaderScanner.hasNextLine()){
                String result = myReaderScanner.nextLine();
                System.out.println(result);
            }
            myReaderScanner.close();

        }catch (FileNotFoundException e){

            System.out.println("Something went wrong!");
            e.printStackTrace();

        }


    }
}
