package chap1;
/***
 * Calculer la surface d’un cercle dont on donne le rayon
 * pi*rayon*rayon
 */
import java.util.Scanner;
public class Ex5{
	public static void main(String[] args) {
Scanner clavier = new Scanner(System.in);
System.out.println("Entre le rayon");
double rayon = clavier.nextInt();
double pi = 3.1415;

System.out.println("La surface est");
double surface = pi*rayon*rayon;
System.out.println(surface);
clavier.close();
	}
}