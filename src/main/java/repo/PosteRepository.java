package repo;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import model.Poste;
import model.User;

@Repository
public interface PosteRepository extends JpaRepository<Poste, Long>{
	 void deletePosteById(Long id);
}
