package guru.springframework.sfgpetclinic.services;

/**
 * Created by fernando on 13/10/18.
 */
public interface CrudService<E,T> {

    E findById(T id);

    E save(E entity);

    void delete(E entity);

    void deleteById(T id);

}
