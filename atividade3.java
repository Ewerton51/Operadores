package atividadeoperadores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		
		float sbru,anot,hext,desc,sliq;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o seu salário bruto:");
		sbru = leia.nextFloat();
		System.out.println("\nDigite o seu adicional noturno:");
		anot = leia.nextFloat();
		System.out.println("\nDigite suas horas extras:");
		hext = leia.nextFloat();
		System.out.println("\nDigite os seus descontos:");
		desc = leia.nextFloat();
		
		sliq = (sbru+anot+(hext*5)-desc);
		
		DecimalFormat df = new DecimalFormat ("0.00");
		String sliqFormatted = df.format(sliq);
		
		System.out.println("Seu salário líquido é de:"+sliqFormatted);
		
		
	}

}
