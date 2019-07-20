package repository;

import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import models.Users;


@Repository
public interface UserRepos extends JpaRepository<Users, Integer> {


	@Query(value = "SELECT email,password,user_type FROM users WHERE email = :email", nativeQuery = true)
    Map<String,String> findUserByName(@Param("email") String user);
}
