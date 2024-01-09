package day06;

import java.util.Scanner;

public class Step5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("시간 (hhmmss): ");
        String time = scanner.nextLine();
        System.out.print("시간(숫자):");
        String second = scanner.nextLine();
        
        int[] time2 = {Integer.parseInt(time.substring(0,2)),Integer.parseInt(time.substring(2,4)),Integer.parseInt(time.substring(4))};
        time2[2] = time2[2]+Integer.parseInt(second);
        while (time2[2] >= 60){
            time2[2] -= 60;
            time2[1] += 1;
        }
        while (time2[1] >= 60){
            time2[1] -= 60;
            time2[0] += 1;
        }
        while (time2[0] >= 24){
            time2[0] -= 24;
        }
        String result = "";
        for (int i:time2){

            result += i>=10?i+":":"0"+i+":";
        }
        System.out.println("result = " + result.substring(0,result.length()-1));
    }
}
