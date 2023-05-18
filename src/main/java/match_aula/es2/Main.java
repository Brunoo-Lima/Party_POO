package match_aula.es2;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		Scanner response = new Scanner(System.in);
		Create create = new Create();


		String escolha = "5";

		while(!escolha.equals("4")) {
			System.out.println("--------Bem-vindo ao Menu--------");
			System.out.println("[0] - Criar Festa ");
			System.out.println("[1] - Participar de Festa ");
			System.out.println("[2] - Perfil! ");
			System.out.println("[3] - Resultado! ");
			System.out.println("[4] - Sair! ");
			System.out.print("Escolha a opção que deseja!: ");
			escolha = response.nextLine();

			switch(escolha) {
				case "0":
					System.out.println("++++Criar Festa++++");
					create.Assign_party();
					break;
				case "1":
					System.out.println("++++Participar de Festa++++");
					create.Assign_participants();
					break;
				case "2":
					System.out.println("\n--- PERFIL ---");
					create.Profile();
					break;
				case "3":
					System.out.println("\n--- Resultado ---");
					create.Result();
					break;
				case "4":
					System.out.println("Saindoo...");
					break;
				default:
					System.out.println("Você não escolheu nenhuma das opções!!");
					break;
			}
		}
	}
}