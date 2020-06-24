package practice.agora.arcitecture.user.agora.dao;

import java.util.List;

import java.util.Map;

import practice.agora.arcitecture.user.agora.model.CommunityUser;

public interface UserDao { 
	
	CommunityUser selectUserByUsername(String username); 
	
	List<Map<String,Object>> insertUser(int id, String username, String password, String nickname);

}
  