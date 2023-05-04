package com.example.Map.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Map.Model.Question;
import com.example.Map.Repository.QuestionRepo;

@RestController
@RequestMapping("otm")
public class Ques_controller {
	@Autowired
	public QuestionRepo qrep;
	
	@PostMapping("/saveDetails")
	public String saveDetails(@RequestBody Question q)
	{
		qrep.save(q);
		return "Data is saved";
	}
	
	@GetMapping("/getDetails")
	public List<Question> getDetails()
	{
		return qrep.findAll();
	}

}
