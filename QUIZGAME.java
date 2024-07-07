import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class QUIZGAME {
    public static void main(String[] args) {
        int userChoice;
        int score = 0;
        boolean choose = true;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
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
        ArrayList<String> options = new ArrayList<>(Arrays.asList(
            "A. Berlin\nB. Paris\nC. Madrid\nD. Rome",
            "A. Earth\nB. Mars\nC. Jupiter\nD. Saturn",
            "A. Gold\nB. Oxygen\nC. Osmium\nD. Opal", "A. 6\nB. 7\nC. 8\nD. 9",
            "A. Charles Dickens\nB. Mark Twain\nC. William Shakespeare\nD. J.K. Rowling",
            "A. 300,000 km/s\nB. 150,000 km/s\nC. 450,000 km/s\nD. 600,000 km/s",
            "A. George Washington\nB. Abraham Lincoln\nC. Thomas Jefferson\nD. John Adams",
            "A. 1\nB. 2\nC. 3\nD. 5", "A. Earth\nB. Mars\nC. Jupiter\nD. Venus",
            "A. H2O\nB. CO2\nC. O2\nD. NaCl", "A. 5\nB. 6\nC. 7\nD. 8",
            "A. Vincent van Gogh\nB. Pablo Picasso\nC. Leonardo da Vinci\nD. Claude Monet",
            "A. Elephant\nB. Blue Whale\nC. Giraffe\nD. Great White Shark",
            "A. 1910\nB. 1912\nC. 1914\nD. 1916",
            "A. Gold\nB. Iron\nC. Diamond\nD. Platinum",
            "A. Albert Einstein\nB. Alexander Fleming\nC. Isaac Newton\nD. Marie Curie",
            "A. Atlantic\nB. Indian\nC. Arctic\nD. Pacific",
            "A. 48\nB. 49\nC. 50\nD. 51",
            "A. Beijing\nB. Seoul\nC. Tokyo\nD. Bangkok",
            "A. Amazon\nB. Nile\nC. Mississippi\nD. Yangtze",
            "A. Charles Babbage\nB. Alan Turing\nC. Steve Jobs\nD. Bill Gates",
            "A. Chicken\nB. Fish\nC. Beef\nD. Tofu",
            "A. George Orwell\nB. Mark Twain\nC. William Shakespeare\nD. Jane Austen",
            "A. Au\nB. Ag\nC. Pb\nD. Fe",
            "A. Monaco\nB. Vatican City\nC. San Marino\nD. Liechtenstein",
            "A. Nikola Tesla\nB. Isaac Newton\nC. Albert Einstein\nD. Galileo Galilei",
            "A. Spanish\nB. English\nC. Mandarin\nD. Hindi",
            "A. Earth\nB. Mars\nC. Jupiter\nD. Saturn",
            "A. Oxygen\nB. Nitrogen\nC. Carbon Dioxide\nD. Hydrogen",
            "A. Alexander Graham Bell\nB. Nikola Tesla\nC. Thomas Edison\nD. Guglielmo Marconi"));

        ArrayList<String> answer = new ArrayList<>(
            Arrays.asList("B", "C", "B", "C", "C", "A", "A", "B", "B", "A", "C",
                          "C", "B", "B", "C", "B", "D", "C", "C", "B", "A", "B",
                          "C", "A", "B", "C", "C", "C", "B", "A"));
        do {
            System.out.println(
                "<-------------------------------------Quiz Game--------------------------------------------------");
            do {
                System.out.println(
                    "What do you like to do:\nEnter \"1\" to start the Quiz.\nEnter \"2\" to add questions in Quiz game.\nEnter \"3\" to view your current score.");
                userChoice = scanner.nextInt();

                switch (userChoice) { // used switch because it is much better
                                      // than if in this situation as it reduces
                                      // complexity
                case 1: {
                    score =
                        quizGame(questions, options, answer, random, scanner);
                    break;
                }
                case 2: {
                    addQuestions(questions, options, answer, random, scanner);
                    break;
                }
                case 3: {
                    displayScore(score); /* called the score function according
                                             to choice of user */
                    scanner.nextLine();
                    break;
                }

                default: {
                    System.out.println(
                        "You have entered an invalid input\nKindly enter a valid input\n");
                }
                }

            } while (userChoice != 1 && userChoice != 2 && userChoice != 3);

            System.out.println(

                "Would u like to continue with our game?(true/false):");

            choose = Boolean.valueOf(
                scanner.nextLine()); // if you enter any variation of true like
                                     // true TruE it will be considered true
                                     // anything else than true will be
                                     // considered false
            if (!choose) {
                return;
            }
        } while (choose);
    }

    // method of actual quiz game
    public static int quizGame(ArrayList<String> questions,
                               ArrayList<String> options,
                               ArrayList<String> answer, Random random,
                               Scanner scanner) {
        System.out.println(
            "\nThe Quiz game works like this :\n1.You enter the number of Questions to answer.\n2.You have three tries If u fail thrice during the game the game will be over plus you must write capital A B C D to answer.\n3.Either you lose or you win you can see your score by entering \"2\" from the menu.\n");
        System.out.println("How many Question would you like to answer?");
        ArrayList<Integer> check = new ArrayList<>();
        int numberOfQuestions = scanner.nextInt();
        int tries = 0, score = 0;
        String userAnswer;
        scanner.nextLine();
        for (int i = 0; i < numberOfQuestions; i++) {
            // if (tries == 3) {
            //     System.out.println("You lost all your tries");
            //     System.out.println("Game Over");
            //     break;
            // }
            int question;
            do {
                question = random.nextInt(questions.size());
                if (check.contains(question)) {
                    continue;
                } else {
                    check.add(question); // it will continue to generate randoms
                                         // numbers until they are unique so no
                                         // duplication
                    break;
                }
            } while (true);
            do {
                System.out.println(
                    "----------------------------------------------------------------------------------------------------------");
                System.out.println(questions.get(question));
                System.out.println(options.get(question));
                System.out.print("Enter you answer:");
                userAnswer = scanner.nextLine();
                if (userAnswer.equals("A") || userAnswer.equals("B") ||
                    userAnswer.equals("C") || userAnswer.equals("D")) {
                    break;
                } else
                    System.out.println(
                        "You have entered an invalid Input!\nTryAgain!");

            } while (true);

            if (userAnswer.equals(answer.get(question))) {
                System.out.println(
                    "----------------------\nYour answer is correct.\n----------------------");
                score++;
            } else { // if user's answer is correct score increments otherwise
                     // tries increment and if tires is greater than 3 it
                     // displays game over
                System.out.println(

                    "---------------------------------\nYour answer is incorrect\nThe correct option is " +
                    answer.get(question) +
                    ".\n--------------------------------");
                tries++;
            }
            if (i == numberOfQuestions - 1) {
                System.out.println(
                    "You have successfully completed the game see your score from menu!");
            }
        }
        return score;
    }
    public static void displayScore(int score) { // method for displaying score
        System.out.println("Your current score is " + score + ".");
    }
    public static void addQuestions(ArrayList<String> questions,
                                    ArrayList<String> options,
                                    ArrayList<String> answer, Random random,
                                    Scanner scanner) {
        String userAnswer;
        System.out.println(
            "\nThe format of adding questions is like this :\n1.You will first add question\n2.Its options\n3.Correct answer option label like A,B,C,D (capital)\n");
        System.out.println("How many Questions would u like to enter:");
        int totalQuestions = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < totalQuestions; i++) {
            questions.add("");
            answer.add("");
            options.add("");
            int questionNumber = random.nextInt(questions.size());

            questions.set(questions.size() - 1, questions.get(questionNumber));
            System.out.println("Enter you question:");
            questions.set(questionNumber, scanner.nextLine());
            System.out.println("Enter option A:");
            String A = "A. " + scanner.nextLine();
            System.out.println("Enter option B:");
            String B = "B. " + scanner.nextLine();
            System.out.println("Enter option C:");
            String C = "C. " + scanner.nextLine();
            System.out.println("Enter option D:");
            String D = "D. " + scanner.nextLine();
            String combined = A + "\n" + B + "\n" + C + "\n" + D;
            options.set(options.size() - 1, options.get(questionNumber));
            options.set(questionNumber, combined);
            answer.set(answer.size() - 1, answer.get(questionNumber));
            do {
                System.out.println("Enter the correct option:");
                userAnswer = scanner.nextLine();
                if (userAnswer.equals("A") || userAnswer.equals("B") ||
                    userAnswer.equals("C") || userAnswer.equals("D")) {
                    break;
                } else
                    System.out.println(
                        "You have entered an invalid input\nEnter A,B,C or D");
            } while (true);
            answer.set(questionNumber, userAnswer);
            System.out.println("You Question " + (i + 1) +
                               " is added successfully!");
        }
        System.out.println("You have successfully added all your Questions");
    }
}
