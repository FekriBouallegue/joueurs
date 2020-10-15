package com.fekri.joueurs;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fekri.joueurs.entities.Joueur;
import com.fekri.joueurs.repos.JoueurRepository;

@SpringBootTest
class JoueursApplicationTests {
	@Autowired
	private JoueurRepository joueurRepository;
	@Test
	public void testCreateJoueur() {
	Joueur jou = new Joueur("ahmed","bouallegue",new Date(),"attaquant",25);
	joueurRepository.save(jou);
	}
	@Test
	public void testFindJoueur()
	{
	Joueur jou = joueurRepository.findById(4L).get();
	System.out.println(jou);
	}
	@Test
	public void testUpdateJoueur()
	{
	Joueur jou = joueurRepository.findById(4L).get();
	jou.setAge(35);
	joueurRepository.save(jou);
	}
	@Test
	public void testDeleteJoueur() {
		{
			joueurRepository.deleteById(4L);
			}

		
	}
	@Test
	public void testListerTousjoueurs()
	{
	List<Joueur> jous = joueurRepository.findAll();
	for (Joueur p : jous)
	{
	System.out.println(p);
	}
	}

	}

	


