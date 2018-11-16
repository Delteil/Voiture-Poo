/*Ecrire un programme pour tester la classe Voiture :
	o Créer des instances de la classe voiture
	o Mettre chacune de ces instances dans un tableau de type, par exemple comme cela :
		Voiture[] voitures = new Voiture[nbVoiture] ;
	o Afficher le contenu du tableau et donc les caractéristiques de chacune des voitures (cf. méthode toString() de la classe Voiture).
 */

package voiture;

import voiture.Voiture;

public class TestVoiture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("méthode 1");
		Voiture voiture1 = new Voiture("BMW", 220.0, 8); // instanciation = création voitures
		Voiture voiture2 = new Voiture("Ford", 200.0, 6);
		Voiture voiture3 = new Voiture("Audi", 240.0, 8);

		Voiture[] voitures = { voiture1, voiture2, voiture3 }; // remplissage tableau voitures

		for (int i = 0; i < voitures.length; i++) { // affichage tableau

			System.out.println(voitures[i].toString());

		}
		Voiture.afficheNbre();

		// Autre méthode en instanciant directement les voitures dans le tableau

		System.out.println();
		System.out.println("Méthode 2 - méthode d'Alex");

		Voiture[] voituresAlex = new Voiture[3]; //création tableau

		voituresAlex[0] = new Voiture("BMW", 220.0, 8); //instancie directement dans le tableau
		voituresAlex[1] = new Voiture("Ford", 200.0, 6);
		voituresAlex[2] = new Voiture("Audi", 240.0, 8);

		for (Voiture voiture : voituresAlex) { // Type (Voiture) variable voiture (=i) 

			System.out.println(voiture.toString());

		}
		//Voiture.afficheNbre();
	}
}
