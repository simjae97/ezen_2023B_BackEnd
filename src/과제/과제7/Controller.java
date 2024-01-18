package 과제.과제7;


public class Controller {
    MemberDao memberDao = new MemberDao();
    public boolean regist(MemberDto memberDto){
        boolean result = memberDao.regist(memberDto);
        return result;
    }
    public boolean login(MemberDto memberDto){
        boolean result = memberDao.login(memberDto);
        return result;
    }

    public String findId(MemberDto memberDto){
        String result = memberDao.findId(memberDto);
        return result;
    }
    public String findPw(MemberDto memberDto){
        String result = memberDao.findPw(memberDto);
        return result;
    }
}
