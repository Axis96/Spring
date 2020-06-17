package it.dstech.gestione;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class FirstController {
	
	@RequestMapping(value  = "/homepage")
	public ModelAndView checkParameter(@RequestParam("testo") String testo, Model model, @RequestParam("scelta") String scelta) {
		ModelAndView view = new ModelAndView("risultato");
		Service gestione = new Service();
		if(scelta.equalsIgnoreCase("parole")) {
			view.addObject("risultato", gestione.conteggio(testo).getNumeroParole());
		} else if (scelta.equalsIgnoreCase("vocali")) {
			view.addObject("risultato", gestione.conteggio(testo).getNumeroVocali());
		} else if (scelta.equalsIgnoreCase("consonanti")) {
			view.addObject("risultato", gestione.conteggio(testo).getNumeroConsonanti());
		} 
		return view;
	}
	
}