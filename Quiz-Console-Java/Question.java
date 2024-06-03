import java.util.Arrays;

public class Question {
    private int id;
    private String question,answer;
    private String options[] = new String[4];

    public Question(String question, int id, String answer, String[] options) {
        this.answer = answer;
        this.id = id;
        this.question = question;
        this.options= options;
    }

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    @Override
    public String toString() {
        return  id +": " + question + "\nOptions: " 
                + Arrays.toString(options) ;
    }

    public String[] getOptions() {
        return options;
    }


    
}
