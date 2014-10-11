package springJDBC.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springJDBC.com.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
