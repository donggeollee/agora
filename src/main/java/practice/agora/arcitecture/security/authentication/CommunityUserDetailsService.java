package practice.agora.arcitecture.security.authentication;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import practice.agora.arcitecture.user.agora.dao.UserDao;
import practice.agora.arcitecture.user.agora.model.CommunityUser;
import practice.agora.arcitecture.utils.JsonHelper;

public class CommunityUserDetailsService implements UserDetailsService{
	Logger log = LoggerFactory.getLogger(getClass());
 
	@Autowired
	UserDao userDao;
	 
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		log.info("=================loadUserByUsername==============");
		log.info(":: username : " + username);
		
		try {
			return userDao.selectUserByUsername(username);
		} catch(UsernameNotFoundException e) {
			throw new UsernameNotFoundException("username not found");
		}
	}

}
