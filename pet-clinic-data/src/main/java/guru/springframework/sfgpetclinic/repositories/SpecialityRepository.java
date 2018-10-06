package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by fernando on 06/10/18.
 */
public interface SpecialityRepository extends CrudRepository<Speciality,Long> {
}
