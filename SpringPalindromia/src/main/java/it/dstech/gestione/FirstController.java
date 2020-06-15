package it.dstech.gestione;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

	@RequestMapping(value = "/Palindromia")
	public ModelAndView checkParameter(@RequestParam("testo") String testo, Model model) {
		
		
		Metodi gestione = new Metodi();
		
		int numeroParole = gestione.contaParole(testo);
		int numeroParolePalindrome = gestione.contaPalindromia(testo);
		
		return new ModelAndView("Homepage" , "Il numero delle parole del testo è : " +numeroParole 
				+ "\n Il numero delle parole palindrome è: " + numeroParolePalindrome, testo);
		
	}
}



