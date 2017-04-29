import java.util.Scanner;
import java.util.Random;

public class NovoJogo {
	public static void main(String args[]){
		
		String question;
		int resp = 0;
		
		int opcao = 0;
		int resposta = 0;
		System.out.println("---------Jogo de Matematica----------");
		Scanner leitor = new Scanner(System.in);
		do{
			System.out.println("\t |================|");
			System.out.println("\t |     OPCOES     |");
			System.out.println("\t |================|");
			System.out.println("\t | 1 - Novo Jogo  |");
			System.out.println("\t | 2 - Sair       |");
			System.out.println("\t |================|");
			opcao = leitor.nextInt();
			
			for(int o = 1; o < 5; o++){
				for(int i = 1; i < 11; i++){
					
						
					System.out.println("Nivel: "+o+ "  Rodada: "+i);
					int random1 = (int) (Math.random() * 10);
					int random2 = (int) (Math.random() * 10);
					
					int n1 = (int) (Math.random() * 2);
					
					if(n1 == 1){
						question = String.valueOf(random1 + "+" + random2);
						Scanner  verificador = new Scanner(System.in);
					    int correctAnswer = random1+random2;
					    resposta = leitor.nextInt();
					    Scanner  corretor = new Scanner(System.in);
					    System.out.println(question);
					    resp = leitor.nextInt();
					    if(resp != resposta){
					    	System.out.println("Errou");
					    }else{
					    	System.out.println(resp+"");
					    }
					   
					}
					if(n1 == 2){
						question = String.valueOf(random1 + "-" +random2);
						int correctAnswer = random1-random2;
						question = String.valueOf(random1 + "+" + random2);
						Scanner  verificador = new Scanner(System.in);
					    correctAnswer = random1+random2;
					    resposta = leitor.nextInt();
					    Scanner  corretor = new Scanner(System.in);
					    System.out.println(question);
					    resp = leitor.nextInt();
					    if(resp != resposta){
					    	System.out.println("Errou");
					    }else{
					    	System.out.println(resp+"");
					    }
					}
			
				}
			}
					
		}while(opcao != 2);
		System.out.println("----------Fim do programa-------------");
	}
}