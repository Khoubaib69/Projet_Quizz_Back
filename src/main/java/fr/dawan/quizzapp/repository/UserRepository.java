package fr.dawan.quizzapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import fr.dawan.quizzapp.entities.Users;
import fr.dawan.quizzapp.enums.Roles;
@Repository
public interface UserRepository extends JpaRepository<Users, Long>{
	
	//SELECT * FROM USERS WHERE ROLE=ADMIN
	@Query("FROM Users u where u.role=:role")
	List<Users> findAllByRole (Roles role);
	@Query("FROM Users u where u.userId=:id")
	Users findUserById (long id);
	//@Query (value = "insert into Users (user_id) VALUES (:insertLink,:id)", nativeQuery = true)
	//Users saveOrUpdate(Users user);
		
	
}
