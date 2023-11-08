package atividadeoperadores;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Locale;

public class atividade2 {

	public static void main(String[] args) {
		
		float n1,n2,n3,n4,media;
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite a primeira nota:");
		n1 = leia.nextFloat();
		System.out.println("Digite a segunda nota:");
		n2 = leia.nextFloat();
		System.out.println("Digite a terceira nota:");
		n3 = leia.nextFloat();
		System.out.println("Digite a quarta nota:");
		n4 = leia.nextFloat();
		
		media = (n1+n2+n3+n4)/4;
		
		DecimalFormat df = new DecimalFormat("0.0");
		String mediaFormatted = df.format(media);
		
		System.out.println("Sua média final é de:"+mediaFormatted);
		
	}

}
