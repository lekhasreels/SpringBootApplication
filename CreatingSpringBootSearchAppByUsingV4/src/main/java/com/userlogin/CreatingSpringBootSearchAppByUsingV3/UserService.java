package com.userlogin.CreatingSpringBootSearchAppByUsingV3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	    private UserRepository userRepository;
	@Autowired
    private AddressRepository addressRepository;
	
	public List<User> searchByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public List<User> searchByStreetName(String streetName) {
        return userRepository.findByAddressStreetName(streetName);
    }

	public AddressRepository getAddressRepository() {
		return addressRepository;
	}

	public void setAddressRepository(AddressRepository addressRepository) {
		this.addressRepository = addressRepository;
	}
}
