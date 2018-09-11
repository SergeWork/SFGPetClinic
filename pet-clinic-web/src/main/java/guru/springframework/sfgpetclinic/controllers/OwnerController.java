package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnerController {


	public static final String INDEX_OWNERS = "owners/index";

	@RequestMapping({"", "/", "/index", "/index.html"})
	public String listOwners() {
		return INDEX_OWNERS;
	}
}
