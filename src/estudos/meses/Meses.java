package estudos.meses;

import java.util.Scanner;

public class Meses {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int mes;
		
		System.out.println("Informe o número para a exibição do seu respectivo mês: ");
		mes = sc.nextInt();		
		
		System.out.println("O mês " + mes + " é o mês de: " + exibirMes(mes));		
		
		sc.close();

	}

	public static String exibirMes(int mes) {
		switch (mes) {
		case 1: {
			return "Janeiro";
		}
		case 2: {
			return "Fevereiro";
		}
		case 3: {
			return "Março";
		}
		case 4: {
			return "Abril";
		}
		case 5: {
			return "Maio";
		}
		case 6: {
			return "Junho";
		}
		case 7: {
			return "Julho";
		}
		case 8: {
			return "Agosto";
		}
		case 9: {
			return "Setembro";
		}
		case 10: {
			return "Outubro";
		}
		case 11: {
			return "Novembro";
		}
		case 12: {
			return "Dezembro";
		}
		default:
			return "O número informado não é valido";
		}
		
		
	}
}
