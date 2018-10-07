package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Speciality;

import java.util.Set;

/**
 * Created by fernando on 07/10/18.
 */
public interface SpecialityService {

    Speciality findById(Long id);

    Speciality save(Speciality speciality);

    Set<Speciality> findAll();

    void delete(Speciality speciality);

    void deleteById(Long id);


}
