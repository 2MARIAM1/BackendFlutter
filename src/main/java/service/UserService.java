package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import exception.UserNotFoundException;
import jakarta.transaction.Transactional;
import model.User;
import repo.UserRepository;


@Service
@Transactional
@Component
public class UserService {

	private final UserRepository userRepo;

	@Autowired
	public UserService(UserRepository userRepo) {
		this.userRepo = userRepo;
	}

	public User addUser(User User) {
		return userRepo.save(User);
	}

	public List<User> findAllUsers() {
		return userRepo.findAll();
	}

	public User updateUser(User User) {
		return userRepo.save(User);
	}

	public User findUserById(Long id) throws Throwable {
		return userRepo.findUserById(id)
				.orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
	}

	public void deleteUser(Long id) {
		userRepo.deleteUserById(id);
	}

}
