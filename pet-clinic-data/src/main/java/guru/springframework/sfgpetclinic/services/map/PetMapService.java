package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by fernando on 14/10/18.
 */
@Service
public class PetMapService extends AbstractMapService<Pet,Long> implements PetService{


    @Override
    public Pet findById(Long id) {
        return null;
    }

    @Override
    public Pet save(Pet pet) {
        return null;
    }

    @Override
    public Set<Pet> findAll() {
        return null;
    }

    @Override
    public void delete(Pet pet) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
