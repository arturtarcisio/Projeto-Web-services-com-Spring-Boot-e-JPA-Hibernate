package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Category;

//Repositorio de usuario extendendo da especificação do SpringData JpaRepository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
