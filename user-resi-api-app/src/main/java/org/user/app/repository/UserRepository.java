package org.user.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.user.app.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	//finder/query methods
	public List<User> findByCity(String cityName);
	public User findByEmail(String email);
	public List<User> findByNameLike(String name);
	
	//JPQL queries - @Query - object oriented version of sql - deals with properties and class name
	
	@Query("select u from User u where u.name=?1")
	public List<User> getUsersByName(String name);
	
	@Query("select u from User u where u.name=?1 and u.city=?2")
	public List<User> getUsersByNameAndCity(String uname,String city);
	
	
	//JPQL native query
	@Query(value = "select * from user", nativeQuery = true)
	public List<User> getAllUsers();
}
