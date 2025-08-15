import java.util.*;

class Question {
    String question;
    String[] options;
    int correctOption;

    public Question(String question, String[] options, int correctOption) {
        this.question = question;
        this.options = options;
        this.correctOption = correctOption;
    }

    public boolean checkAnswer(int answer) {
        return answer == correctOption;
    }
}

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Question> quiz = new ArrayList<>();

        // Add questions
        quiz.add(new Question(
            "Which planet is known as the Red Planet?",
            new String[]{"Earth", "Mars", "Jupiter", "Venus"}, 
            2
        ));
        quiz.add(new Question(
            "Who developed Java?",
            new String[]{"Microsoft", "Sun Microsystems", "Google", "IBM"},
            2
        ));

        int score = 0;
        for (Question q : quiz) {
            System.out.println(q.question);
            for (int i = 0; i < q.options.length; i++) {
                System.out.println((i + 1) + ". " + q.options[i]);
            }
            System.out.print("Your answer: ");
            int ans = sc.nextInt();
            if (q.checkAnswer(ans)) {
                score++;
                System.out.println("Correct!\n");
            } else {
                System.out.println("Wrong!\n");
            }
        }

        System.out.println("Your final score: " + score + "/" + quiz.size());
        sc.close();
    }
}
