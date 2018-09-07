package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

	Owner findByFirstName(String firstName);

	Owner findById(Long id);

	Owner save(Owner owner);

	Set<Owner> findAll();
}
