package Projects.YourPlace_BackEnd_App.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import Projects.YourPlace_BackEnd_App.entities.User;
import Projects.YourPlace_BackEnd_App.repositories.UserRepository;

@Service
public class UserService {

	private final UserRepository userRepository;

	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	// - - - - - - createUser - - - - - -
	public User createUser() {
		return null;

	}

	// - - - - - - getUsers - - - - - -
	public Page<User> getUsers() {
		return null;

	}

	// - - - - - - findUser - - - - - -
	public User findUser() {
		return null;

	}

	// - - - - - - updateUser - - - - - -
	public User updateUser() {
		return null;

	}

	// - - - - - - deleteUser - - - - - -
	public void deleteUser() {

	}

}
