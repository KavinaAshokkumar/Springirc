package com.example.KShop.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.KShop.DataBase.Database_table;
import com.example.KShop.Repositary.K_Repositary;

@Service
public class K_Service {

	@Autowired
	public K_Repositary krep;
	public Database_table saveInfo(Database_table im)
	{
		return krep.save(im);
		
		}
	public List <Database_table > getInfo()
	{
		return krep.findAll();
	}
	public Database_table updateInfo(Database_table dataK)
	{
		return krep.saveAndFlush(dataK);
	}
	public void deleteInfo( int itemNo)
	{
		krep.deleteById(itemNo);
	}
	//sorting
	
	public List<Database_table> sortdesc(String item)
	{
		return krep.findAll(Sort.by(item).descending());
	}
	//pagination
	
	public List<Database_table> paginationData(int pageNo, int pageSize)
	{
		Page<Database_table> p=krep.findAll(PageRequest.of(pageNo, pageSize));
		return p.getContent();
	}
	//Pagination and sorting
	
	public List<Database_table> paginationAndSorting(int pageNo,int pageSize,String item)
	{
		Page<Database_table> p=krep.findAll(PageRequest.of(pageNo,pageSize,Sort.by(item).descending()));
		return p.getContent();
	}
	}
	
