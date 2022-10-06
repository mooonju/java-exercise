package day3.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileExercise {

    private  String filename;

    public FileExercise(String filename) {
        this.filename = filename;
    }

    public String readNChars(int N) throws IOException{
        FileReader fileReader = new FileReader(this.filename);
        String str = "";
        for (int i = 0; i < N; i++){
            // - 가 나올 경우 break
            int asciiCd = fileReader.read();
            if(asciiCd == -1){
                return str;
            }
            str += (char) asciiCd;
        }
        return str;
    }

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
        FileExercise fileExercise = new FileExercise("./aa_file.txt");
        char c = fileExercise.readAChar("./aa_file.txt");
        String str = fileExercise.read2Chars("./aa_file.txt");
        System.out.println(c);
        System.out.println(str);
        System.out.println(fileExercise.readNChars(10));
        /*
            1
            11
            1111222345
        */
    }
}

