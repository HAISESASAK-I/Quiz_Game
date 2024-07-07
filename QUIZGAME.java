import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class QUIZGAME {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> questions = new ArrayList<>(Arrays.asList(
            "What is the capital of France?",
            "What is the largest planet in our solar system?",
            "Which element has the chemical symbol 'O'?",
            "What is the square root of 64?", "Who wrote 'Romeo and Juliet'?",
            "What is the speed of light in vacuum?",
            "Who was the first president of the United States?",
            "What is the smallest prime number?",
            "Which planet is known as the Red Planet?",
            "What is the chemical formula for water?",
            "How many continents are there on Earth?",
            "Who painted the Mona Lisa?",
            "What is the largest mammal in the world?",
            "In which year did the Titanic sink?",
            "What is the hardest natural substance on Earth?",
            "Who discovered penicillin?", "What is the largest ocean on Earth?",
            "How many states are there in the United States?",
            "What is the capital of Japan?",
            "What is the longest river in the world?",
            "Who is known as the father of computers?",
            "What is the main ingredient in traditional sushi?",
            "Who wrote the play 'Hamlet'?",
            "What is the chemical symbol for gold?",
            "What is the smallest country in the world by area?",
            "Who developed the theory of relativity?",
            "What is the most widely spoken language in the world?",
            "Which planet has the most moons?",
            "What is the main gas found in the Earth's atmosphere?",
            "Who invented the telephone?"));
        ArrayList<String> options = new ArrayList<>(Arrays.asList());
        ArrayList<String> answer = new ArrayList<>(Arrays.asList());
        System.out.println(
            "<-------------------------------------Quiz Game--------------------------------------------------");
        System.out.println(
            "What do you like to do:\nEnter \"1\" to start the Quiz.\nEnter \"2\" to add questions in Quiz game.\nEnter \"3\" to view your current score.");
        int userChoice = scanner.nextInt();
        switch (userChoice) {
        case 1: {

            break;
        }
        case 2: {

            break;
        }
        case 3: {
            break;
        }

        default: {
            System.out.println(
                "You have entered an invalid input\n Kindly enter a valid input");
        }
        }
    }
}