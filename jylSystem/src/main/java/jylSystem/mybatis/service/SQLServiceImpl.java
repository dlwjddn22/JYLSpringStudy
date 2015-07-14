package jylSystem.mybatis.service;

import org.springframework.stereotype.Service;
 

import java.util.List;
import java.util.Map;
 

import javax.annotation.Resource;
 

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import jylSystem.mybatis.dao.ServiceDAO;
 
@Service("SQLService")
public class SQLServiceImpl implements SQLService{
    Logger log = Logger.getLogger(this.getClass());
     
    @Resource(name="ServiceDAO")
    private ServiceDAO ServiceDAO;
     
    @Override
    public List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception {
        return ServiceDAO.selectBoardList(map);
    }
 
}