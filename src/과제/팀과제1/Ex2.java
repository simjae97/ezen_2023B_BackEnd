package 과제.팀과제1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] 층= new String[3];
        int[] 시 = new int[3];
        int[] 분 = new int[3];
        //배열대신 if 층.equals()해서 구현
        for (int i = 0; i < 층.length; i++) {
            층[i] = ""; //기본값으로 초기화
        }
        while (true){
            System.out.print("입차 출차 선택:");
            String aa = scanner.next();
            if (aa.equals("입차")){
                System.out.print("층 선택");
                int bb = scanner.nextInt();
                scanner.nextLine();
                System.out.print("차량 번호");
                String cc = scanner.nextLine();
                System.out.print("입차 시간");
                int time = scanner.nextInt();
                scanner.nextLine();
                System.out.print("입차 분");
                int min = scanner.nextInt();
                if(층[bb].equals("")){
                    층[bb] =cc;
                    시[bb]= time;
                    분[bb] = min;
                }
                else{
                    System.out.println("이미 주차된 장소입니다");
                }
            }
            else if(aa.equals("출차")){
                System.out.print("층 선택");
                int bb = scanner.nextInt();
                System.out.print("입차 시간");
                int time = scanner.nextInt();
                System.out.print("입차 분");
                int min = scanner.nextInt();
                if(!층[bb].equals("")){
                    System.out.println("출차완료:"+((time-시[bb])*60+min-분[bb])/10*1000);
                    층[bb] ="";
                    시[bb]= 0;
                    분[bb] =0;
                }
                else{
                    System.out.println("입차된 차량이 존재하지 않습니다");
                }
            }
        }
    }
}
