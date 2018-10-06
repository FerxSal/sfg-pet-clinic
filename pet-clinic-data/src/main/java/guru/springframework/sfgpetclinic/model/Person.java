package guru.springframework.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by fernando on 22/09/18.
 */
@Entity
@Table(name="person")
public class Person extends BaseEntity {

    @Column(name="f_name")
    private String firstName;

    @Column(name="l_name")
    private String lastName;

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }
}
