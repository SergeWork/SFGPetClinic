package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	public static final String INDEX = "index";
	public static final String NOT_IMPLEMENTED = "notimplemented";

	@RequestMapping({"", "/", "/index", "/index.html"})
	public String index() {
		return INDEX;
	}

	@RequestMapping("/oups")
	public String oupsHandler() {
		return NOT_IMPLEMENTED;
	}

}
