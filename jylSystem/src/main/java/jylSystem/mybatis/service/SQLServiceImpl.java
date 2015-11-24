package jylSystem.mybatis.service;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jylSystem.bean.BoardBean;
import jylSystem.bean.MenuItem;
import jylSystem.mybatis.dao.ServiceDAO;
 
@Service
public class SQLServiceImpl implements SQLService{
	private final Logger log = Logger.getLogger(this.getClass());
     
    @Autowired
    private ServiceDAO serviceDAO;
     
    @Override
    public List<Map<String, Object>> selectBoardList() {
        return serviceDAO.selectBoardList();
    }

	@Override
	public int getBoardCount() {
		return serviceDAO.getBoardCount();
	}
	
	@Override
	public BoardBean boardModify(String usr_id) {
		return (BoardBean)serviceDAO.getBoardModify(usr_id);
	}

	@Override
	public void boardInsert(BoardBean boardBean) {
		serviceDAO.boardInsert(boardBean);
	}

	@Override
	public void boardUpdate(BoardBean boardBean) {
		serviceDAO.boardUpdate(boardBean);
	}

	@Override
	public void boardDelete(String usr_id) {
		serviceDAO.boardDelete(usr_id);
	}

	@Override
	public List<MenuItem> selectMenuList() {
		return serviceDAO.selectMenuList();
	}
}