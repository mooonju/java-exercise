package day3.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExercise {
    public void printFiles(){
        File dir = new File("./");
        File files[] = dir.listFiles();
        System.out.println(files[0]);
        for(File file : files){
            System.out.println(file);
        }
        /*
            .\.git
            .\.git
            .\.gitignore
            .\.idea
            .\aa_file.txt
            .\a_file.txt
            .\java-init-project.iml
            .\out
            .\src
         */
    }

    public char readAChar(String filename) throws IOException{
        FileReader fileReader = new FileReader(filename);
        return  (char)fileReader.read();
    }

    public  String read2Chars(String filename) throws  IOException{
        FileReader fileReader = new FileReader(filename);
        String str = "";
        str += (char) fileReader.read();
        str += (char) fileReader.read();
        return str;

    }
    public static void main(String[] args) throws IOException {
        FileExercise fileExercise = new FileExercise();
        char c = fileExercise.readAChar("./aa_file.txt");
        String str = fileExercise.read2Chars("./aa_file.txt");
        System.out.println(c);
        System.out.println(str);
        /*
            1
        */
    }
}

