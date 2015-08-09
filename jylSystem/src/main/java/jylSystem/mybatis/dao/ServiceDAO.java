package jylSystem.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
 
@Repository
public class ServiceDAO extends AbstractDAO {
 
    @SuppressWarnings("unchecked")
    public List<Map<String, Object>> selectBoardList(int useId) {
        return (List<Map<String, Object>>) selectList("board.selectBoardList", useId);
    }
    
    public String selectUserPassWord(String userId) {
    	return (String) selectOne("login.selectUserPassWord",userId);
    }

	public int getBoardCount(int useId) {
		return (Integer) selectOne("board.getBoardCount",useId);
	}
 
}