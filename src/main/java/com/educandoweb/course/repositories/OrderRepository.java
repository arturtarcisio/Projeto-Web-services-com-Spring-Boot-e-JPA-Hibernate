package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Order;

//Repositorio de usuario extendendo da especificação do SpringData JpaRepository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
