package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import models.Cart;

@Repository
public interface CartRepos extends JpaRepository<Cart,Integer>{

}
