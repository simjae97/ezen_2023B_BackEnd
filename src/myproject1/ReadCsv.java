package myproject1;

import com.hankcs.algorithm.AhoCorasickDoubleArrayTrie;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class ReadCsv {
    public static void main(String[] args) {
        //csv받아와서 Trie에 저장,현재는 단순 비교이므로 aho corasick으로 변경 준비
        // 반환용 리스트 변수
        AhoCorasickDoubleArrayTrie<String> acdat = new AhoCorasickDoubleArrayTrie<>(); //라이브러리
        // 입력 스트림 오브젝트 생성
        BufferedReader br = null;
        TreeMap<String,String > map = new TreeMap<>();
        List<String> list = new LinkedList<>(); //트라이구조에 넣을 문자열 배열 생성
        String test = "";
        try {
            // 대상 CSV 파일의 경로 설정
            br = Files.newBufferedReader(Paths.get("C:\\Users\\tlawo\\IdeaProjects\\ezen_2023B_BackEnd\\Word_Filter.csv"),Charset.forName("UTF-8")); //csv 위치
            // CSV파일에서 읽어들인 1행분의 데이터
            String line = "";

            while((line = br.readLine()) != null) {
                // CSV 파일의 1행을 저장하는 리스트 변
                // 반환용 리스트에 1행의 데이터를 저장
                String answer =line.replace("," , "");
                map.put(answer,answer); // 라이브러리 구현용 맵 대입
                list.add(answer); //내 구현용 리스트 대입
                test += answer; //단순 비교용 문자열 만들기
                test += "안녕"; //단순 비교용 문자열 만들기
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
        acdat.build(map);

        System.out.println("test.length() = " + test.length());
        System.out.println("test = " + test);
        long beforeTime = System.currentTimeMillis();
        List<AhoCorasickDoubleArrayTrie.Hit<String>> wordList = acdat.parseText(test);
        System.out.println("wordList = " + wordList);
        long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        long secDiffTime = (afterTime - beforeTime); //두 시간에 차 계산
        System.out.println("시간차이 : "+secDiffTime);

        AhoCorasick ret = new AhoCorasick(list); //아호코라식에 넣기위해 만들어둔 리스트를 넣음
        beforeTime = System.currentTimeMillis();
        List<String> result = ret.search(test);
        System.out.println("result = " + result);
        afterTime = System.currentTimeMillis();
        secDiffTime = (afterTime - beforeTime);
        System.out.println("시간차이 : "+secDiffTime);

        SimplePatternMatching a = new SimplePatternMatching(); //단순 문자열 비교
        beforeTime = System.currentTimeMillis();
        List<String> result2 = a.searchPatterns(test,list);
        System.out.println("result2 = " + result2);
        afterTime = System.currentTimeMillis();
        secDiffTime = (afterTime - beforeTime);
        System.out.println("시간차이 : "+secDiffTime);


        String prefix = "dro";
        List<String> suggestions = ret.autocomplete(prefix);
        System.out.println("검색어 '" + prefix + "'를 위한 자동완성 제안:");
        for (String suggestion : suggestions) {
            System.out.println(suggestion);
        }
    }
}
