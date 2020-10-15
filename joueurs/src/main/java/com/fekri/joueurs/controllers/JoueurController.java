package com.fekri.joueurs.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.fekri.joueurs.entities.Joueur;
import com.fekri.joueurs.service.JoueurService;

@Controller
public class JoueurController {
	@Autowired
	JoueurService joueurService;
	
	@RequestMapping("/savingjoueur")
	public String showCreate()
	{
		return "enregistrerJoueur";
	}
	
	@RequestMapping("/saveJoueur")
	public String saveProduit(@ModelAttribute("joueur") Joueur joueur, 
							  @RequestParam("jourdesignature") String date,
							  ModelMap modelMap) throws ParseException 
	{
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        Date jourdesignature = dateformat.parse(String.valueOf(date));
        joueur.setjourdesignature(jourdesignature);
      
		 Joueur saveJoueur = joueurService.saveJoueur(joueur);
		 String msg ="Joueur enregistré avec Id "+saveJoueur.getIdJoueur();
		 modelMap.addAttribute("msg", msg);
		return "enregistrerJoueur";
	}
	@RequestMapping("/ListeJoueur")
	public String ListeJoueur(ModelMap modelMap)
	{
	List<Joueur> prods = joueurService.getAllJoueurs();
	modelMap.addAttribute("joueurs", prods);
	return "ListeJoueur";
	}
	@RequestMapping("/supprimerJoueur")
	public String supprimerJoueur(@RequestParam("id") Long id,
	 ModelMap modelMap)
	{
	joueurService.deleteJoueurById(id);
	List<Joueur> prods = joueurService.getAllJoueurs();
	modelMap.addAttribute("joueurs", prods);
	return "ListeJoueur";
	}
	@RequestMapping("/modifierProduit")
	public String editerProduit(@RequestParam("id") Long id,ModelMap modelMap)
	{
	Joueur p= joueurService.getJoueur(id);
	modelMap.addAttribute("joueur", p);
	return "editerJoueur";
	}
	@RequestMapping("/updateProduit")
	public String updateProduit(@ModelAttribute("produit") Joueur joueur,
	@RequestParam("date") String date,ModelMap modelMap) throws ParseException
	{
		 SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		 Date jourdesignature = dateformat.parse(String.valueOf(date));
		 joueur.setjourdesignature(jourdesignature);

		 joueurService.updateJoueur(joueur);
		 List<Joueur> prods = joueurService.getAllJoueurs();
		 modelMap.addAttribute("produits", prods);
		return "listeProduits";
		}
	
	
	
	

}

