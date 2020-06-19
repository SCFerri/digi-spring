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

import it.spring.model.Allenatore;
import it.spring.model.Digimon;
import it.spring.service.AllenatoreService;
import it.spring.service.DigimonService;

@Controller
public class AllenatoreController {

	@Autowired
	private DigimonService digimonService;
	
	@Autowired
	private AllenatoreService allenatoreService;
	
	@RequestMapping("/listaAllenatori")
	public ModelAndView home() {
		List<Allenatore> listAllenatore = allenatoreService.listAll();
		ModelAndView mav = new ModelAndView("lista_allenatori");
		mav.addObject("listAllenatore", listAllenatore);
		return mav;
	}
	@RequestMapping("/newAllenatore")
	public String newAllenatoreForm(Map<String, Object> model) {
		Allenatore allenatore = new Allenatore();
		model.put("allenatore", allenatore);
		return "new_allenatore";
	}
	@RequestMapping(value = "/saveAllenatore", method = RequestMethod.POST)
	public String saveAllenatore(@ModelAttribute("allenatore") Allenatore allenatore) {
		allenatoreService.save(allenatore);
		return "redirect:/";
	}
	@RequestMapping("/editAllenatore")
	public ModelAndView editAllenatoreForm(@RequestParam Long id) {
		ModelAndView mav = new ModelAndView("edit_allenatore");
		Allenatore allenatore = allenatoreService.get(id);
		mav.addObject("allenatore", allenatore);
		
		return mav;
	}
	@RequestMapping("/deleteAllenatore")
	public String deleteAllenatoreForm(@RequestParam Long id) {
		allenatoreService.delete(id);
		return "redirect:/";		
	}
	@RequestMapping("/aggiungiDigimonAllenatore")
	public String addDigimonForm(Map<String, Object> model) {
		Allenatore allenatore = new Allenatore();
		List<Digimon> listaDigimon = digimonService.listAll();
		model.put("allenatore", allenatore);
		model.put("digimon", listaDigimon);
		return "scegli_digimon";
	}
	
}
