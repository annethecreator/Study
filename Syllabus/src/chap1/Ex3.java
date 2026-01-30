package chap1;
import java.util.Scanner;
/***
 * calcul la surface d'un triangle 
 * base*hauteur/2
 */
import java.util.Scanner;
public class Ex3 {
public static void main(String[] args) {
	Scanner clavier = new Scanner(System.in);
	System.out.println("Surface d'un triangle");
	int base = clavier.nextInt();
	System.out.println("Entre la hauteur");
	int h = clavier.nextInt();
	
	System.out.println("la surface de mon client est");
	int surfacetriangle =(base*h/2) ;
	System.out.println(surfacetriangle);
}
}
