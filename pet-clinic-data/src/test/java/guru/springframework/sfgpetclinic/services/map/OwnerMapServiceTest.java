package guru.springframework.sfgpetclinic.services.map;


import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.PetService;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by fernando on 30/10/18.
 */
class OwnerMapServiceTest {

    OwnerMapService ownerMapService;

    @Autowired
    PetTypeService petTypeService;

    @Autowired
    PetService petService;

    final Long ownerId = 1L;
    final String lastName = "Smith";


    @BeforeEach
    void setUp() {

        ownerMapService = new OwnerMapService(petTypeService, petService);
        ownerMapService.save(Owner.builder().id(ownerId).lastName(lastName).build());
    }

    @Test
    void findByLastName() {
        Long id = 3L;
        Owner owner = ownerMapService.findById(ownerId);
        //owner.setLastName(lastName);
        assertEquals(lastName,owner.getLastName());

    }

    @Test
    void findById() {

        Owner owner = ownerMapService.findById(ownerId);
        assertEquals(ownerId,owner.getId());
    }

    @Test
    void save() {

        Long id = 2L;
        Owner owner2 = Owner.builder().id(id).build();
        Owner saveOwner = ownerMapService.save(owner2);
        assertEquals(id, saveOwner.getId());
    }

    @Test
    void delete() {

        ownerMapService.delete(ownerMapService.findById(ownerId));
        assertEquals(0,ownerMapService.findAll().size());
    }

    @Test
    void deleteById() {

        ownerMapService.deleteById(ownerId);
        assertEquals(0,ownerMapService.findAll().size());

    }

    @Test
    void findAll() {
        Set<Owner> ownerSet =  ownerMapService.findAll();
        assertEquals(1,ownerSet.size());
    }

}