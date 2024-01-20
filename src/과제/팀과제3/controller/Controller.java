package 과제.팀과제3.controller;


import 과제.팀과제3.model.*;

public class Controller {
    private Controller(){}
    private static Controller controller = new Controller();

    public static Controller getInstance() {
        return controller;
    }

    public boolean 계좌생성(String 이름, String 계좌번호, int 입금액){
        if (계좌번호.substring(0,1).equals("1")){   //계좌번호가 1로 시작하면 신한
            은행DTO 유저 = new 신한DTO();    //원형은 신한DTO인데 부모인 은행DTO로 형변환한 유저객체 생성(신한이 가진 마일리지 필드가 있으나 이상태에선 보이지않음)
            유저.set계좌주(이름);          //유저에 인풋받은 이름,계좌번호,입금액 입력
            유저.set계좌번호(계좌번호);
            유저.set입금액(입금액);
            boolean result = 은행DAO.getInstance().계좌생성(유저);
            return result;
        }
        else if(계좌번호.substring(0,1).equals("2")){ //계좌번호가 2로 시작하면 국민
            은행DTO 유저 = new 국민DTO();
            유저.set계좌주(이름);
            유저.set계좌번호(계좌번호);
            유저.set입금액(입금액);
            boolean result = 은행DAO.getInstance().계좌생성(유저);
            return result;
        }
        else if(계좌번호.substring(0,1).equals("3")){   //계좌번호가 3으로 시작하면 농협
            은행DTO 유저 = new 농협DTO();
            유저.set계좌주(이름);
            유저.set계좌번호(계좌번호);
            유저.set입금액(입금액);
            boolean result = 은행DAO.getInstance().계좌생성(유저);
            return result;
        }
        return false;
    }
    public String 예금(String 계좌번호, int 입금액){
        은행DTO 유저 = new 은행DTO();  //마일리지,포인트,쿠폰등은 여기에서 볼 필요가 없으니 은행DTO로 만든 객체 생성
        유저.set계좌번호(계좌번호);
        유저.set입금액(입금액);
        String result = 은행DAO.getInstance().예금(유저); //DAO호출
        System.out.println(result);
        return result;
    }
    public String  출금(String 계좌번호, int 입금액){ //입금과 마찬가지
        은행DTO 유저 = new 은행DTO();
        유저.set계좌번호(계좌번호);
        유저.set입금액(입금액);
        String result = 은행DAO.getInstance().출금(유저);
        return result;
    }

}
