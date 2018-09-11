package guru.springframework.sfgpetclinic.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.sfgpetclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {
	@Override
	public Set<Owner> findAll() {
		return this.findAll();
	}

	@Override
	public Owner findById(Long id) {
		return this.findById(id);
	}

	@Override
	public Owner save(Owner object) {
		return this.save(object);
	}

	@Override
	public void delete(Owner object) {
		this.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		this.deleteById(id);
	}
}
