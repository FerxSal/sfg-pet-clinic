package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.PetType;

import java.util.Set;

/**
 * Created by fernando on 07/10/18.
 */
public interface PetTypeService {

    PetType findById(Long id);

    PetType save(PetType pet);

    Set<PetType> findAll();

    void delete(PetType pet);

    void deleteById(Long id);


}
