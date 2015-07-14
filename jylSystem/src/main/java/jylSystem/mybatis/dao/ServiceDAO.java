package jylSystem.mybatis.dao;

import java.util.List;
import java.util.Map;
 
import org.springframework.stereotype.Repository;
 
import jylSystem.mybatis.dao.AbstractDAO;
 
@Repository("ServiceDAO")
public class ServiceDAO extends AbstractDAO{
 
    @SuppressWarnings("unchecked")
    public List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception{
        return (List<Map<String, Object>>)selectList("board.selectBoardList", map);
    }
 
}