package chap1;
import java.util.Scanner;
public class Ex2 {
public static void main(String[] args) {
	Scanner clavier = new Scanner(System.in);
	System.out.println("Entre nb et nb2");
	float nb1 = clavier.nextInt();
	float nb2 = clavier.nextInt();
	
	float moyenne = nb1/ nb2 ;
	System.out.println("la moyenne de mes nombres   "+moyenne);
	clavier.close();
}
}
