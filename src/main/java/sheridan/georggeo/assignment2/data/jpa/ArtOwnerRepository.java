package sheridan.georggeo.assignment2.data.jpa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
        path = "owners",
        collectionResourceRel = "owners",
        itemResourceRel = "owner"
)
public interface ArtOwnerRepository extends JpaRepository<ArtOwner, Integer> {
}
