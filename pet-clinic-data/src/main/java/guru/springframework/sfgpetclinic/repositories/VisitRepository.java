package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by fernando on 06/10/18.
 */
public interface VisitRepository extends CrudRepository<Visit,Long>{
}
