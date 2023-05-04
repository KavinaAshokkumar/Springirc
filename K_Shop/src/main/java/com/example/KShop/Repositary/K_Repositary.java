package com.example.KShop.Repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.KShop.DataBase.Database_table;

import jakarta.transaction.Transactional;

@Repository
public interface K_Repositary extends JpaRepository<Database_table,Integer > {

	@Query(value="select * from items_data", nativeQuery = true)
	public List<Database_table> getAllData();
	
    @Query(value="select * from items_data where item_no=?1",nativeQuery=true)
	public List<Database_table> byItemName(@Param("item_no") int num );
	
	//JPQL uses model name
	@Query(value="select c from Database_table c")
	List<Database_table> getAll();
	
	@Query(value="select c from Database_table c where c.itemNo=?1")
	public List<Database_table> jpql(@Param("itemNo") int num);
	
	@Modifying
	@Transactional
	@Query(value="delete from Database_table c where c.itemNo=?1 and c.item=?2")
	Integer deleteDetails (@Param("itemNo") int num,@Param("item") String item);
	
	@Modifying
	@Transactional
	@Query(value="update Database_table c set c.item=?1 where itemNo=?2")
	Integer updateDetails(@Param("item")String item,@Param("itemNo") int num );
	
}

