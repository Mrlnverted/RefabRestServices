package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import models.Orders;

@Repository
public interface OrderRepos extends JpaRepository <Orders,Integer> {

}
