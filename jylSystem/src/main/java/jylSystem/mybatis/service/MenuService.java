package jylSystem.mybatis.service;

import java.awt.MenuItem;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jylSystem.mybatis.dao.BoardDao;
import jylSystem.mybatis.dao.MenuDao;

@Service
public class MenuService implements MenuDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;	
	
	@Override
	public List<MenuItem> getMenus() {
		return sqlSessionTemplate.getMapper(MenuDao.class).getMenus();
	}

}
