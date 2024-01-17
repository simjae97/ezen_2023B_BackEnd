package day12.model;

import java.util.Random;

public class RandomEng {
    static Random random = new Random();

    static String  random(){
        String a = "";
        for (int i =0; i<6; i++) {
            a += (char) (random.nextInt(26) + 97);
        }
        return a;
    }
}
