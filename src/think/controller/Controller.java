package think.controller;

import think.model.dao.Dao;
import think.model.dto.*;

public class Controller {
    Dao dao = new Dao();
    public boolean 계좌생성(은행 유저){
        boolean result = dao.계좌생성(유저);
        return result;
    }
    public String 입금(은행 유저){
        String result = dao.입금(유저);
        return result;
    }

}
