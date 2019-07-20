package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import models.Products;

@Repository
public interface ProductRepos extends JpaRepository<Products, Integer>  {
	@Query(value = "SELECT * FROM products WHERE name LIKE %:product%", nativeQuery = true)
    List<Products> findProductByName(@Param("product") String product);
}
