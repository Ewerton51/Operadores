package atividadeoperadores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class atividade1 {
	public static void main(String[] args) {
		
		float s1,a2,ns;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o seu salário:");
		s1 = leia.nextFloat();
		System.out.println("\nDigite o seu abono:");
		a2 = leia.nextFloat();
		
		ns = (s1+a2);
		
		DecimalFormat df = new DecimalFormat ("0.00");
		String nsFormatted = df.format(ns);
		
		System.out.println("\nO seu novo salário é de:"+nsFormatted);
		
	}

}
