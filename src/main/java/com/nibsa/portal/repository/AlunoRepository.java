package com.nibsa.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nibsa.portal.bean.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{
    
}
