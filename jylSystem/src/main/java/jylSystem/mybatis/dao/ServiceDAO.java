package jylSystem.mybatis.dao;

import java.util.List;
import java.util.Map;

import jylSystem.bean.BoardBean;

import org.springframework.stereotype.Repository;
 
@Repository
public class ServiceDAO extends AbstractDAO {
 
    @SuppressWarnings("unchecked")
    public List<Map<String, Object>> selectBoardList() {
        return (List<Map<String, Object>>) selectList("board.selectBoardList");
    }
    
    public String selectUserPassWord(String userId) {
    	return (String) selectOne("login.selectUserPassWord",userId);
    }

	public int getBoardCount() {
		return (Integer) selectOne("board.getBoardCount");
	}
	
	@SuppressWarnings("unchecked")
	public BoardBean getBoardModify(String usr_id) {
		return (BoardBean) selectOne("board.boardModify", usr_id);
	}

	public void boardInsert(BoardBean boardBean) {
		insert("board.boardInsert", boardBean);
	}

	public void boardUpdate(BoardBean boardBean) {
		update("board.boardUpdate", boardBean);
	}

	public void boardDelete(String usr_id) {
		delete("board.boardDelete", usr_id);
	}
 
}