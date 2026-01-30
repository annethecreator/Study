package initiation;
/***
 * fonction: calculDecision1(note)
in: un nombre entre 0 et 100
out: note < 50 ⇒ ”Echec”
note >= 50 ⇒ ”Reussite ´ ”
 */
import java.util.Scanner;
public class calculDecision1 {
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entre ta note");
		int note = clavier.nextInt();
		
		assert note >= 0 : "la note doit être supérieure ou égale à 0";
		assert note <= 100 : "la note doit être inférieure ou égale à 100";
		
		if(note < 50) {
			System.out.println("t'as rate");
		}else {
			System.out.println("t'as reussi");
		}
	
clavier.close();
	}
}
