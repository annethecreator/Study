package chap1;
/***
 * Calculer le périmètre d’un cercle dont on donne le rayon
 * 2*pi*r
 */
import java.util.Scanner;
public class Ex4 {
public static void main(String[] args) {
	Scanner clavier = new Scanner(System.in);
	System.out.println("Entre le rayon");
	double rayon = clavier.nextInt(); // on utilise double car c'est plus précis que float, les int n'ont pas de nb a virgules
	double pi = 3	;
	double pericercle = 2*pi*rayon;
	System.out.println("Le perimetre du cercle est de "+ pericercle);
	clavier.close();
}
}
