package dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.mockito.Mock;

import dao.JoueurDao;
import dao.impl.JoueurDaoImpl;
import entities.Joueur;
import entities.Nation;
import entities.Sexe;
import job.GestionJoueur;

public class JoueurDaoImplMockitoTest {

	@Test
	public void testGestionJoueurImplGetAllJoueurs() {

		// https://dzone.com/articles/5-minute-mockito-tutorial-howto
		JoueurDao joueurDao = mock(JoueurDaoImpl.class);
		Joueur joueur = new Joueur("SAMPRAS", "Pit", Sexe.HOMME, new Nation("France"));
		Joueur joueur2 = new Joueur("BRUGERAS", "Jean", Sexe.HOMME, new Nation("France"));
		List<Joueur> joueursList = new ArrayList<Joueur>();

		joueursList.add(joueur);
		joueursList.add(joueur2);
		when(joueurDao.selectAll()).thenReturn(joueursList);

		assertEquals(2, joueurDao.selectAll().size());
		verify(joueurDao).selectAll();
	}

}
