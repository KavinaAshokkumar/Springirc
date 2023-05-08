package com.example.Loan.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Loan.Model.AdminModel;
import com.example.Loan.Model.UserModel;
import com.example.Loan.Services.LoanServices;

@RestController
public class LoanController {

	@Autowired
    public LoanServices lser;
	  
	//AdminModel
	@PostMapping("/post1")
	public AdminModel postD(AdminModel amodel)
	{
		return lser.post1(amodel);
	}
	@GetMapping("/get1")
	public List<AdminModel> getD()
	{
		return lser.get1();
	}
	@PutMapping("/put1")
	public AdminModel putD(AdminModel amodel1)
	{
		return lser.put1(amodel1);
	}
	@DeleteMapping("/del1/{cpas}")
	public String deleteD(@PathVariable("cpas") int userRole)
	{
		lser.delete1(userRole);
		return "Deleted";
	}
	
		
	//UserModel
	@PostMapping("/post4")
	public UserModel postD3(UserModel amodel7)
	{
		return lser.post4(amodel7);
	}
	@GetMapping("/get4")
	public List<UserModel> getD3()
	{
		return lser.get4();
	}
	@PutMapping("/put4")
	public UserModel putD3(UserModel amodel8)
	{
		return lser.put4(amodel8);
	}
	@DeleteMapping("/del4/{aid}")
	public String deleteD3(@PathVariable("aid") int id)
	{
		lser.delete4(id);
		return "Deleted";
	}
}
