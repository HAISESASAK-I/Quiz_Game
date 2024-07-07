import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class QUIZGAME {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> questions = new ArrayList<>(Arrays.asList());
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