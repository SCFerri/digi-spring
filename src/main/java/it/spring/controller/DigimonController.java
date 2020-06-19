package it.spring.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.spring.model.Digimon;
import it.spring.service.DigimonService;

@Controller
public class DigimonController {

	@Autowired
	private DigimonService digimonService;
	
	@RequestMapping(value = {"/", "/index"})
	public ModelAndView toIndex() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	
	@RequestMapping("/listaDigimon")
	public ModelAndView listDigimon() {
		List<Digimon> listDigimon = digimonService.listAll();
		ModelAndView mav = new ModelAndView("lista_digimon");
		mav.addObject("listDigimon", listDigimon);
		return mav;
	}
	@RequestMapping("/newDigimon")
	public String newDigimonForm(Map<String, Object> model) {
		Digimon digimon = new Digimon();
		model.put("digimon", digimon);
		return "new_digimon";
	}
	@RequestMapping(value = "/saveDigimon", method = RequestMethod.POST)
	public String saveDigimon(@ModelAttribute("digimon") Digimon digimon) {
		digimonService.save(digimon);
		return "redirect:/";
	}
	@RequestMapping("/editDigimon")
	public ModelAndView editDigimonForm(@RequestParam Long id) {
		ModelAndView mav = new ModelAndView("edit_digimon");
		Digimon digimon = digimonService.get(id);
		mav.addObject("digimon", digimon);
		
		return mav;
	}
	@RequestMapping("/deleteDigimon")
	public String deleteDigimonForm(@RequestParam Long id) {
		digimonService.delete(id);
		return "redirect:/";		
	}
	
}
