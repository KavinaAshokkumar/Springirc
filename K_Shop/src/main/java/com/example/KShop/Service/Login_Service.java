package com.example.KShop.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.KShop.DataBase.Model_Login;
import com.example.KShop.Repositary.Login_Repositary;



@Service
public class Login_Service {
	
	@Autowired
	private Login_Repositary repositary;
	
	public String checkLogin(String uname,String pwd)
	{
		Model_Login user= repositary.findByuname(uname);
		if(user==null)
		{
			return "User Not Found";
		}
		else
		{
			if(user.getPwd().equals(pwd))
			{
				return "Login Successful";
			}
			else
			{
				return "Login Failed";
			}
		}
		
	}
	public Model_Login addUser(Model_Login kavinaShop)
	{
		return repositary.save(kavinaShop);
	}
	public List<Model_Login> getUser()
	{
		return repositary.findAll();
	}

}
