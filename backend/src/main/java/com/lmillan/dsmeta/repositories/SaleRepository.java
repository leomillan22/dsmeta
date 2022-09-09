package com.lmillan.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lmillan.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
}
