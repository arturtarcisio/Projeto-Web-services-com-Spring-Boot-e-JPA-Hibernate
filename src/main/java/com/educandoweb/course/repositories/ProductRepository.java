package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Product;

//Repositorio de usuario extendendo da especificação do SpringData JpaRepository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
