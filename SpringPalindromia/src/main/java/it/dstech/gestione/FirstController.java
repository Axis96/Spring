package it.dstech.gestione;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.dstech.modelli.Testo;

@Controller
public class FirstController {

	@RequestMapping(value = "/Palindromia")
	public ModelAndView checkParameter(@RequestParam("testo") String testo, Model model) {
		
		
		Metodi gestione = new Metodi();
		Testo testoAnalizzato = new Testo( gestione.contaParole(testo), gestione.contaPalindromia(testo) , gestione.parolePalindrome);
		
		
		
		return new ModelAndView("Homepage", "Risultato" ,testoAnalizzato);
	}
	
}



