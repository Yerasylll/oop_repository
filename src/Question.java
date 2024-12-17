public class Question {
    int numberOfQuestions;
    String question;
    String answer;

    Question() {}

    Question(int numberOfQuestions, String question, String answer) {
        this.numberOfQuestions = numberOfQuestions;
        this.question = question;
        this.answer = answer;
    }

    public void setNumberOfQuestions(int numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getNumberOfQuestions() {
        return numberOfQuestions;
    }
    public String getQuestion() {
        return question;
    }
    public String getAnswer() {
        return answer;
    }
}
