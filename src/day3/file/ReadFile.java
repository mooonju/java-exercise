package day3.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadFile {

    public void printOneLetter(String filename) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(filename), 16*1024);
        char ch = (char)br.read();
        System.out.println(ch);
    }

    public void printTwoLetter(String filename) throws IOException{
        FileReader fr = new FileReader(filename);
        String str = "";
        for(int i=0; i<2; i++){
            str += (char) fr.read();

        }
        System.out.println(str);
    }

    public static void main(String[] args) throws IOException{
        ReadFile readFile = new ReadFile();
        readFile.printOneLetter("./a_file.txt");
        readFile.printTwoLetter("./a_file.txt");

    }
}
