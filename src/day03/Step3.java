package day03;
import java.util.Scanner;
public class Step3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        문제1 : 하나의 정수형으로  입력받아 7의 배수 이면 'O' 아니면 'X' 출력 하시오.
        System.out.println(scanner.nextInt()%7 == 0 ? "O":"X");
//        문제2 : 하나의 정수형으로  입력받아 홀수 이면 'O' 아니면 'X' 출력 하시오.
        System.out.println(scanner.nextInt()%2 == 1 ? "O":"X");
//        문제3 : 하나의 정수형으로  입력받아 7의 배수 이면서 짝수 이면 'O' 아니면 'X' 출력 하시오.
        int a = scanner.nextInt();
        System.out.println(a%7==0?a%2==0?"O":"X":"X");
//        문제4 : 하나의 정수형으로  입력받아 11의 배수 이거나 짝수 이면 'O' 아니면 'X' 출력 하시오.
        int b = scanner.nextInt();
        System.out.println(b%11==0?"O":b%2 == 0?"O":"X");
//        문제5 : 두개의 정수형으로 입력받아 더 큰수 출력 하시오.
        int c = scanner.nextInt();
        int d =scanner.nextInt();
        System.out.println(c>d?c:d);
//      문제6 : 정수형으로 반지름을 입력받아 원 넓이 출력 하시오. 소수점 둘째 자리 까지 출력하시오.
//                계산식) 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]
        System.out.printf("%.2f\n",(scanner.nextInt()<<1)*3.14);
//      문제7 : 실수형으로 두번 입력받아 앞 실수의 값이 뒤의 값의 몇% 인지 소수점 첫째 자리까지 출력하시오.
        System.out.printf("%.1f\n",(scanner.nextFloat()/ scanner.nextFloat()*100));
//        예) 54.5   84.3 실수 2개입력시 결과는   64.285714%
//
//       문제8 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기 , 소수점 첫째 자리까지 출력하시오.
//             계산식) 사다리꼴 계산식 = > (윗변 + 밑변) * 높이 / 2
        System.out.printf("%.1f\n",(scanner.nextFloat()*2*scanner.nextFloat()/2));
//        문제9 : 키를 정수를 입력받아 표준체중 출력하기 , 정수형으로 출력하시오.
//                계산식) 표준체중 계산식 = > (키 - 100) * 0.9
        System.out.printf("표준체중 : %d\n",(int)((scanner.nextInt()-100)*0.9));
//        문제10 : 키와 몸무게를 입력받아 BMI 출력하기 , 소수점 둘째 자리 까지 출력하시오.
//        계산식) BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))
        float key = scanner.nextFloat();
        float weight = scanner.nextFloat();
        System.out.printf("%.2f\n",weight*10000/(key*key));
//        문제11 : inch 를 입력받아 cm 로 변환하기  , 소수점 둘째 자리까지 출력하시오.
//                계산식) 1 inch -> 2.54cm
        System.out.printf("%.2f\n",scanner.nextFloat()*2.54);
//        문제12:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하여 소수 둘째자리까지 점수 출력하시오
//        계산식 반영비율)  중간고사 반영비율 => 30 %  / 기말고사 반영비율 => 30 %   / 수행평가 반영비율 => 40 %
        System.out.printf("%.2f\n" ,scanner.nextFloat()*0.3+scanner.nextFloat()*0.3+scanner.nextFloat()*0.4);
//        문제13 :  연산 순서 나열 하고 printf() 에 출력되는 x 와 y 값을 예측하시오.
        int x = 10;
        int y = x-- + 5 + --x;
        //1.x-- 호출: x에 현재값 10호출후 x -= 1 실행, 현재 x값 : 9
        //2.--x 호출: x-= 1 실행, 현재 x값: 8, x에 현재값 8 호출
        //3.산술 연산:10+5+8 = 18
        //4.대입연산: y= 18
        System.out.printf(" x의 값 : %d , y의값 :  %d ", x, y);
//        x= 8, y=23
//
//        문제14 : 나이를 입력받아 나이가 10세이상이면 학생 , 20세이상이면 성인 , 40세이상이면 중년 으로 출력하기
        int old = scanner.nextInt();
        System.out.println(old>=40?"중년":old>=20?"성인":old>=10?"학생":"");
//        문제15 : 국어 , 영어 , 수학 점수를 입력받아 각 변수에 저장하고 총점(소수점 0자리) 출력 , 평균(소수점 2자리 까지) 출력
        float kor = scanner.nextFloat();
        float eng = scanner.nextFloat();
        float math = scanner.nextFloat();
        System.out.printf("총점: %.0f 평균: %.2f\n",(kor+eng+math),(kor+eng+math)/3);
//        문제16 : 아이디[문자열] 와 비밀번호[문자열] 를 입력받아 아이디가 'admin' 이고 비밀번호가 '1234' 와 일치하면 '로그인성공' 아니면 '로그인실패' 출력
        String id = scanner.next();
        String pw = scanner.next();
        System.out.printf("%s\n", id.equals("admin") ? (pw.equals("1234") ? "로그인성공" : "로그인실패") : "로그인실패");
//        문제17 : 3개의 정수형으로 입력받아 가장 큰수 출력
        int a17 = scanner.nextInt();
        int b17 =scanner.nextInt();
        int c17 = scanner.nextInt();
        int min = (a17 < b17) ? ((a17 < c17) ? a17 : c17) : ((b17 < c17) ? b17 : c17);
        int mid = (a17 > b17) ? ((a17 > c17) ? ((b17 > c17) ? b17 : c17) : a17) : ((b17 > c17) ? ((a17 > c17) ? a17 : c17) : b17);
        int max = (a17 > b17) ? ((a17 > c17) ? a17 : c17) : ((b17 > c17) ? b17 : c17);
        System.out.println(min+" "+mid+" "+max);
    }
}
