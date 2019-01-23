package com.example.mains;

import java.util.List;

import com.example.entities.ProductEntity;
import com.example.repositories.ProductRepository;

public class MainApp {

	public static void main(String args[]) {
		ProductEntity productEntity = new ProductEntity();

		productEntity.setName("Chess");
		productEntity.setCode("box");

		productEntity.setCategory("Board");
		productEntity.setPrice(10d);

		ProductRepository productRepository = new ProductRepository();
		productRepository.save(productEntity);

	}
}
