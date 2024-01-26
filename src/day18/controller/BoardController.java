package day18.controller;

import day18.model.dao.BoardDao;
import day18.model.dto.BoardDto;

public class BoardController {
    private BoardController(){}
    private static BoardController boardController = new BoardController();

    public static BoardController getInstance() {
        return boardController;
    }

    public BoardDto view(int num){ return BoardDao.getInstance().view(num);}
    public String findId(int num){ return BoardDao.getInstance().findId(num);}
    public String findCategory(int num){ return BoardDao.getInstance().findCategory(num);}
    public boolean dropBoard(int num){ return BoardDao.getInstance().dropBoard(num);}
}
