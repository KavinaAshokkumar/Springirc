package com.example.Map.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Map.Model.Question;

public interface QuestionRepo extends JpaRepository<Question, Integer> {

}
