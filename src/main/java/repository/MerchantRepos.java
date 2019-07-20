package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import models.Merchants;

@Repository
public interface MerchantRepos extends JpaRepository<Merchants,Integer>{

}
