package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;

//Repositorio de usuario extendendo da especificação do SpringData JpaRepository
public interface UserRepository extends JpaRepository<User, Long>{

}
