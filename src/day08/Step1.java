package day08;

import java.util.Arrays;
import java.util.Scanner;

public class Step1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        붕어빵틀[] 붕어빵트레이 = new 붕어빵틀[10];
                // 500번지{500번지[null] , 501번지[null],502번지[null],503번지[null],,,,}
                //첫번째 붕어빵을 구웠을때
                //500번지{500번지[101번지] , 501번지[null],502번지[null],503번지[null],,,,}
        while (true){
            System.out.println(Arrays.toString(붕어빵트레이)); //배열내 객체들 주소 확인
            for (붕어빵틀 i:붕어빵트레이){
                if( i != null){
                    System.out.println(i.속재료);
                }
            }
            System.out.println("1.굽기 2.판매");
            int ch = scanner.nextInt();

            if(ch==1){
                //1.객체 생성: 1.new -> 클래스 /생성자()
                붕어빵틀 붕어빵 = new 붕어빵틀(); //(1개의 주소 성생) 붕어빵 생성
                System.out.print("속재료 : ");
                String 붕어빵속재료 = scanner.next();
                붕어빵.속재료 = 붕어빵속재료;
                        //101번지{}
//                붕어빵트레이[0] = 붕어빵; // if끝나면 객체를 참조하는 변수는 사라지기때문에 객체의 참조주소를 밖으로 옮김
                for (int i= 0; i<붕어빵트레이.length; i++){
                    if (붕어빵트레이[i] == null) {
                        붕어빵트레이[i] = 붕어빵;
                        break;
                    }
                }
            } //if가 끝나면 "붕어빵"의 지역변수는 사라짐 -> 곧 객체도 사라짐.
            if (ch==2){
                System.out.print("판매할 붕어빵 위치:");
                int dNo = scanner.nextInt();

                // 힙영역에 대해 자바는 제거하는 방법을 제공하지 않는다. 그래서 초기값(null)활용
                    //GC: 힙의 객체가 NULL이면 자동 삭제
                붕어빵트레이[dNo] = null;
                //만약에 삭제할 객체 인덱스 뒤로 객체가 존재하면 한칸씩 인덱스 당기기
                for (int i = dNo; i < 붕어빵트레이.length-1; i++){
                    //i는 삭제한 객체의 인덱스위치부터
                    붕어빵트레이[i] = 붕어빵트레이[i+1];

                }
            }
        }
    }
}

