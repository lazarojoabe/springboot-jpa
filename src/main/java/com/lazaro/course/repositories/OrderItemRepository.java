package com.lazaro.course.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.lazaro.course.entities.OrderItem;
import com.lazaro.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}

