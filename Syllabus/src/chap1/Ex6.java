package chap1;
/***
 * Si on donne un prix hors TVA, il faut lui ajouter 21% pour obtenir le prix TTC. Écrire un
algorithme qui permet de passer du prix HTVA au prix TTC.
 */
import java.util.Scanner;
public class Ex6 {
public static void main(String[] args) {
	Scanner clavier = new Scanner(System.in);
	//calcul de la tva a ajouter un peu plustard
	System.out.println("Entre le prix ");
	double phtva = clavier.nextDouble();
	System.out.println("entre le taux de tva");
	double taux =clavier.nextDouble();
	double tva = phtva*(taux/100);
	//calcul prixttc 
	System.out.println("Prix avec tva vaut");
	double ttc = (phtva+tva);
	System.out.println(ttc);
clavier.close();
}
}
