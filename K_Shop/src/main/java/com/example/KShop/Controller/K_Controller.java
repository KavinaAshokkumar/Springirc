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

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class K_Controller {

	@Autowired
	public K_Service kser;
	
	@Tag(name="CREATE DATA",description="To insert data in the required feilds of the database")
	@PostMapping("/K_ShopData")
	public Database_table addDetails(@RequestBody Database_table Data)
	{
		return kser.saveInfo(Data);
	}
	
	@Tag(name="GET DATA",description="To get data in the required feilds of the database ")
	@GetMapping("/getK_Shop")
	public List <Database_table> getDetails()
	{
		return kser.getInfo();
	}
	
	@Tag(name="UPDATE DATA",description="To update data in the required feilds of the database ")
	@PutMapping("/UpdateK_Shop") 
	public Database_table updateDetails(@RequestBody Database_table Datano)
	{
		return kser.updateInfo(Datano);
	}
	
	@Tag(name="DELETE DATA",description="To delete data in the required feilds of the database by using primary key and path variable for the URL")
	@DeleteMapping("/deleteKShop/{itemNo}")
	public String deleteDetails(@PathVariable ("itemNo") int itno)
    {
	kser.deleteInfo(itno);
	return " Item Number " + itno + " is deleted ";
    }
	
	@Tag(name="DELETE  DATA",description="To delete data in the required feilds of the database by using Query")
	@DeleteMapping("/deleteByReq")
	public String deleteByRequestPara(@RequestParam("itemNo")int itNo)
	{
		kser.deleteInfo(itNo);
		return " Item Number "+ itNo + " is deleted ";
	}
	//sort by descending order
	
	@Tag(name="SORTING DATA",description="To sort data in ascending or descending order for the specific feilds of the database]")
	@GetMapping("/sortdesc/{item}")
	public List<Database_table> sortPlayer(@PathVariable("item") String Item)
	{
		return kser.sortdesc(Item);
	}
	//pagination
	
	@Tag(name="PAGINATION",description="To align data as smaller capsules as pages for user convenience")
	@GetMapping("/paginationSorting/{pno}/{psize}")
	public List<Database_table> paginationData(@PathVariable("pno") int pno, @PathVariable("psize") int psize)
	{
		return kser.paginationData(pno, psize);
	}
	
	@Tag(name="PAGINATION AND SORTING",description="To sort and align data according to the user convenience as pages to reduce complexity ")
	//pagination and sorting
	@GetMapping("/paginationSorting/{pno}/{psize}/{item}")
	public List<Database_table> paginationAndSorting(@PathVariable ("pno") int pno,@PathVariable("psize") int psize,@PathVariable("item") String item)
	{
		return kser.paginationAndSorting(pno, psize, item);
	}
	@Autowired
	public K_Repositary krepo;
	
	@Tag(name="SAVE DATA(Native Query)",description="To save data which is stored in the datatbase ")
	@GetMapping("SaveK_shop")
	public List<Database_table> getD()
	{
		return krepo.getAllData();
	}
	
	@Tag(name="FETCH DATA",description="To get data that is stored in the database ")
	@GetMapping("byItemName/{item_no}")
	public List<Database_table> getName(@PathVariable("item_no") int num)
	{
		return krepo.byItemName(num);
	}
	
	
	@PutMapping("/updated/{item}/{itemNo}")
	@Tag(name="Update statement using Java Persistence Query Language",description="JPQL")
	public String updateDetails(@PathVariable("item") String item,@PathVariable
			("itemNo") int num)
	{
		krepo.updateDetails(item,num);
		return "Updated";
	}
	
	@DeleteMapping("deleted/{itemNo}/{item}")
	@Tag(name="delete statement using Java Persistence Query Language",description="JPQL")
	public String deleteK(@PathVariable("itemNo") int num,@PathVariable("item") String item)
	{
		krepo.deleteDetails(num, item);
		return "Deleted";
	}
	@GetMapping("jpql")
	@Tag(name="select statement using Java Persistence Query Language",description="JPQL")
	public List<Database_table> getJp()
	{
		return krepo.getAll();
	}
	
	@GetMapping("jp/{itemNo}")
	@Tag(name="select statement using Java Persistence Query Language by itemNo",description="JPQL")
	public List<Database_table> getjpql(@PathVariable("ItemNo") int num)
	{
		return krepo.jpql(num);
	}
	}
	
    
	

