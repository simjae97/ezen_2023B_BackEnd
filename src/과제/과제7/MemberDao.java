package 과제.과제7;

import java.util.ArrayList;

public class MemberDao {
    ArrayList<MemberDto> array = new ArrayList<>();
    public boolean regist(MemberDto memberDto){
        array.add(memberDto);
        return true;
    }

    public boolean login(MemberDto memberDto){
        for (MemberDto i : array){
            if(i.getId().equals(memberDto.getId()) && i.getPw().equals(memberDto.getPw())){
                return true;
            }
        }
        return false;
    }
    public String findId(MemberDto memberDto){
        for (MemberDto i : array){
            if(i.getName().equals(memberDto.getName()) && i.getPhone().equals(memberDto.getPhone())){
                return i.getId();
            }
        }
        return null;
    }
    public String findPw(MemberDto memberDto){
        for (MemberDto i : array){
            if(i.getId().equals(memberDto.getId()) && i.getPhone().equals(memberDto.getPhone())){
                return i.getPw();
            }
        }
        return null;
    }
}
