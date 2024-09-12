package com.shyloostyle.dtodemo;

import com.shyloostyle.dtodemo.model.Location;
import com.shyloostyle.dtodemo.model.User;
import com.shyloostyle.dtodemo.repository.LocationRepository;
import com.shyloostyle.dtodemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DtoDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DtoDemoApplication.class, args);
	}
	@Autowired
	UserRepository userRepository;

	@Autowired
	LocationRepository locationRepository;
	@Override
	public void run(String... args) throws Exception {
		Location location = new Location();
		location.setPlace("Pune");
		location.setDescription("pune is great place to live");
		location.setLongitude(30.7);
		location.setLatitude(543.12);
		locationRepository.save(location);

		User user1 = new User();
		user1.setFirstName("Shri");
		user1.setLastName("Madari");
		user1.setEmail("shri@gmail.com");
		user1.setPassword(987876787);
		user1.setLocation(location);
		userRepository.save(user1);

		User user2 = new User();
		user2.setFirstName("shailu");
		user2.setLastName("Madri");
		user2.setEmail("shailu@gmail.com");
		user2.setPassword(987809876);
		user2.setLocation(location);
		userRepository.save(user2);
	}
}
