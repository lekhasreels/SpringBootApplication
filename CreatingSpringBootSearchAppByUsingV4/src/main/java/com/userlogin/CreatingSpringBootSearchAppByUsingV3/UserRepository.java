package com.userlogin.CreatingSpringBootSearchAppByUsingV3;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
    List<User> findByUsername(String username);

	List<User> findByAddressStreetName(String streetName);

	

}
