package com.nibsa.portal.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nibsa.portal.bean.Aluno;

@RestController
@RequestMapping("aluno")
public class AlnoController {
	
	public List<Aluno> listar(){
		return listar();
	}

}
