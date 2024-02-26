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
        //csv받아와서 Trie에 저장,현재는 단순 비교이므로 aho corasick으로 변경 준비
        // 반환용 리스트 변수
        Trie ret = new Trie();
        // 입력 스트림 오브젝트 생성
        BufferedReader br = null;

        try {
            // 대상 CSV 파일의 경로 설정
            br = Files.newBufferedReader(Paths.get("C:\\Users\\504\\Desktop\\ezen_2023B_BackEnd\\Word_Filter.csv"),Charset.forName("UTF-8"));
            // CSV파일에서 읽어들인 1행분의 데이터
            String line = "";

            while((line = br.readLine()) != null) {
                // CSV 파일의 1행을 저장하는 리스트 변
                // 반환용 리스트에 1행의 데이터를 저장
                ret.insert(line.replace("," , ""));
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

        System.out.println(ret.search("꼬라지"));
    }
}
