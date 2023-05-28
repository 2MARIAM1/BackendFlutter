package repo;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import model.Poste;

@Repository
public class PosteRepository {

    @Autowired
    private EntityManager entityManager;

    public void save(Poste poste) {
        entityManager.persist(poste);
    }

    public Poste findById(Long id) {
        return entityManager.find(Poste.class, id);
    }

    public void deleteById(Long id) {
        Poste poste = findById(id);
        if (poste != null) {
            entityManager.remove(poste);
        }
    }
}
