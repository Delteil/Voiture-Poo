/*
Projet voiture-poo

• Créer un repository dans GitHub avec le nom voiture-poo
• Définir une classe Voiture avec les attributs suivants : marque, vitesse, puissance.
• Définir un constructeur permettant d’initialiser les attributs d'un objet voiture par des valeurs passées en paramètre.
• Définir la méthode toString() permettant d’afficher les informations d'une voiture.
• Ecrire un programme pour tester la classe Voiture :
	o Créer des instances de la classe voiture
	o Mettre chacune de ces instances dans un tableau de type, par exemple comme cela :
		Voiture[] voitures = new Voiture[nbVoiture] ;
	o Afficher le contenu du tableau et donc les caractéristiques de chacune des voitures (cf. méthode toString() de la classe Voiture).
*/

package voiture;

public class Voiture {

	public String marque = ""; // attribut de voiture
	public double vitesse = -1;
	public int puissance = -1;
	public static int nombreVoiture = 0;

	public Voiture (String marque, double vitesse, int puissance) {
		this.marque = marque;
		this.vitesse = vitesse;
		this.puissance = puissance;
		nombreVoiture++;
	}

	public String toString() {
		return "marque = " + marque + " vitesse = " + vitesse + " puissance = " + puissance;
	}
	
	public static void afficheNbre() {
		System.out.println("Il y a "+nombreVoiture+" voiture(s)");
	}
}
