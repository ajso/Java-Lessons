package JavaFiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) {

        try {
            File file = new File("src/JavaFiles/new_file.txt"); //creating a new file
            FileWriter fileWriter = new FileWriter("src/JavaFiles/new_file.txt"); //to write to a file
            fileWriter.write("This is the first text to write to a file.");
            fileWriter.close();
            System.out.println("Successfully Written to a file");

            if(file.createNewFile()){
                System.out.println("File is created" + file.getName());
            }else{
                System.out.println("File Already Exists");
            }
        }catch (IOException e){
            System.out.println("Ooops.! Something is wrong!");
            e.printStackTrace();

        }

    }
}
