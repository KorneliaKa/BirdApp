
import java.util.Scanner;

public class BirdApp {


    static void printMenu(){
        System.out.println("1. Add bird:");
        System.out.println("2. Add bird's localization:");
        System.out.println("3. Find bird typing its feathers' colours:");
        System.out.println("4. Find bird using the continent of occurrence:");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printMenu();
            String command = scanner.nextLine();
            switch (command) {
                case "1":

                    System.out.println("Add bird's name:");
                    String name = scanner.nextLine();
                    System.out.println("Add feathers' colours:");
                    String colours = scanner.nextLine();
                    System.out.println("Add bird's size: small, middle, big");
                    String birdSize = scanner.nextLine();
                    BirdDataMethods birdDataMethods = new BirdDataMethods();
                    birdDataMethods.addBird(name, colours, birdSize);
                    break;


                    case "2":
                        System.out.println("Add bird's continent:");
                        String continent = scanner.nextLine();
                        System.out.println("Add bird's country:");
                        String country = scanner.nextLine();
                        System.out.println("Add bird's environment:");
                        String environment = scanner.nextLine();
                        BirdDataMethods birdDataMethods1 = new BirdDataMethods();
                        birdDataMethods1.addLocalization(continent, country, environment);
                        break;

                case "3":
                    System.out.println("Type feathers' colours:");
                    String featherColours = scanner.nextLine();
                    BirdDataMethods birdDataMethods2 = new BirdDataMethods();
                    birdDataMethods2.findBirdUsingColours(featherColours);
                    break;

                case "4":
                    System.out.println("Type continent of a bird's occurrence:");
                    String continentOfOccurrence = scanner.nextLine();
                    BirdDataMethods birdDataMethods3 = new BirdDataMethods();
                    birdDataMethods3.findBirdUsingContinent(continentOfOccurrence);


        }


    }
} }