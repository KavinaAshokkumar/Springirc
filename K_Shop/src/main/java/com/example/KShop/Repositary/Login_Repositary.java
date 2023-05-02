package com.example.KShop.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.KShop.DataBase.Model_Login;

public interface Login_Repositary extends JpaRepository<Model_Login, Integer> {
	Model_Login findByuname(String uname);

}
