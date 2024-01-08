package day04;

public class Step2 {
    public static void main(String[] args) {
        //p.124
        //1. 1~10까지 출력하는 코드
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
        System.out.println("9");
        System.out.println("10");

        for (int i = 1; i<=10; i+=1){
            System.out.println(i+"");
        }
        //2. 1~100까지의 합
        int sum = 0;
        for (int i = 1; i<=100; i++){
            sum += i;
        }
        System.out.println("sum = " + sum);

        //3. 구구단 : 중첩for 문
        for (int 단 =2 ; 단<=9; 단++){
            for(int 곱=2; 곱<=9; 곱++){
                System.out.print(단+"X"+곱+"="+(단*곱)+" ");
            }
            System.out.println();
        }

        //4. for -> while 1~10
        int j = 1;
        while (j<=10){
            System.out.println(j+"");
            j++;
        }
        int sum2 = 0;
        int m = 1;
        while (m<=100){
            sum2 += m;
            m++;
        }

        System.out.println(sum2+"");
    }
}
