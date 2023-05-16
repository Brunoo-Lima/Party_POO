package match_aula.es2;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		/*

		Os participantes da festa tem um perfil, com respostas a perguntas do tipo SIM/N�O.
		Exemplo: Gosta de chocolate? SIM etc.

		O A partir de uma festa e seus participantes, o sistema deve ser capaz de
		identificar quem é o 'match' de um determinado participante. O match � encontrado a
		partir do n�mero de respostas iguais para as mesmas perguntas.

		Em outras palavras, as
		duas pessoas que responderem mais perguntas de modo igual 'd�o match'. Se houver empate,
		qualquer um dos empatados pode ser selecionado como match. Deve ser poss�vel cadastrar quantas
		perguntas quiser. Cada participante da festa deve responder a todas as perguntas cadastradas.
		 */

		Scanner response = new Scanner(System.in);
		//Profile participantes = new Profile();
		Create create = new Create();
		Party party = new Party();
		String escolha = "4";

		while(!escolha.equals("3")) {
			System.out.println("--------Bem-vindo ao Menu--------");
			System.out.println("[0] - Criar Festa ");
			System.out.println("[1] - Participar de Festa ");
			System.out.println("[2] - Sair! ");
			System.out.print("Escolha a opção que deseja!: ");
			escolha = response.nextLine();

			switch(escolha) {
				case "0":
						System.out.println("++++Criar Festa++++");
						party.Create_party();
					break;
				case "1":
						System.out.println("++++Participar de Festa++++");
						create.Assign_participants();

					break;
				case "2":
					System.out.println("Saindoo...");
					break;
				default:
					//System.out.println("Você não escolheu nenhuma das opções!!");
					break;
			}
		}
	}
}


