package com.example.KShop.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.KShop.DataBase.Database_table;

@Repository
public interface K_Repositary extends JpaRepository<Database_table,Integer > {

}
