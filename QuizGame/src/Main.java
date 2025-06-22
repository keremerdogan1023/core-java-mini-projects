import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] questions = {"What is the capital city of Turkey?",
                              "Which planet also known as 'Red Planet'?",
                              "Who wrote the play 'Romeo And Juliet'?",
                              "What is chemical symbol for gold?",
                              "In what year did the Titanic sink?"  };
        String[][] options = {{"A-) İstanbul","B-) İzmir","C-) Ankara","D-) Antalya"},
                {"A-) Venus","B-) Mars","C-) Jupiter","D-) Saturn"},
                {"A-) Charles Dickens","B-) William Shakespeare","C-) Jane Austen","D-) George Orwell"},
                {"A-) Gd","B-) Ag","C-) Au","D-) Go"},
                {"A-) 1905","B-) 1912","C-) 1923","D-) 1898"}

        };
        String[] answers = {"C","B","B","C","B"};
        int score = 0;
        String guess;
        System.out.println("Welcome to the quiz show!");
        for(int i = 0; i < questions.length; i++) {
            int j = i+1;
            System.out.println("Question " + j + ": " + questions[i]);
            for(String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Enter your guess: ");
            guess = input.nextLine();
            guess = guess.toUpperCase();
            if(guess.equals(answers[i])) {
                System.out.println("Correct!");
                score++;
            }
            else {
                System.out.println("Incorrect.");
            }

        }
        System.out.println("Your final score is " + score + " out of " + questions.length);
        input.close();

    }
}
