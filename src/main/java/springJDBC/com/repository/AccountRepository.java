package springJDBC.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springJDBC.com.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Integer>{

}
