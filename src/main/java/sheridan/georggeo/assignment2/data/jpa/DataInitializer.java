package sheridan.georggeo.assignment2.data.jpa;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class DataInitializer {

    private final ArtOwnerRepository artOwnerRepository;

    public DataInitializer(ArtOwnerRepository artOwnerRepository) {
        this.artOwnerRepository = artOwnerRepository;
    }

    @PostConstruct
    public void init(){

        ArtOwner patricia = new ArtOwner("Max", "Revier");
        patricia.addArt(new Art("Charlie", "emoji", 3, "emoji.jpg"));
        patricia.addArt(new Art("Max", "cross", 2, "maxrevier.jpg"));
        artOwnerRepository.save(patricia);

        ArtOwner lisa = new ArtOwner("Lars", "Anderson");
        lisa.addArt(new Art("Cathedral", "cathedral", 6,"snacte.jpg"));
        artOwnerRepository.save(lisa);

        ArtOwner kimberly = new ArtOwner("Kimberly", "Green");
        artOwnerRepository.save(kimberly);

        ArtOwner brenda = new ArtOwner("Victor", "Chevalier");
        brenda.addArt(new Art("Emoji", "emoji", 3, "emoji.jpg"));
        brenda.addArt(new Art("Farmer with a Shotgun", "farmer", 5, "farmwithsg.jpg"));
        brenda.addArt(new Art("Animals", "animal", 2, "monke.jpg"));
        brenda.addArt(new Art("Marx", "painting", 1, "mikebird.jpg"));

        artOwnerRepository.save(brenda);

        artOwnerRepository.flush();
    }
}
