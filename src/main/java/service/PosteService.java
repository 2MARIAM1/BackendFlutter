package service ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import model.Poste;
import repo.PosteRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@Component
public class PosteService {

    private final PosteRepository posteRepository;

    @Autowired
    public PosteService(PosteRepository posteRepository) {
        this.posteRepository = posteRepository;
    }

    public List<Poste> getAllPostes() {
        return posteRepository.findAll();
    }

    public Poste getPosteById(Long id) {
        return posteRepository.findById(id).orElse(null);
    }

    public Poste createPoste(Poste poste) {
        return posteRepository.save(poste);
    }

    public Poste updatePoste(Poste poste) {
        return posteRepository.save(poste);
    }

    public void deletePoste(Long id) {
        posteRepository.deleteById(id);
    }
    public List<Poste> getPostsByUserId(Long userId) {
        return posteRepository.findByUserId(userId);
    }
}
