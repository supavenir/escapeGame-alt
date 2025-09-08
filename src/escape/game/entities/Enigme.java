package escape.game.entities;

public class Enigme {

	private String titre;
	private String description;
	private String codeSolution;
	private boolean resolu;
	
	public Enigme() {
		
	}
	
	public Enigme(String titre, String description, String codeSolution) {
		this.titre = titre;
		this.description = description;
		this.codeSolution = codeSolution;
	}
	
	public String getTitre() {
		return titre;
	}
	
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public boolean isResolu() {
		return resolu;
	}
	
	public boolean resoudre(String tentative) {
		return this.resolu = (this.codeSolution.equalsIgnoreCase(tentative));
	}
	
	
	
	
	
}
