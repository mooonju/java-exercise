package day3.collection.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadFile {

    public char printDirFiles(String filepath) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(filepath), 16*1024);
        return (char)br.read();
    }

    public static void main(String[] args) throws IOException{
        ReadFile readFile = new ReadFile();
        char c1 = readFile.printDirFiles("./a_file.txt");
        System.out.println(c1);

    }
}
