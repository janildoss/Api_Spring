package com.jssdemoApi.jssdemoApi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jssdemoApi.jssdemoApi.entities.Product;

public interface ProductRepository  extends JpaRepository<Product,Long>{

}
