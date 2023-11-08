package atividadeoperadores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {
		
		float n1,n2,n3,n4,dif;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Insira o valor:");
		n1 = leia.nextFloat();
		System.out.println("Insira o valor:");
		n2 = leia.nextFloat();
		System.out.println("Insira o valor:");
		n3 = leia.nextFloat();
		System.out.println("Insira o valor:");
		n4 = leia.nextFloat();
		
		dif = (n1*n2)-(n3*n4);
		
		DecimalFormat df = new DecimalFormat("0.0");
		String difFormatted = df.format(dif);
		
		System.out.println("A diferença é de:"+difFormatted);
		
	}

}
