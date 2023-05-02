package com.example.KShop.Repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.KShop.DataBase.Database_table;

@Repository
public interface K_Repositary extends JpaRepository<Database_table,Integer > {

	@Query(value="select * from items_data", nativeQuery = true)
	public List<Database_table> getAllData();
	
    @Query(value="select * from items_data where item_no=?1",nativeQuery=true)
	public List<Database_table> byItemName(@Param("item_no") int num );
}
