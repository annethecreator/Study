package initiation;
import java.util.Scanner;
/***
 * fonction: calculDecision2(note)
in: un nombre entre 0 et 100
out:
note < 30 ⇒ ”Refus”
note < 50 ⇒ ”Ajourne´”
note >= 50 ⇒ ”Reussite ´ ”
 */
public class calculDecision2 {
public static void main(String[] args) {
	Scanner clavier = new Scanner(System.in);
	System.out.println("Entre ta note");
	int note = clavier.nextInt();
	
	assert note >= 0 : "note doit etre plus grand que 0 ou egal a 0";
	
	assert note <=100 : "note doit etre INFerieur  ou egal a 100";
	
	if(note < 30 ) {
		System.out.println("Refus");
	}else if(note < 50) {
		System.out.println("Ajourne");
	} else if(note >= 50) {
		System.out.println("reussite");
	}
	clavier.close();
}
}
