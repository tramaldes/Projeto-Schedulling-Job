package com.telefonica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telefonica.model.Modelagem;

@Repository
public interface Repositorio extends JpaRepository<Modelagem, Long> {

	//public Modelagem findByIdCodigoJob(Long codigoJob);
 
 }
