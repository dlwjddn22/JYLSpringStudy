package jylSystem.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import jylSystem.mybatis.dao.AbstractDAO;
 
@Repository("ServiceDAO")
public class ServiceDAO extends AbstractDAO {
 
    @SuppressWarnings("unchecked")
    public List<Map<String, Object>> selectBoardList(int useId) throws Exception{
        return (List<Map<String, Object>>)selectList("board.selectBoardList", useId);
    }
    
    @SuppressWarnings("unchecked")
    public String selectUserPassWord(String userId) throws Exception{
    	return (String)selectOne("login.selectUserPassWord",userId);
//        return (String)selectOne("login.selectUserPassWord", userId);
    }
 
}