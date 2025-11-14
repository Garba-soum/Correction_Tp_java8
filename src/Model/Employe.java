package Model;

import java.time.LocalDate;

public class Employe {
	
	private int id; 
	private String nom;
	private double salaire;
	private LocalDate dateEmbauche; 
	
	public void Employe() {
		System.out.println("Constructeur sans arguement de la classe ");
	}
	
	public void Employe(int id, String nom, double salaire, LocalDate dateEmbauche) {
		
		this.setId(id);
		this.nom = nom; 
		this.salaire = salaire;
		this.dateEmbauche = dateEmbauche; 
	}

	public int getId() {
		return id;    
	}

	public void setId(int id) {
		this.id = id;   
	}

	public String getNom() {  
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public LocalDate getDateEmbauche() {
		return dateEmbauche;
	}
	public void setDateEmbauche(LocalDate dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}
	
	
	
	public String toString() { 
		
		return "\nid : " + id + " \nNom : " + nom + " \nSalaire : " + salaire + " \nDate d'embauche " + dateEmbauche; 
	}

}
