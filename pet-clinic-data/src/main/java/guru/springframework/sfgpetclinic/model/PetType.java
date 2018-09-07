package guru.springframework.sfgpetclinic.model;

public class PetType extends BaseEntity {
	
	private String name;

	PetType(String name) {
		this.name = name;
	}
}
