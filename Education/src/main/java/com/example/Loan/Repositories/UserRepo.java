package com.example.Loan.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Loan.Model.UserModel;

@Repository
public interface UserRepo extends JpaRepository<UserModel, Integer> {

}
