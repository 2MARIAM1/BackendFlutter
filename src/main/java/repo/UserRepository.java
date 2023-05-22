package repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	void deleteUserById(Long id);

	Optional<User> findUserById(Long id);
	
}