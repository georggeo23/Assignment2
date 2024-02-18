package sheridan.georggeo.assignment2.data.jpa;

import com.fasterxml.jackson.annotation.JsonGetter;
import jakarta.persistence.*;

@Entity
public class Art {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id = null;

    private String name = "";

    @Column(name = "art_kind")
    private String artKind = "";

    private Integer age;

    private String image = null;

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private ArtOwner owner = null;

    @JsonGetter
    Integer getOwnerId(){
        return owner.getId();
    }

    public Art(String name, String artKind, Integer age, String image) {
        this.name = name;
        this.artKind = artKind;
        this.age = age;
        this.image = image;
    }

    public Art() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtKind() {
        return artKind;
    }

    public void setArtKind(String artKind) {
        this.artKind = artKind;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ArtOwner getOwner() {
        return owner;
    }

    public void setOwner(ArtOwner owner) {
        this.owner = owner;
    }
}