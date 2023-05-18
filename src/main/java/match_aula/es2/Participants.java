package match_aula.es2;
import java.util.HashMap;
import java.util.Map;
public class Participants {
	private String name;
	private Map<Question, String> answers_list;
	public Participants() {
		this.answers_list = new HashMap<>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void addAnswer(Question question, String answer){
		answers_list.put(question, answer);
	}
	public String getAnswer(Question question) {
		return answers_list.get(question);
	}
}
