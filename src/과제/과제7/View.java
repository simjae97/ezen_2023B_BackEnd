package 과제.과제7;


import java.util.Scanner;

public class View {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Controller controller = new Controller();
        while(true) {
            System.out.println("\n\n--------- 회원 시스템 ---------");
            System.out.print("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기   선택> ");
            int ch = sc.nextInt();
            if( ch == 1 ) {
                System.out.print("아이디 입력"); String id =  View.sc.next();
                System.out.print("비밀번호 입력"); String pw =  View.sc.next();
                System.out.print("이름 입력"); String name =  View.sc.next();
                System.out.print("전화번호 입력"); String phone =  View.sc.next();
                System.out.print("나이 입력"); int age =  View.sc.nextInt();
                MemberDto member = new MemberDto(id,pw,name,phone,age);
                boolean result =controller.regist(member);
                if(result){
                    System.out.println("회원가입 성공");
                }
                else {
                    System.out.println("회원가입 실패");
                }
            }
            else if( ch == 2 ) {
                System.out.print("아이디 입력"); String id =  sc.next();
                System.out.print("비밀번호 입력"); String pw =  sc.next();
                MemberDto member = new MemberDto();
                member.setId(id);
                member.setPw(pw);
                boolean result =controller.login(member);
                if(result){
                    System.out.println("로그인성공");
                }
                else {
                    System.out.println("로그인실패");
                }
            }
            else if( ch == 3 ) {
                System.out.print("이름 입력"); String name =  sc.next();
                System.out.print("전화번호 입력"); String phone =  sc.next();
                MemberDto member = new MemberDto();
                member.setName(name);
                member.setPhone(phone);
                String result = controller.findId(member);
                if(result != null){
                    System.out.println("회원님의 아이디는 "+result+"입니다");
                }
                else {
                    System.out.println("입력되지 않은 회원입니다");
                }

            }
            else if( ch == 4 ) {
                System.out.print("아이디 입력"); String id =  sc.next();
                System.out.print("전화번호 입력"); String phone =  sc.next();
                MemberDto member = new MemberDto();
                member.setId(id);
                member.setPhone(phone);
                String result = controller.findPw(member);
                if(result != null){
                    System.out.println("회원님의 비밀번호는 "+result+"입니다");
                }
                else {
                    System.out.println("입력되지 않은 회원입니다");
                }
            }

        } // w e
    } // m e
}
