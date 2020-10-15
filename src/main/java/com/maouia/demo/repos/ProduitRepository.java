package com.maouia.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maouia.demo.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
