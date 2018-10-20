package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Owner;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class OwnerMapServiceTest {


    public static final long OWNER_ID = 1l;
    public static final String LAST_NAME = "Smith";
    OwnerMapService ownerMapService;

    @Before
    public void setUp() throws Exception {
        ownerMapService = new OwnerMapService(new PetTypeMapService(), new PetMapService());
        Owner owner = new Owner();
        owner.setId(1L);
        owner.setLastName(LAST_NAME);
        ownerMapService.save(owner);
    }

    @Test
    public void findAll() throws Exception {
        Set<Owner> owners = ownerMapService.findAll();
        assertEquals(1, owners.size());
    }

    @Test
    public void findById() throws Exception {
        Owner owner = ownerMapService.findById(OWNER_ID);
        assertEquals(OWNER_ID, (Long)owner.getId(), 0.0);
    }

    @Test
    public void save() throws Exception {
        Owner owner2 = new Owner();
        long ownerId = 2L;
        owner2.setId(ownerId);
        Owner savedOwner2 = ownerMapService.save(owner2);

        assertEquals(ownerId, savedOwner2.getId(), 0.0);
    }

    @Test
    public void delete() throws Exception {
        ownerMapService.delete(ownerMapService.findById(OWNER_ID));
        assertEquals(0, ownerMapService.findAll().size());
    }

    @Test
    public void deleteById() throws Exception {
        ownerMapService.deleteById(OWNER_ID);
        assertEquals(0, ownerMapService.findAll().size());
    }

    @Test
    public void findByLastName() throws Exception {
        Owner owner = ownerMapService.findByLastName(LAST_NAME);

        assertNotNull(owner);
        assertEquals(OWNER_ID, owner.getId(), 0.0);
    }

}