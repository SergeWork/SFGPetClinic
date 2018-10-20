package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.repositories.OwnerRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class OwnerSDJpaServiceTest {

    @Mock
    OwnerRepository ownerRepository;

    @InjectMocks
    OwnerSDJpaService service;

    Owner returnedOwner;

    @Before
    public void setUp() throws Exception {
        // No need because of @InjectMocks
        service = new OwnerSDJpaService(ownerRepository);

        returnedOwner = new Owner();
        returnedOwner.setId(1L);
        returnedOwner.setLastName("Smith");
    }

    @Test
    public void findByLastName() throws Exception {
        when(service.findByLastName((any()))).thenReturn(returnedOwner);

        Owner owner = service.findByLastName("Smith");

        assertEquals(owner, returnedOwner);
    }

}