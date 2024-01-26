package day18.controller;

import day18.model.dao.BoardDao;
import day18.model.dto.BoardDto;
import day18.model.dto.CategoryDto;

import java.util.ArrayList;

public class BoardController {
    private BoardController(){}
    private static BoardController boardController = new BoardController();

    public static BoardController getInstance() {
        return boardController;
    }

    public int boardWrite(BoardDto boardDto){
        int result = BoardDao.getInstance().boardWrite(boardDto);
        return result;
    }

    public ArrayList<CategoryDto> cateList(){
        ArrayList<CategoryDto> result = new ArrayList<>();
        result = BoardDao.getInstance().cateList();
        return result;
    }
    public BoardDto view(int num){ return BoardDao.getInstance().view(num);}
    public String findId(int num){ return BoardDao.getInstance().findId(num);}
    public String findCategory(int num){ return BoardDao.getInstance().findCategory(num);}
    public boolean dropBoard(int num){ return BoardDao.getInstance().dropBoard(num);}
}
