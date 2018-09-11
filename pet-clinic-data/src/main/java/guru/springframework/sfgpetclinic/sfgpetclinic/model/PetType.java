package guru.springframework.sfgpetclinic.sfgpetclinic.model;

public class PetType extends BaseEntity {
	
	private String name;

	PetType(String name) {
		this.name = name;
	}
}
