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
import com.example.KShop.Repositary.K_Repositary;
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
	@DeleteMapping("/deleteByReq")
	public String deleteByRequestPara(@RequestParam("itemNo")int itNo)
	{
		kser.deleteInfo(itNo);
		return " Item Number "+ itNo + " is deleted ";
	}
	//sort by descending order
	
	@GetMapping("/sortasc/{item}")
	public List<Database_table> sortPlayer(@PathVariable("item") String Item)
	{
		return kser.sortdesc(Item);
	}
	//pagination
	@GetMapping("/paginationSorting/{pno}/{psize}")
	public List<Database_table> paginationData(@PathVariable("pno") int pno, @PathVariable("psize") int psize)
	{
		return kser.paginationData(pno, psize);
	}
	
	//pagination and sorting
	@GetMapping("/paginationSorting/{pno}/{psize}/{item}")
	public List<Database_table> paginationAndSorting(@PathVariable ("pno") int pno,@PathVariable("psize") int psize,@PathVariable("item") String item)
	{
		return kser.paginationAndSorting(pno, psize, item);
	}
	@Autowired
	public K_Repositary krepo;
	
	@GetMapping("SaveK_shop")
	public List<Database_table> getD()
	{
		return krepo.getAllData();
	}
	
	@GetMapping("byItemName/{item_no}")
	public List<Database_table> getName(@PathVariable("item_no") int num)
	{
		return krepo.byItemName(num);
	}
	
	
    
	
}
