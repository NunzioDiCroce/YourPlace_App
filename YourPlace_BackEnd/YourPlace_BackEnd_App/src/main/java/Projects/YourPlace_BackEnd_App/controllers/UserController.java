package Projects.YourPlace_BackEnd_App.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import Projects.YourPlace_BackEnd_App.entities.User;
import Projects.YourPlace_BackEnd_App.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	private final UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	// - - - - - - createUser - - - - - -
	public User createUser() {
		return null;

	}

	// - - - - - - getUsers - - - - - -
	@GetMapping("/users")
	public Page<User> getUsers() {
		return null;

	}

	// - - - - - - findUser - - - - - -
	@GetMapping("/{id}")
	public User findUser() {
		return null;

	}

	// - - - - - - updateUser - - - - - -
	@PutMapping("/{id}")
	public User updateUser() {
		return null;

	}

	// - - - - - - deleteUser - - - - - -
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteUser() {

	}

}
