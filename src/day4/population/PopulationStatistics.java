package day4.population;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PopulationStatistics {

    public void readByChar(String filename) throws IOException{
        FileReader fileReader = new FileReader(filename);
        // 파일을 읽지 않는 상태 (메모리의 부담)

        String fileContents = ""; // 백만개를 누적하는 코드
        while (fileContents.length() < 1000000){
            char c = (char)fileReader.read();
            fileContents += c;
        }
        System.out.println(fileContents);
    }
    public void readByLine(String filename) throws IOException{
        // 한 라인씩
        BufferedReader reader = new BufferedReader(
                new FileReader(filename)
        );
        String str;
        while ((str = reader.readLine()) != null) {
            System.out.println(str);
        }
        reader.close();
    }

    public void readByLine2(String filename){
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(filename), StandardCharsets.UTF_8)){

            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public PopulationMove parse(String data){
        String[] populationMoveData = data.split(",");
        return new PopulationMove(Integer.valueOf(populationMoveData[0]), Integer.valueOf(populationMoveData[6]));
    }

    public static void main(String[] args) throws IOException {
        // 파일 읽어오기
        String address = "C:\\Users\\zzzo_\\OneDrive\\바탕 화면\\새 폴더 (2)\\2021_인구관련연간자료_20221007_69383.csv";
        PopulationStatistics populationStatistics = new PopulationStatistics();
        populationStatistics.readByLine(address);
    }
}
