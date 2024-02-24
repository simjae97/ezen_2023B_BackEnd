package day23.step1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadCsv {
    public static void main(String[] args) {

        // 반환용 리스트 변수
        List<String> ret = new ArrayList<>();
        // 입력 스트림 오브젝트 생성
        BufferedReader br = null;

        try {
            // 대상 CSV 파일의 경로 설정
            br = Files.newBufferedReader(Paths.get("C:\\Users\\tlawo\\IdeaProjects\\ezen_2023B_BackEnd\\Word_Filter.csv"),Charset.forName("UTF-8"));
            // CSV파일에서 읽어들인 1행분의 데이터
            String line = "";

            while((line = br.readLine()) != null) {
                // CSV 파일의 1행을 저장하는 리스트 변수
                // 리스트 내용 출력
                System.out.println(line.replace("," , ""));
                // 반환용 리스트에 1행의 데이터를 저장
                ret.add(line.replace("," , ""));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if(br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        for(String i : ret){
            System.out.println(i);
        }
    }
}