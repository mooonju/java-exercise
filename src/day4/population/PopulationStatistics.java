package day4.population;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

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
    public List<PopulationMove> readByLine(String filename) throws IOException{
        // 한 라인씩
        List<PopulationMove> pml = new ArrayList<>();
        BufferedReader reader = new BufferedReader(
                new FileReader(filename)
        );
        String str;
        while ((str = reader.readLine()) != null) {
//            System.out.println(str);
            PopulationMove pm = parse(str);
            pml.add(pm);
        }
        reader.close();
        return pml;
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
        // String[] populationMoveData = data.split(",");
        //return new PopulationMove(Integer.valueOf(populationMoveData[0]), Integer.valueOf(populationMoveData[6]));
        String[] splittedLine = data.split(",");
        return  new PopulationMove(splittedLine[0], splittedLine[1]);
    }

    public  void createAFile(String filename){
        File file = new File(filename);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // string 리스트를 받아서 filename에 쓴다
    // filename = from_to.txt
    public void write(List<String> strs, String filename) {
        File file = new File(filename);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            for(String str : strs){
                writer.write(str);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String fromToString(PopulationMove populationMove){
        return populationMove.getFromSido() + "," + populationMove.getToSido() + "\n";
    }

    public static void main(String[] args) throws IOException {
        // 파일 읽어오기
        String address = "./from_to.txt";
        PopulationStatistics populationStatistics = new PopulationStatistics();
        List<PopulationMove> pml = populationStatistics.readByLine(address);

//        List<String> strings = new ArrayList<>();
        for(PopulationMove pm : pml){
            System.out.printf("전입:%s, 전출:%s\n", pm.getFromSido(), pm.getToSido());
//            String fromTo = populationStatistics.fromToString(pm);
//            strings.add(fromTo);

        }
//        System.out.println(pml.size());
//        populationStatistics.createAFile("./from_to.txt"); 파일 생성
//        strings.add("11", "11");
//         System.out.println(strings.size());
//        populationStatistics.write(strings,"./from_to.txt");


    }
}
