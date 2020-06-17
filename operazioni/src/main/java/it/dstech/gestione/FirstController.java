package it.dstech.gestione;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class FirstController {
	
	@RequestMapping(value  = "/homepage" , method= RequestMethod.POST)
	public ModelAndView checkParameter(@RequestParam("scelta") String scelta, @RequestParam("numero1") String numero1, Model model, @RequestParam("numero2") String numero2) {
		ModelAndView view = new ModelAndView("Risultato");
		if(scelta.equalsIgnoreCase("addizione")) {
			view.addObject("operazione", Integer.parseInt(numero1) + Integer.parseInt(numero2));
		} else if (scelta.equalsIgnoreCase("sottrazione")) {
			view.addObject("operazione", Integer.parseInt(numero1) - Integer.parseInt(numero2));
		} else if (scelta.equalsIgnoreCase("moltiplicazione")) {
			view.addObject("operazione", Integer.parseInt(numero1) * Integer.parseInt(numero2));
		} else if (scelta.equalsIgnoreCase("divisione")) {
			view.addObject("operazione", Integer.parseInt(numero1) / Integer.parseInt(numero2));
		} 
		return view;
	}
}