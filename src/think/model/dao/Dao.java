package think.model.dao;


import think.model.dto.*;

import java.util.ArrayList;

public class Dao {
    static ArrayList<은행> 고객들 = new ArrayList<>();


    public boolean 계좌생성(은행 고객){ //계좌생성:ArrayList의 경우 add하면 자동적으로 인덱스+1 해서 맨 뒤에 추가해줌
        고객들.add(고객);
        return true; //따라서 false가 나올일 없음
    }
    public String 입금(은행 고객){
        if(고객.get계좌번호().substring(0,2).equals("01")){ //입금:
            for(int i=0; i<고객들.size(); i++){
                if(고객들.get(i).get계좌번호().equals(고객.get계좌번호())){
                    신한 고객1 = (신한) 고객들.get(i);
                    고객1.set입금액(고객1.get입금액()+고객.get입금액());
                    고객1.set마일리지(고객1.get마일리지()+(고객.get입금액() * 0.001));
                    고객들.set(i,고객1);
                    return 고객들.get(i).get입금액()+"";
                }
            }
        }
        else if(고객.get계좌번호().substring(0,2).equals("02")){
            for(int i=0; i<고객들.size(); i++){
                if(고객들.get(i).get계좌번호().equals(고객.get계좌번호())){
                    국민 고객1 = (국민) 고객들.get(i);
                    고객1.set입금액(고객1.get입금액()+고객.get입금액());
                    고객1.set마일리지(true);
                    고객들.set(i,고객1);
                    return 고객들.get(i).get입금액()+"";
                }
            }
        }
        else if(고객.get계좌번호().substring(0,2).equals("03")){
            for(int i=0; i<고객들.size(); i++){
                if(고객들.get(i).get계좌번호().equals(고객.get계좌번호())){
                    농협 고객1 = (농협) 고객들.get(i);
                    고객1.set입금액(고객1.get입금액()+고객.get입금액());
                    고객1.set포인트(고객1.get포인트()+(고객.get입금액()*0.005));
                    고객들.set(i,고객1);
                    return 고객들.get(i).get입금액()+"";
                }
            }
        }

        return null; //for문이 종료시까지 인풋받은 계좌번호와 같은 계좌번호가 존재하지않음 => 해당하는 계좌번호가 없으므로 null을 출력
    }
    public String 출금(은행 고객){
        if(고객.get계좌번호().substring(0,2).equals("01")){
            for(int i=0; i<고객들.size(); i++){
                if(고객들.get(i).get계좌번호().equals(고객.get계좌번호())){
                    신한 고객1 = (신한) 고객들.get(i);
                    고객1.set입금액(고객1.get입금액()-고객.get입금액());
                    고객1.set마일리지(고객1.get마일리지()-(고객.get입금액()*0.001));
                    고객들.set(i,고객1);
                    return 고객들.get(i).get입금액()+"";
                }
            }
        }
        else if(고객.get계좌번호().substring(0,2).equals("02")){
            for(int i=0; i<고객들.size(); i++){
                if(고객들.get(i).get계좌번호().equals(고객.get계좌번호())){
                    국민 고객1 = (국민) 고객들.get(i);
                    고객1.set입금액(고객1.get입금액()+고객.get입금액());
                    고객1.set마일리지(true);
                    고객들.set(i,고객1);
                    return 고객들.get(i).get입금액()+"";
                }
            }
        }
        else if(고객.get계좌번호().substring(0,2).equals("03")){
            for(int i=0; i<고객들.size(); i++){
                if(고객들.get(i).get계좌번호().equals(고객.get계좌번호())){
                    농협 고객1 = (농협) 고객들.get(i);
                    고객1.set입금액(고객1.get입금액()+고객.get입금액());
                    고객1.set포인트(고객1.get포인트()-(고객.get입금액()*0.005));
                    고객들.set(i,고객1);
                    return 고객들.get(i).get입금액()+"";
                }
            }
        }

        return null;
    }
    public 은행 계좌확인(은행 고객) {
        for (int i = 0; i < 고객들.size(); i++) {
            if (고객들.get(i).get계좌번호().equals(고객.get계좌번호())) {
                return 고객들.get(i);
            }
        }
        return null;
    }
}
