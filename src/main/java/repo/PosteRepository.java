package repo;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import model.Poste;
import model.User;

@Repository
public interface PosteRepository extends JpaRepository<Poste, Long>{
	 void deletePosteById(Long id);
	 List<Poste> getPostsByUserId(Long userId);
	 
	 @Query("SELECT p FROM Poste p WHERE p.user.id = :userId")
	    List<Poste> findByUserId(Long userId);
}
