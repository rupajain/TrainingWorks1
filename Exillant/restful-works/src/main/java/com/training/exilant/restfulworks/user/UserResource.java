package com.training.exilant.restfulworks.user;

import java.lang.reflect.Method;
import java.net.URI;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.hateoas.mvc.ControllerLinkBuilderFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
//user gives users
//userId gives obe user--GET
//Users POST

import com.training.exilant.restfulworks.exception.UserNotFoundException;

@RestController
public class UserResource {
	@Autowired
	private UserDAOService userDAOService;

	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userDAOService.getAllUsers();
	}

	@GetMapping("/userold/{userId}")
	public User getoneUser(@PathVariable int userId) {

		User getUser = userDAOService.getUser(userId);

		if (getUser == null) {
			throw new UserNotFoundException("id..." + userId);
		}
		return getUser;
	}

	/////////////////
	@GetMapping("/user/{userId}")
	public Resource<User> getoneUserV2(@PathVariable int userId) {

		User getUser = userDAOService.getUser(userId);

		if (getUser == null) {
			throw new UserNotFoundException("id..." + userId);
		}

		// give the link for getting all users
		// with metadata "all-users"
		// SERVER_PATH+"/users

		Resource<User> resource = new Resource<User>(getUser);

		ControllerLinkBuilder linkTo = new ControllerLinkBuilderFactory()
				.linkTo(methodOn(this.getClass()).getAllUsers());
		resource.add(linkTo.withRel("all-users"));

		ControllerLinkBuilder linkTo1 = new ControllerLinkBuilderFactory()
				.linkTo(methodOn(this.getClass()).getoneUser(userId));
		resource.add(linkTo1.withRel("all-users"));
		resource.add(linkTo1.withRel("get-another-way"));
		return resource;
	}

	// @PostMapping("/users")
	// public void createUser(@RequestBody User user) {
	// User savedUser = userDAOService.saveUser(user);
	// System.out.println("saved user " + savedUser);
	//
	// }

	@PostMapping("/usersv2")
	public ResponseEntity<Object> createUserResponseCode(@RequestBody User user) {
		User savedUser = userDAOService.saveUser(user);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{userId}")
				.buildAndExpand(savedUser.getUserId()).toUri();

		return ResponseEntity.created(location).build();

	}

	@PostMapping("/users/delete/{userId}")
	public void deleteUser(@PathVariable int userId) {
		User deleteUser = userDAOService.deleteUser(userId);
		System.out.println("deleted user " + deleteUser);

	}

	@PostMapping("/users/update/{userId}")
	public void updateUser(@PathVariable int userId, @RequestBody User user) {
		User updateUser = userDAOService.updateUser(userId, user);
		System.out.println("updated user " + updateUser);

	}
	//////////////////////////

	@PostMapping("/users")
	public  Resource<User> createUser(@RequestBody User user) {
		User savedUser = userDAOService.saveUser(user);
		ControllerLinkBuilder linkTo = new ControllerLinkBuilderFactory()
				.linkTo(methodOn(this.getClass()).getAllUsers());
		Resource<User> resource = new Resource<User>(savedUser);
		resource.add(linkTo.withRel("select-user"));
		System.out.println("saved user " + savedUser);
		return resource;
	}

}
