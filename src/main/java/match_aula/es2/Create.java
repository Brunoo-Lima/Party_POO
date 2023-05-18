package match_aula.es2;

import java.util.Scanner;

public class Create {

    Party party = new Party();
    Scanner response = new Scanner(System.in);

    public void Assign_party() {
        System.out.print("Digite o nome da festa: ");
        party.setNameParty(response.nextLine());

        System.out.print("Digite a descrição da festa: ");
        party.setDescription(response.nextLine());

        System.out.println("Crie perguntas de SIM/NAO para os participantes acharem " +
                "o seu MATCH! ");

        int numPerguntas = 0;
        do {
            System.out.print("Digite Pergunta ou 0 (Sair): ");
            String textAnswer = response.nextLine();

            if (textAnswer.equals("0")) break;

            Question question = new Question();
            question.setText(textAnswer);

            party.addQuestion(question);
            numPerguntas++;
        } while (true);
    }

    public void Assign_participants() {

        System.out.println("\n--- Cadastrar Participantes ---");
        int numParticipants=0;
        do {
            System.out.println("Digite o nome do participante ou 0 (Sair): ");
            String respParticipants = response.next();

            if(respParticipants.equals("0")) break;

            Participants participants = new Participants();
            participants.setName(respParticipants);

            for (Question questionParticipant: party.getQuestions()) {
                System.out.println("Resposta para a pergunta '" + (questionParticipant.getText()) + "': ");
                String answer = response.next();

                participants.addAnswer(questionParticipant, answer);
            }

            party.addParticipant(participants);
            numParticipants++;
        }while(true);
    }

    public void Profile() {
        for (Participants participant : party.getParticipants()) {
            System.out.println("Nome: " + participant.getName());

            System.out.println("---- Perguntas Respondidas ----");
            for (Question question : party.getQuestions()) {
                String resp = participant.getAnswer(question);
                System.out.println("- Pergunta: " + question.getText());
                System.out.println("  Resposta: " + resp);
            }

            System.out.println();
        }
    }

    public void Result() {

        System.out.println("Nome da Festa: " + party.getNameParty());
        System.out.println("Descrição da Festa: " + party.getDescription());

        for (Participants participante : party.getParticipants()) {
            Participants match = party.findMatch(participante);
            System.out.println("Match para " + participante.getName() + ": " + match.getName());
        }
    }
}
