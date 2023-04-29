package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.LoginRepo;
import com.example.demo.model.Login;

@Service
public class LoginService {
	@Autowired
	LoginRepo ls;
	public String loginCheckData(String username,String password)
	{

		Login user = ls.findByusername(username);
		if(user == null)
		{
			return "No User Found/nPlease Try Again!!!!";
		}
		else
		{
			if(user.getPassword().equals(password))
			{
				return "Login Successful";
			}
			else
			{
				return "Login Failed";
			}
		}
		
	}

}


