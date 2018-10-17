package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.services.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by fernando on 14/10/18.
 */
@Service
@Profile({"default", "map"})
public class SpecialityMapService extends  AbstractMapService<Speciality,Long> implements SpecialtyService {


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
