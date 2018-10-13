package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.services.SpecialityService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by fernando on 14/10/18.
 */
@Service
public class SpecialityMapService extends  AbstractMapService<Speciality,Long> implements SpecialityService {


    @Override
    public Speciality findById(Long id) {
        return null;
    }

    @Override
    public Speciality save(Speciality speciality) {
        return null;
    }

    @Override
    public Set<Speciality> findAll() {
        return null;
    }

    @Override
    public void delete(Speciality speciality) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
