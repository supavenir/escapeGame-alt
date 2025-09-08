package escape.game.entities;

import java.util.ArrayList;
import java.util.List;

public class Salle {
	private List <Enigme> enigmes;
	private String nom;
	private int tempLimite;
	
	public Salle(String nom, int tempLimite) {
		this.nom = nom;
		this.tempLimite = tempLimite;
		enigmes=new ArrayList<>();
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNom() {
		return nom;
	}
	public void setTempLimite(int tempLimite) {
		this.tempLimite = tempLimite;
	}
	public int getTempLimite() {
		return tempLimite;
	}
	public void ajouterEnigme(Enigme enigme) {
		this.enigmes.add(enigme);
	}
	public boolean isTerminee() {
		for(Enigme e:enigmes) {
			if(!e.isResolu()) {
				return false;
			}
		}
		return true;
	}
	public boolean resoudreEnigme(int index, String reponse) {
		return this.enigmes.get(index).resoudre(reponse);
	}
	
	public List<Enigme> getEnigmes() {
		return enigmes;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public List<Enigme> getEnigmesNonResolues() {
		List<Enigme> temp = new ArrayList<Enigme>();
		for (Enigme e : enigmes) {
			if (!e.isResolu()) {
				temp.add(e);
			}
		}
		return temp;
	}
	

	
	
}
