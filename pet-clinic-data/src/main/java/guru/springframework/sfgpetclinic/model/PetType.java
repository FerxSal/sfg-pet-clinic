package guru.springframework.sfgpetclinic.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by fernando on 22/09/18.
 */
@Entity
@Table(name="types")
public class PetType extends BaseEntity {


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
