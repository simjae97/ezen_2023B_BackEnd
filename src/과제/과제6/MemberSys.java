package 과제.과제6;
import java.util.Scanner;

public class MemberSys { // class s
	Member[] 객체배열 = new Member[100];
	Scanner scanner = new Scanner(System.in);
	public void regist(){
		System.out.print("아이디 입력"); String id =  scanner.next();
		System.out.print("비밀번호 입력"); String pw =  scanner.next();
		System.out.print("이름 입력"); String name =  scanner.next();
		System.out.print("전화번호 입력"); String phone =  scanner.next();
		System.out.print("나이 입력"); int age =  scanner.nextInt();
		Member member = new Member(id,pw,name,phone,age);
		for (int i =0; i<객체배열.length; i++){
			if(객체배열[i] == null){
				객체배열[i] = member;
				System.out.println("회원가입 성공");
				return;
			}
		}
		System.out.println("회원가입실패");
	}
	public boolean findId(String id){
		for(int i=0; i<객체배열.length; i++){
			if(객체배열[i] != null){
				if(객체배열[i].getId().equals(id)){
					return true;
				}
			}
		}
		return false;
	}
	public void login(){
		System.out.print("아이디 입력"); String id =  scanner.next();
		System.out.print("비밀번호 입력"); String pw =  scanner.next();
		if(findId(id)) {
			for (int i = 0; i < 객체배열.length; i++) {
				if (객체배열[i] != null) {
					if (객체배열[i].getPw().equals(pw)) {
						System.out.println("로그인 성공!");
						return;
					}
				}
			}
		}
		System.out.println("로그인 실패");
	}
	public String findId2(){
		System.out.print("이름 입력"); String name =  scanner.next();
		System.out.print("전화번호 입력"); String phone =  scanner.next();
		for(int i= 0; i<객체배열.length; i++){
			if (객체배열[i] != null) {
				if (객체배열[i].getName().equals(name) && (객체배열[i].getPhone().equals(phone))){
					return 객체배열[i].getId();
				}
			}
		}
		return null;
	}
	public String findPw(){
		System.out.print("아이디 입력"); String id =  scanner.next();
		System.out.print("전화번호 입력"); String phone =  scanner.next();
		if(findId(id)){
			for(int i= 0; i<객체배열.length; i++){
				if (객체배열[i] != null) {
					if (객체배열[i].getPhone().equals(phone)){
						return 객체배열[i].getPw();
					}
				}
			}
		}
		return null;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MemberSys memberSys = new MemberSys();
		while(true) {

			System.out.println("\n\n--------- 회원 시스템 ---------");
			System.out.print("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기   선택> ");
			int ch = sc.nextInt();

			if( ch == 1 ) {
				memberSys.regist();
			}
			else if( ch == 2 ) {
				memberSys.login();
			}
			else if( ch == 3 ) {
				System.out.println("아이디는"+memberSys.findId2());
			}
			else if( ch == 4 ) {
				System.out.println("비밀번호는"+memberSys.findPw());
			}

		} // w e
	} // m e 
} // class e 
/*
	주제 : 회원제 시스템 part2
	 	- Member , MemberSys 클래스를 이용하여 아래 조건에 따라. 코드를 완성하시오.
 		- Member , MemberSys 클래스 외 새로운 클래스를 생성 하지 마시오.
 		- main() 메소드 외 기능별 함수를 4개 생성하시오.

		[ Member 클래스 ]
 		0. 아래 필드를 가지는 클래스를 설계 하시오.
 			필드 : 아이디 , 비밀번호 , 이름 , 전화번호 , 나이
		1. 생성자 사용하시오.
		2. getter , setter 메소드를 사용하시오.

		[ MemberSys 클래스 ]
		0. 배열
			Member[] 객체배열 = new Member[100];

		1. 초기 메뉴
			1. 회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기
			
		2. 조건 기능 
			1. 회원가입 메소드 
				1. 아이디 , 비밀번호 , 이름 , 전화번호 , 나이  각 입력받아 저장 
				2. Member 객체화
				3. 객체를 배열 저장 
				 
			2. 로그인 메소드
				1. 아이디 , 비밀번호 입력받아 저장 
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 로그인 성공 
					- 아니면 실패
					 
			3. 아이디찾기 메소드
				1. 이름 , 전화번호 입력받아 저장
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 찾은 아이디 출력 
					- 아니면 없다.
					 
			4. 비밀번호찾기 메소드 
				1. 아이디 , 전화번호 입력받아 저장
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 찾은 비밀번호 출력
					- 아니면 없다.

			
*/














