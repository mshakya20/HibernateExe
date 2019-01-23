package com.example.mains;

import com.example.entities.AddressEntity;
import com.example.entities.AuthorEntity;
import com.example.repositories.AuthorRepository;

public class OneToOneMainApp {

	public static void main(String[] args) {
		AuthorEntity author =new AuthorEntity();
		author.setName("Mikesh");
		author.setGender("male");
		author.setEmail("mshakya20@gmail.com");
	
		AddressEntity address = new AddressEntity();
		address.setLine1("2842Dover");
		address.setLine2("302");
		address.setCity("city");
		address.setState("VA");
		address.setZipcode(22042);
		
		
		author.setAddress(address);
		AuthorRepository authorRepository =new AuthorRepository();
		authorRepository.save(author);

	}

}
