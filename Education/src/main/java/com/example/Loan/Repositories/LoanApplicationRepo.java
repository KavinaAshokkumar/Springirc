package com.example.Loan.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Loan.Model.LoanApplicationModel;

@Repository
public interface LoanApplicationRepo extends JpaRepository<LoanApplicationModel,Integer> {

}
