package com.example.KShop.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.KShop.DataBase.Database_table;
import com.example.KShop.Service.K_Service;

@RestController
public class K_Controller {

	@Autowired
	public K_Service kser;
	
	@PostMapping("/K_ShopData")
	public Database_table addDetails(@RequestBody Database_table Data)
	{
		return kser.saveInfo(Data);
	}
	
	@GetMapping("/getK_Shop")
	public List <Database_table> getDetails()
	{
		return kser.getInfo();
	}
	
	@PutMapping("/UpdateK_Shop") 
	public Database_table updateDetails(@RequestBody Database_table Datano)
	{
		return kser.updateInfo(Datano);
	}
	@DeleteMapping("/deleteKShop/{itemNo}")
	public String deleteDetails(@PathVariable ("itemNo") int itno)
    {
	kser.deleteInfo(itno);
	return " Item Number " + itno + " is deleted ";
    }

	
}
