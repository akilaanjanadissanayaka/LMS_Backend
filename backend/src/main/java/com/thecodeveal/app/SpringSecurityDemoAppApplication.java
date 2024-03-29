package com.thecodeveal.app;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.thecodeveal.app.entities.Authority;
import com.thecodeveal.app.entities.User;
import com.thecodeveal.app.repository.UserDetailsRepository;

@SpringBootApplication
public class SpringSecurityDemoAppApplication {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private UserDetailsRepository userDetailsRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityDemoAppApplication.class, args);
		System.out.println("You can login now!");
	}


//for testing purposes

//	@PostConstruct
//	protected void init() {
//
//		List<Authority> authorityList=new ArrayList<>();
//
////		authorityList.add(createAuthority("USER","User role"));
//		authorityList.add(createAuthority("ADMIN","Admin role"));
//
//		User user=new User();
//
//		user.setUserName("Madura");
//		user.setFirstName("Madura");
//		user.setLastName("Chamodara");
//
//		user.setPassword(passwordEncoder.encode("Madu1999"));
//		user.setEnabled(true);
//		user.setAuthorities(authorityList);
//
//		userDetailsRepository.save(user);
//
//	}
//
//
//	private Authority createAuthority(String roleCode,String roleDescription) {
//		Authority authority=new Authority();
//		authority.setRoleCode(roleCode);
//		authority.setRoleDescription(roleDescription);
//		return authority;
//	}
//
	

}
