package jylSystem.mybatis.dao;

import java.util.List;
import java.util.Map;

import jylSystem.vo.BoardBean;
import jylSystem.vo.MenuItem;

public interface BoardDao {
	List<Map<String, Object>> selectBoardList();
	int getBoardCount();
	BoardBean boardModify(String usr_id);
	void boardInsert(BoardBean boardBean);
	void boardUpdate(BoardBean boardBean);
	void boardDelete(String usr_id);
}