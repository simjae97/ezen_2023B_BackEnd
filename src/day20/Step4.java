package day20;

public class Step4 {
    //1.매개변수 문자의 길이를 알려주는 함수
    public static void printLength(String data) {
        try {
            int result = data.length();
            System.out.println("문자 수 : " + result);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        try {
            printLength("ddddddd");
            printLength(null); // null이면 참조가 없으므로 .불가능
            Class.forName("java.lang.String"); //일반 예외
            Class.forName("java.lang.String2"); //일반 예외
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
        catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
        finally {
            System.out.println("마무리 실행");
        }

        // 3.
        String[] array = {"100","1oo"};
        for(int i=0; i<= array.length; i++){
            try {
                int value = Integer.parseInt(array[i]); // "1oo"는 정수타입으로 변환 불가능
                                                        //ArrayIndexOutOfBoundsException : 2인덱스는 존재하지않는다
                                                        //
            }
            catch (NumberFormatException e){
                System.out.println("넘버로 변환할 수 없습니다"+e.getMessage());
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(i+"배열 인덱스가 초과됨."+e.getMessage());
            }
        }
    }
}