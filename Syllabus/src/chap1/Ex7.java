package chap1;
/***
 * Calculer les intérêts reçus après 1 an pour un montant placé en banque à du 2% d’intérêt.
 */
import java.util.Scanner;
public class Ex7 {
public static void main(String[] args) {
	
	Scanner clavier = new Scanner(System.in);
System.out.println("Entre montant");
	double montant = clavier.nextDouble();
	System.out.println("Les interets apres 1 an valent");
double taux =clavier.nextDouble();
System.out.println("Entre le taux");
double interet = montant*(1+(taux/100));

System.out.println("Les interets apres 1 an valent");
System.out.println(interet);

}
}
