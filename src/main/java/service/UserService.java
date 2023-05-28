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

	public User updateUser(Long id, User updatedUser) throws Throwable {
		  
	    User user = userRepo.findUserById(id)
	            .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));

	    // Update the fields of the existing user with the new values
	    user.setFullName(updatedUser.getFullName());
	    user.setCin(updatedUser.getCin());
	    user.setPhoneNumber(updatedUser.getPhoneNumber());
	    user.setEmail(updatedUser.getEmail());
	    user.setPassword(updatedUser.getPassword());
	    user.setRegion(updatedUser.getRegion());
	    user.setRegistration_type(updatedUser.getRegistration_type());
	    user.setExperience(updatedUser.getExperience());
	    user.setAvailability(updatedUser.getAvailability());
	    user.setWorkdays(updatedUser.getWorkdays());
	    user.setCleaning_types(updatedUser.getCleaning_types());
	    user.setEquipment(updatedUser.getEquipment());
	    user.setDescription(updatedUser.getDescription());

	    return userRepo.save(user);
	}

	public User findUserById(Long id) throws Throwable {
		return userRepo.findUserById(id)
				.orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
	}

	public void deleteUser(Long id) {
		userRepo.deleteUserById(id);
	}

}
