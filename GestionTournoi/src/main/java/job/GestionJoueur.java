package job;

import java.util.List;

import entities.Joueur;
import entities.Nation;

/**
 * Interface de services de joueurs
 */
public interface GestionJoueur {

	/**
	 * M�thode de lien entre le controller et le dao pour la persistance d'un joueur
	 * 
	 * @param nom {@link String} Nom du joueur
	 * @param prenom {@link String} Pr�nom du joueur
	 * @param nation {@link Nation} Nation du joueur
	 * @param sexe {@link String} Genre du joueur
	 * @throws JobException Exception retourn�e en cas d'impossibilit� d'ajout
	 */
	public void ajoutJoueur(String nom, String prenom, Nation nation, String sexe) throws JobException;
	
	public void modifierJoueur(Integer id) throws JobException;	
	public void supprimerJoueur(Integer id) throws JobException;
	public List<Joueur> getAllJoueurs() throws JobException;
}