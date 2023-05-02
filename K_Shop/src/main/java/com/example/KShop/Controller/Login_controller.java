package com.example.KShop.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.KShop.DataBase.Model_Login;
import com.example.KShop.Service.Login_Service;

@RestController
@RequestMapping("/shops")
public class Login_controller {
	@Autowired
	private Login_Service serv;
	
	@PostMapping("/login")
	public String login(@RequestBody Map<String, String>loginData)
	{
		String uname=loginData.get("uname");
		String pwd=loginData.get("pwd");
		String result = serv.checkLogin(uname, pwd);
	    return result;
	}
	
	@PostMapping("/adduser")
	public Model_Login AddUser(@RequestBody Model_Login kv)
	{
		return serv.addUser(kv);
	}
	@GetMapping
	public List<Model_Login> listAll()
	{
		return serv.getUser();
	}

}
