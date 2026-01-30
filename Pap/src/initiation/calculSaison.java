package initiation;
/***
 * on determine la saison apd d'une date 
 * 
 */
import java.util.Scanner;
public class calculSaison {
public static void main(String[] args) {
	Scanner clavier = new Scanner(System.in);
System.out.println("entre le jour en nombre");
int jour = clavier.nextInt();

System.out.println("entre le mois en nombre ");
int mois = clavier.nextInt();


// lorsque tu entre mois et jour, rentre JOUR d'abord ensuite MOIS
if ((mois == 3 && jour >= 21) || (mois == 4) ||(mois == 5) ||(mois == 6  && jour <= 20 )) {
	System.out.println("Printemps");
} else if((mois == 6 && jour >= 21) || (mois == 7) ||(mois == 8) ||(mois == 9  && jour <= 22 ))  {
	System.out.println("ETE");
} else if ((mois == 9 && jour >= 23) || (mois == 10) ||(mois == 11) ||(mois == 12  && jour <= 20 )) {
	System.out.println("Automne");
}
clavier.close();
}
}
