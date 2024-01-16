package day11;

public class Step3 {
    static int run(int x, int y){
        return x+y;
    }
    public static void main(String[] args) {
        //Singleton obj1 = new Singleton(); //private
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if(obj1 == obj2){
            System.out.println("같은 싱글톤");
        }
        else {
            System.out.println("다른 싱글톤");
        }
        //싱글톤의 경우 쓰던 안쓰던 메모리에 적재되는 단점 존재
//        Step3 step3 = new Step3();
//        System.out.println(step3.run(10,10));
        System.out.println(run(3,7));
    }
}
