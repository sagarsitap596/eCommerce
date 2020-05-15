package com.easyshop.ssagaronlineshop.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.easyshop.ssagaronlineshop.model.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {

}
