package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.repositories.SpecialityRepository;
import guru.springframework.sfgpetclinic.services.SpecialityService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by fernando on 07/10/18.
 */
@Service
public class SpecialitySDJpaService implements SpecialityService{


    private final SpecialityRepository specialityRepository;

    public SpecialitySDJpaService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Speciality findById(Long id) {
        return specialityRepository.findById(id).orElse(null);
    }

    @Override
    public Speciality save(Speciality speciality) {
        return specialityRepository.save(speciality);
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();
        specialityRepository.findAll().forEach(specialities::add);

        return specialities;
    }

    @Override
    public void delete(Speciality speciality) {
        specialityRepository.delete(speciality);

    }

    @Override
    public void deleteById(Long id) {
        specialityRepository.deleteById(id);

    }
}
