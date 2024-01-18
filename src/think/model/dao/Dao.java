package think.model.dao;


import think.model.dto.*;

import java.util.ArrayList;

public class Dao {
    static ArrayList<은행> 고객들 = new ArrayList<>();

    public boolean 계좌생성(은행 고객){
        고객들.add(고객);
        return true;
    }
    public String 입금(은행 고객){
        return null;
    }

}
