package think.controller;

import think.model.dao.Dao;
import think.model.dto.*;

public class Controller {
    //컨트롤러는 기본적으로 DAO에 값만 전달, 추후 js로 view를 만들시 형변환 추가
    Dao dao = new Dao();
    public boolean 계좌생성(은행 유저){
        boolean result = dao.계좌생성(유저);
        return result;
    }
    public String 입금(은행 유저){
        String result = dao.입금(유저);
        return result;
    }
    public String 출금(은행 유저){
        String result = dao.출금(유저);
        return result;
    }
    public 은행 계좌확인(은행 유저){
        은행 result = dao.계좌확인(유저);
        return result;
    }
}
