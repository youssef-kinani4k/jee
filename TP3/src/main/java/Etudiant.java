
public class Etudiant {
	private String cin,nom,image;
	private double moyenne;
	public Etudiant(String cin, String nom, double moyenne, String image) {
		this.cin = cin;
		this.nom = nom;
		this.moyenne = moyenne;
		this.image=image;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getMoyenne() {
		return moyenne;
	}
	public void setMoyenne(double moyenne) {
		this.moyenne = moyenne;
	}
	
	public  boolean equals (Etudiant a,Etudiant b) {
		return a.cin.equals(b.cin);
	}
	
}

