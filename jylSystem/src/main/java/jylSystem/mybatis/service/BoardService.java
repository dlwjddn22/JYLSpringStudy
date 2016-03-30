package jylSystem.mybatis.service;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jylSystem.mybatis.dao.BoardDao;
import jylSystem.vo.BoardBean;
import jylSystem.vo.MenuItem;

@Service
public class BoardService implements BoardDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;	
	
	@Override
	public List<Map<String, Object>> selectBoardList() {
		return sqlSessionTemplate.getMapper(BoardDao.class).selectBoardList();
	}

	@Override
	public int getBoardCount() {
		return sqlSessionTemplate.getMapper(BoardDao.class).getBoardCount();
	}

	@Override
	public BoardBean boardModify(String usr_id) {
		return sqlSessionTemplate.getMapper(BoardDao.class).boardModify(usr_id);
	}

	@Override
	public void boardInsert(BoardBean boardBean) {
		sqlSessionTemplate.getMapper(BoardDao.class).boardInsert(boardBean);
	}

	@Override
	public void boardUpdate(BoardBean boardBean) {
		sqlSessionTemplate.getMapper(BoardDao.class).boardUpdate(boardBean);
	}

	@Override
	public void boardDelete(String usr_id) {
		sqlSessionTemplate.getMapper(BoardDao.class).boardDelete(usr_id);
	}

	@Override
	public List<MenuItem> selectMenuList() {
		// TODO Auto-generated method stub
		return null;
	}

}
