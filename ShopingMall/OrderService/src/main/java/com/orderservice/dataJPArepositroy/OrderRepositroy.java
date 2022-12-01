package com.orderservice.dataJPArepositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orderservice.model.Order;
@Repository
public interface OrderRepositroy extends JpaRepository<Order, Integer>{


}
