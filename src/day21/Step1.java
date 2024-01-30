package day21;

public class Step1 {
    public static void main(String[] args) {
        try {
            findClss();
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        System.out.println(args);
    }

    public static void findClss() throws Exception{
        Class.forName("java.lang.String2");
    }
}
