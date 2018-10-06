package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by fernando on 06/10/18.
 */
public interface PetRepository extends CrudRepository<Pet,Long>{
}
