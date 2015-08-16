package jylSystem.mybatis.service;

import java.util.List;
import java.util.Map;

public interface SQLService {
	List<Map<String, Object>> selectBoardList();

	int getBoardCount(); 
	
}