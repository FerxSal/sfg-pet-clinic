package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Visit;
import guru.springframework.sfgpetclinic.services.VisitService;

import java.util.Set;

/**
 * Created by fernando on 13/10/18.
 */
public class VisitMapService extends AbstractMapService<Visit,Long> implements VisitService{


    @Override
    public Visit findById(Long id) {
        return null;
    }

    @Override
    public Visit save(Visit vet) {
        return null;
    }

    @Override
    public Set<Visit> findAll() {
        return null;
    }

    @Override
    public void delete(Visit vet) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
