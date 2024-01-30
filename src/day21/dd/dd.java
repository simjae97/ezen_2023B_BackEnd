package day21.dd;

public class dd {
    public static void main(String[] args){
        //익명 내부 클래스
        DoSomeThing dosomething = () -> {System.out.println("Hello");};

        dosomething.doItNow();

    }
}
