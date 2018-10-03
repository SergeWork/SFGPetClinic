package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@Controller
public class VetController {

	public static final String VETS_INDEX = "vets/index";

	private final VetService vetService;

	public VetController(VetService vetService) {
		this.vetService = vetService;
	}

	@RequestMapping({"/vets", "/vets.html", "/vets/index", "/vets/index.html"})
	public String listVets(Model model) {
		Set<Vet> vets = vetService.findAll();
		model.addAttribute("vets", vets);
		return VETS_INDEX;
	}
}
