package match_aula.es2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Party{
	private String nameParty;
	private String description;
	private List<Question> questions;
	private List<Participants> participants;
	Scanner resp = new Scanner(System.in);

	public Party() {
		this.nameParty = nameParty;
		this.description = description;
		this.questions = new ArrayList<>();
		this.participants = new ArrayList<>();
	}

	public String getNameParty() {
		return nameParty;
	}
	public void setNameParty(String nameParty) {
		this.nameParty = nameParty;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	public void addQuestion(Question question) {
		questions.add(question);
	}

	public void addParticipant(Participants participant) {
		if (participant.getAnswers_list().size() != questions.size()) {
			throw new IllegalArgumentException("O participante deve responder todas as perguntas!");
		}
		participants.add(participant);
	}

	public Participants findMatch(Participants participant) {
		Participants match = null;
		int maxAnswersEquals = 0;

		for(Participants otherParticipant : participants) {
			if(otherParticipant != participant) {
				int answersEquals = 0;
				for (Question question: questions) {
					String answersParticipant = participant.getAnswer(question);
					String answersOtherParticipant = otherParticipant.getAnswer(question);
					if(answersParticipant.equals(answersOtherParticipant)) {
						answersEquals++;
					}
				}
				if(answersEquals > maxAnswersEquals) {
					maxAnswersEquals = answersEquals;
					match = otherParticipant;
				}
			}
		}
		return match;
	}

	public void Create_party() {
		System.out.println("Digite nome da Festa: ");
		this.setNameParty(resp.next());
		System.out.println("Digite descrição da Festa: ");
		this.setDescription(resp.next());

		System.out.println("Nome da festa: " + getNameParty());
		System.out.println("Descrição da festa: " + getDescription());

		Create create = new Create();
		System.out.println("Crie perguntas de SIM/NAO para os participantes acharem " +
				"o seu MATCH! ");
		create.Assign_questions();
		create.Assign_participants();
	}
}
