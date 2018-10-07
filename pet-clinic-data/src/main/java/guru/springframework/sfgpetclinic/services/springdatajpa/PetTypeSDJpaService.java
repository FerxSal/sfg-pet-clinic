package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.repositories.PetTypeRepository;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by fernando on 07/10/18.
 */
@Service
public class PetTypeSDJpaService implements PetTypeService {

    private final PetTypeRepository petTypeRepository;


    public PetTypeSDJpaService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public PetType findById(Long id) {
        return petTypeRepository.findById(id).orElse(null);
    }

    @Override
    public PetType save(PetType pet) {
        return petTypeRepository.save(pet);
    }

    @Override
    public Set<PetType> findAll() {

        Set<PetType> petTypes = new HashSet<>();
        petTypeRepository.findAll().forEach(petTypes :: add);

        return petTypes;
    }

    @Override
    public void delete(PetType pet) {
        petTypeRepository.delete(pet);

    }

    @Override
    public void deleteById(Long id) {
        petTypeRepository.deleteById(id);

    }
}
