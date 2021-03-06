package jylSystem.mybatis.service;

import java.util.ArrayList;
import java.util.Collection;

import jylSystem.mybatis.dao.LoginDao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements UserDetailsService  {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		
		//로그인 아이디로 패스워드를 가지고 오다.
		String userPwd = sqlSessionTemplate.getMapper(LoginDao.class).selectUserPassWord(username);//호출이 안됨...ㅠㅠㅠ 여기부터 시작~
		if (userPwd == null) {
			throw new UsernameNotFoundException(username + " 사용자를 찾을 수 없습니다.");
		}
		
		//"ROLE_USER" 란 이름으로 권한을 설정한다. 
		Collection<SimpleGrantedAuthority> roles = new ArrayList<SimpleGrantedAuthority>(); 
		roles.add(new SimpleGrantedAuthority("ROLE_USER"));
	 
		//로그인 정보를 리턴한다
		UserDetails user = new User(username, userPwd, roles);
		return user;
	}
	
}


