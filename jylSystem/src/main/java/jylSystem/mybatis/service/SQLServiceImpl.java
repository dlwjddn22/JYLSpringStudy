package jylSystem.mybatis.service;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jylSystem.mybatis.dao.ServiceDAO;
 
@Service
public class SQLServiceImpl implements SQLService{
    Logger log = Logger.getLogger(this.getClass());
     
    @Autowired
    private ServiceDAO serviceDAO;
     
    @Override
    public List<Map<String, Object>> selectBoardList(int useId) throws Exception {
        return serviceDAO.selectBoardList(useId);
    } 
}