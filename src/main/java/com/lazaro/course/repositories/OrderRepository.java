package com.lazaro.course.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.lazaro.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}

