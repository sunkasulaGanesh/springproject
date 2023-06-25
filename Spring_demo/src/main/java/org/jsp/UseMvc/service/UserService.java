package org.jsp.UseMvc.service;

import java.util.List;

import org.jsp.UseMvc.dao.UserDao.UserDao;
import org.jsp.UseMvc.dto.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
	@Autowired
	private UserDao dao;
	
	public User SaveUser(User user)
	{
		
		return dao.SaveUser(user);
		
	}
	public User UpdateUser(User user)
	{
		return dao.UpdateUser(user);
	}
	
	public List<User> FindUser()
	{
		return dao.findAllUSer();
	}
	
	public User verifyUser(long phone,String Password)
	{
		return dao.VerifyUser(phone, Password);
	}
	
	public Boolean deleteUser(int id)
	{
		return dao.DeleteByID(id);
	}

}
