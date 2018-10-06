package guru.springframework.sfgpetclinic.model;

import javax.persistence.Table;
import java.time.LocalDate;

/**
 * Created by fernando on 22/09/18.
 */
@Table(name="pet")
public class Pet extends BaseEntity {


    private PetType petType;

    private Owner owner;

    private LocalDate bithdate;


    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBithdate() {
        return bithdate;
    }

    public void setBithdate(LocalDate bithdate) {
        this.bithdate = bithdate;
    }
}
