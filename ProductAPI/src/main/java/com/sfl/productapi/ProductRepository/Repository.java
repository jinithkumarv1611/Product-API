package com.sfl.productapi.ProductRepository;

import com.sfl.productapi.ProductEntity.Product;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Product,Integer> {

}
