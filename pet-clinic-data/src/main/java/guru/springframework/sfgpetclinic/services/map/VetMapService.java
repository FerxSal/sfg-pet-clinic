package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by fernando on 14/10/18.
 */
@Service
@Profile({"default", "map"})
public class VetMapService extends AbstractMapService<Vet,Long> implements VetService{

    @Override
    public Vet findById(Long id) {
        return null;
    }

    @Override
    public Vet save(Vet vet) {
        return null;
    }

    @Override
    public Set<Vet> findAll() {
        return null;
    }

    @Override
    public void delete(Vet vet) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
