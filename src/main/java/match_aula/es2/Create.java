package match_aula.es2;
import java.util.Scanner;
public class Create {
    Question question = new Question();
    Party party = new Party();
    Participants participants = new Participants();
    Scanner response = new Scanner(System.in);

    public void Assign_questions() {
        int numPerguntas = 0;

        //Cadastrar Perguntas

        do {
            System.out.print("Digite Pergunta ou 0 (Sair): ");
            question.setText(response.nextLine());

            if(question.getText().equals("0")) {
                break;
            }

            party.addQuestion(question);
            numPerguntas++;
        }while(true);
    }

    public void Assign_participants() {
        int numParticipants = 0;

        System.out.println("\n--- Cadastrar Participantes ---");

        do {
            System.out.println("Digite o nome do participante ou 0 (Sair): ");
            participants.setName(response.next());

            if(participants.getName().equals("0")) {
                break;
            }

            for (Question question: party.getQuestions()) {
                System.out.println("Resposta para a pergunta '" + (question.getText()) + "': ");
                String answer = response.next();

                participants.addAnswer(question, answer);
            }

            party.addParticipant(participants);
            numParticipants++;
        }while(true);
    }
 /*
    public void Profile() {

        System.out.println("-----Festas Disponiveis-----");
        //Party festas = new Party();
        //for pegando festa com length
        //list_questions_party.add(festas);

            System.out.println("[1] ");
            System.out.println("[2] ");
            System.out.println("[3] ");


        System.out.println("Qual festa voce quer entrar? ");

        char control = 's';

        do {
           // Participants part = new Participants();
            //list_participants.add(part);

            System.out.print("Quer adicionar outra pessoa? (s/n): ");
            control = response.next().charAt(0);
        }while(control == 's' || control == 'S');

        for(Participants i : list_participants) {
            System.out.println(i);
        }
    }

  */
}
