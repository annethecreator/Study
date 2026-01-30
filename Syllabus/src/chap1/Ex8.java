package chap1;
/***
 * Étant donné le montant d’un capital placé (en euro) et le taux d’intérêt annuel (en %), calculer
la nouvelle valeur de ce capital après un an
 */
import java.util.Scanner;
public class Ex8 {
public static void main(String[] args) {
	Scanner clavier = new Scanner(System.in);
	System.out.println("Entre le montant");
	double montant = clavier.nextDouble();
	System.out.println("Entre le taux d'interet");
	double interet =clavier.nextDouble();
	//calcul du taux
	double taux = montant*(interet/100);
	//calcul du nouveau capital
	double capital = montant+ taux;
	System.out.println("la nouvelle valeur vaut ");
	System.out.println(capital);
	
	
	
	
	
	
	clavier.close();
}
}
