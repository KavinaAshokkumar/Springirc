package com.example.KShop.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	}
	
