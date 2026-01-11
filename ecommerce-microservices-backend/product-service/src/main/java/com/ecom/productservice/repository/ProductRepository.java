package main.java.com.ecom.productservice.repository;

import main.java.com.ecom.productservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
