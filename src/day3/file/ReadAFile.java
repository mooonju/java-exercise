package day3.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadAFile {
    public void printDirFiles(String filename) {
        File dir = new File(filename);
        File files[] = dir.listFiles();

        for (File file : files) {
            System.out.println(file);
        }
    }

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("./a_file.txt");
        char ch = (char) fileReader.read();
        System.out.println(ch);

    }
}
