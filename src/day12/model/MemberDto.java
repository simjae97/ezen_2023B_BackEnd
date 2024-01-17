package day12.model;


//DTO:데이터 이동 객체
    //-복잡한 로직을 하는곳이 아닌 단순 데이터이동을 위한 객체
    //-2.생성자(개발자 용도에 따라선언), 권장: 기본생성자+풀생성자
    //3.메소드(형변환,필드호출),권장: (getter/setter,toStirng)
    //3-2 toString:필드 정보 확인차 주로 사용목적
public class MemberDto {
    private int no; //회원번호
    private String id;
    private String pw;

    private String name;
    private String phone;
    //2.생성자
    public MemberDto(){} //기본생성자
    //풀(모든 매개변수가 존재하는 생성자)
    //우클릭 -> 생성 ->생성자->선택한 필드만큼의 생성자를 자동으로 만들어줌

    public MemberDto(int no, String id, String pw, String name, String phone) {
        this.no = no;
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.phone = phone;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
