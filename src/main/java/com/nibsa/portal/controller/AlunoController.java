package com.nibsa.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nibsa.portal.bean.Aluno;
import com.nibsa.portal.repository.AlunoRepository;

@RestController
@RequestMapping("aluno")
public class AlunoController {
	
	@Autowired
	AlunoRepository alunoRepository;
	
	@GetMapping
	public List<Aluno> listar(){
		return alunoRepository.findAll();
	}

	@PostMapping
	public Aluno save(Aluno aluno){
		return alunoRepository.save(aluno);
		
	}
	
}
