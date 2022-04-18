package derek.onelinestoredemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import derek.onelinestoredemo.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
