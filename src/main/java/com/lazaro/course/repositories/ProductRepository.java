package com.lazaro.course.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.lazaro.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}

