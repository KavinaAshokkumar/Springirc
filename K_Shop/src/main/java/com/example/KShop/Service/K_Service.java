package com.example.KShop.Service;

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
	public List<>
	}
	
