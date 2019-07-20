package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import models.Images;

@Repository
public interface ImageRepos extends JpaRepository<Images,Integer>  {

}
