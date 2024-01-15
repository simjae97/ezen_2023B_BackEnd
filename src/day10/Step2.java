package day10;

public class Step2 {
    public static void main(String[] args) {
        //p.234: 가변길이 매개변수
            //메소드를 호출할때에는 매개변수의 개수에 맞게 넣어야한다
            //가변길이 매개변수를 가지고 있다면 개수와 상관없이 사용 가능

        //다른 클래스에 있는 메소드를 사용하고 싶을대
            //1.객체생성:메소드 호출하려고
        Computer myCom = new Computer();
        System.out.println(myCom.sum(1,2,3));

        System.out.println(myCom.sum(1,2,3,4,5,6,7,8,9));

        int[] values = {1,2,3,4,5,6,7};
        System.out.println(myCom.sum(values));
        int result = myCom.sum(new int[] {1,2,3,4,5});
        System.out.println(myCom.sum(result));

        System.out.println(myCom.sum3(values));
    }
}


/*

        객체지향 프로그래밍 : 객체들 간의 상호작용
                    더하기 기능
                사람 <------------->계산기
                        결과 리턴



                        고장난 핸드폰, 돈 : 매개변수
                사람 <-------------> 삼성 서비스센터 AS
                        수리된 폰 리턴
*/