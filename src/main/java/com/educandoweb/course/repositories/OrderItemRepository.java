package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.OrderItem;

//Repositorio de usuario extendendo da especificação do SpringData JpaRepository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
