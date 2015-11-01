package jylSystem.mybatis.service;

import java.util.List;
import java.util.Map;

import jylSystem.bean.BoardBean;
import jylSystem.spring.controller.BoardController;

public interface SQLService {
	List<Map<String, Object>> selectBoardList();
	int getBoardCount();
	BoardBean boardModify(String usr_id);
	void boardInsert(BoardBean boardBean);
	void boardUpdate(BoardBean boardBean);
	void boardDelete(String usr_id);
}