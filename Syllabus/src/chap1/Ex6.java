package chap1;
/***
 * Si on donne un prix hors TVA, il faut lui ajouter 21% pour obtenir le prix TTC. Écrire un
algorithme qui permet de passer du prix HTVA au prix TTC.
 */
import java.util.Scanner;
public class Ex6 {
public static void main(String[] args) {
	Scanner clavier = new Scanner(System.in);
	System.out.println("Entre le prix htva");
	double  prixhtva = clavier.nextDouble();
	System.out.println("Entre le taux de tva");
	double taux = clavier.nextDouble();
	
}
}
