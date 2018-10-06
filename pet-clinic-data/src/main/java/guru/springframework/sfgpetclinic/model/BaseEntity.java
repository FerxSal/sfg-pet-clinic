package guru.springframework.sfgpetclinic.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by fernando on 23/09/18.
 */
@MappedSuperclass
public class BaseEntity implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
