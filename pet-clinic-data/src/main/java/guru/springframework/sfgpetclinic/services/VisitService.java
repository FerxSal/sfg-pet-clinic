package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Visit;

import java.util.Set;

/**
 * Created by fernando on 13/10/18.
 */
public interface VisitService extends CrudService<Visit,Long>{

    Visit findById(Long id);

    Visit save(Visit visit);

    Set<Visit> findAll();

    void delete(Visit visit);

    void deleteById(Long id);

}
