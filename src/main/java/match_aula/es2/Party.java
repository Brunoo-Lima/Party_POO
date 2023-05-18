package match_aula.es2;
import java.util.ArrayList;
import java.util.List;
public class Party {
	private String nameParty;
	private String description;
	private List<Question> questions;
	private List<Participants> participants;

	public Party() {
		this.questions = new ArrayList<>();
		this.participants = new ArrayList<>();
	}

	public void setNameParty(String nameParty) {
		this.nameParty = nameParty;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Question> getQuestions() {
		return questions;
	}
	public void addQuestion(Question question) {
		questions.add(question);
	}
	public void addParticipant(Participants participant) {
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
	public List<Participants> getParticipants() {
		return participants;
	}
}
