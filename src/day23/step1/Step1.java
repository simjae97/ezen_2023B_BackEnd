package day23.step1;

import java.util.ArrayList;

public class Step1 {
    public static void main(String[] args) {
        String[] strarray = new String[3];
        strarray[0]= "유재석";
        strarray[1] = "강호동";
        strarray[2] = "신동엽";
        System.out.println("배열상태 : "+strarray);
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("유재석");
        stringList.add("강호동");
        System.out.println("리스트 상태 "+stringList);

        SimpleList<String> simpleList = new SimpleList();
        simpleList.add("dd");
        simpleList.add("신동엽");
        simpleList.add("서장훈");
        simpleList.remove(1);
        System.out.println(simpleList);
        System.out.println(simpleList.get(1));
//        simpleList.add(10);

        SimpleList<Integer> simpleList2 = new SimpleList();
        simpleList2.add(1);
        simpleList2.add(2);
        System.out.println(simpleList2);

        SimpleMAP<String,String> simpleMAP = new SimpleMAP<>();
        simpleMAP.put("1","ㅁ");
        simpleMAP.put("2","d");
        System.out.println(simpleMAP);

        System.out.println("1키의 대한 밸류는"+simpleMAP.get("1"));
        simpleMAP.put("1","ㄴㄴㄴㄴ");
        System.out.println("1키의 대한 갱신된 밸류는"+simpleMAP.get("1"));
        System.out.println("사이즈"+simpleMAP.size());
        System.out.println(simpleMAP);
        simpleMAP.remove("2");
        System.out.println(simpleMAP);

        SimpleMAP<String,Integer> simpleMAP2 = new SimpleMAP<>();
        simpleMAP2.put("1",15);
        simpleMAP2.put("2",30);
        System.out.println(simpleMAP2);

        System.out.println("1키의 대한 밸류는"+simpleMAP2.get("1"));
        simpleMAP2.put("1",1234);
        System.out.println("1키의 대한 갱신된 밸류는"+simpleMAP2.get("1"));
        System.out.println("사이즈"+simpleMAP2.size());
        System.out.println(simpleMAP2);
        System.out.println("삭제된 값"+simpleMAP2.remove("2"));
        System.out.println(simpleMAP2);

        SimpleMAP<String,Object> simpleMAP3 = new SimpleMAP<>();
        simpleMAP3.put("1",15);
        simpleMAP3.put("2","안녕하세요");
        System.out.println(simpleMAP3);

        System.out.println("1키의 대한 밸류는"+simpleMAP3.get("1"));
        simpleMAP3.put("1","ㅇㅇ");
        System.out.println("1키의 대한 갱신된 밸류는"+simpleMAP3.get("1"));
        System.out.println("사이즈"+simpleMAP3.size());
        System.out.println(simpleMAP3);
        System.out.println("삭제된 값"+simpleMAP3.remove("2"));
        System.out.println(simpleMAP3);
        System.out.println("삭제된 값"+simpleMAP3.remove("555"));
        System.out.println(simpleMAP3);

        SimpleMap2<String ,String > simpleMap2 = new SimpleMap2<>();
        simpleMap2.put("1","ㅁ");
        simpleMap2.put("2","d");
        System.out.println(simpleMap2);

        System.out.println("1키의 대한 밸류는"+simpleMap2.get("1"));
        simpleMap2.put("1","ㄴㄴㄴㄴ");
        System.out.println("1키의 대한 갱신된 밸류는"+simpleMap2.get("1"));
        System.out.println("사이즈"+simpleMap2.size());
        System.out.println(simpleMap2);
        simpleMap2.remove("2");
        System.out.println(simpleMap2);

    }
}
