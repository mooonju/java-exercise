package day3.collection.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileExercise {
    public static void main(String[] args) throws FileNotFoundException {
        File dir = new File("./"); // 현재 디렉토리의 첫번째 파일명
        File files[] = dir.listFiles();
        System.out.println(files[0]);
        for(File file : files){
            System.out.println(file);
        }
    }
}

