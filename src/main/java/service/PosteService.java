package service;
import java.util.Date;

import org.springframework.stereotype.Service;

import model.Poste;
import model.User;
import repo.PosteRepository;
import repo.UserRepository;

@Service
public class PosteService {
    private final PosteRepository posteRepository;
	private UserRepository UserRepo;
    public PosteService(PosteRepository posteRepository) {
        this.posteRepository = posteRepository;
    }

    public void createPoste(Long userId, String description, String cleaningType, String location, Long surface, Long serviceDate, Date date, boolean booked) {
        // Vérifier si l'utilisateur existe
        User user = UserRepo.findById(userId).orElseThrow(() -> new RuntimeException("Utilisateur introuvable"));

        // Créer un nouveau poste
        Poste poste = new Poste(userId, description, cleaningType, location, surface, serviceDate, date, booked, user);

        // Enregistrer le poste
        posteRepository.save(poste);
    }
}
