package Projects.YourPlace_BackEnd_App.services;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import Projects.YourPlace_BackEnd_App.entities.User;
import Projects.YourPlace_BackEnd_App.exceptions.NotFoundException;
import Projects.YourPlace_BackEnd_App.payloads.UpdateUserPayload;
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
	public Page<User> getUsers(int page, int size, String sort) {
		return userRepository.findAll(PageRequest.of(page, size, Sort.by(sort)));
	}

	// - - - - - - findUser - - - - - -
	public User findUser(UUID id) {
		Optional<User> user = userRepository.findById(id);
		return user.orElseThrow(() -> new NotFoundException("Item with id " + id + " not found."));
	}

	// - - - - - - updateUser - - - - - -
	public User updateUser(UUID id, UpdateUserPayload payload) {
		User user = findUser(id);
		user.setName(payload.getName());
		user.setSurname(payload.getSurname());
		return userRepository.save(user);
	}

	// - - - - - - deleteUser - - - - - -
	public void deleteUser(UUID id) {
		User user = findUser(id);
		userRepository.delete(user);
	}

}
