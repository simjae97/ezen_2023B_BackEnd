package 과제.팀과제3.controller;


import 과제.팀과제3.model.*;

public class Controller {
    private Controller(){}
    private static Controller controller = new Controller();

    public static Controller getInstance() {
        return controller;
    }

    public boolean 계좌생성(String 이름, String 계좌번호, int 입금액){
        if (계좌번호.substring(0,1).equals("1")){
            은행DTO 유저 = new 신한DTO();
            유저.set계좌주(이름);
            유저.set계좌번호(계좌번호);
            유저.set입금액(입금액);
            boolean result = 은행DAO.getInstance().계좌생성(유저);
            return result;
        }
        else if(계좌번호.substring(0,1).equals("2")){
            은행DTO 유저 = new 국민DTO();
            유저.set계좌주(이름);
            유저.set계좌번호(계좌번호);
            유저.set입금액(입금액);
            boolean result = 은행DAO.getInstance().계좌생성(유저);
            return result;
        }
        else if(계좌번호.substring(0,1).equals("3")){
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
        은행DTO 유저 = new 은행DTO();
        유저.set계좌번호(계좌번호);
        유저.set입금액(입금액);
        String result = 은행DAO.getInstance().예금(유저);
        System.out.println(result);
        return result;
    }
    public String  출금(String 계좌번호, int 입금액){
        은행DTO 유저 = new 은행DTO();
        유저.set계좌번호(계좌번호);
        유저.set입금액(입금액);
        String result = 은행DAO.getInstance().출금(유저);
        return result;
    }

}
