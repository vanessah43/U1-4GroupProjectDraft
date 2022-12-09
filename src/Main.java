import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // initializing objects & vars
        Scanner scan = new Scanner(System.in);
        int selection = 0;

        // welcomes & greets user
        System.out.println(".❀。• *₊°。 ❀°。 ");
        System.out.println("Pet Simulator ᓚᘏᗢ");
        System.out.println("What's your name?");
        String user = scan.nextLine();
        System.out.println("Welcome, " + user + "! ♡₊˚ʚ ᗢ₊˚✧ ﾟ.");

        // creating user's first pet (collecting input)
        String petName;
        String animal;
        String gender;
        String color;
        int age;
        System.out.println("︵‿୨୧‿︵ ");
        System.out.println("Your first pet! ˚ʚ♡ɞ˚");
        System.out.println("Fill in the information below.");
        System.out.print("Name: ");
        petName = scan.nextLine();
        System.out.print("Animal: ");
        animal = scan.nextLine();
        System.out.print("Gender ([1] male [2] female): ");
        selection = scan.nextInt();
        if (selection == 1) {
            gender = "female";
        } else {
            gender = "male";
        }
        System.out.print("Color: ");
        color = scan.nextLine();
        System.out.print("Age: ");
        age = scan.nextInt();

        // creating Pet object using user input
        Pet firstPet =  new Pet(petName, animal, gender, color, age);
        System.out.println(petName + " has been spawned.");
        System.out.println(firstPet.petIntroduction());
        System.out.println("Hooray! Your first pet has been created. Look around!");

        // "choose your own adventure"-style menu
        selection = 1;
        while (selection != 0) {
            System.out.println("Menu");
            System.out.println("[0] Exit");
            System.out.println("[1] View inventory");
            System.out.println("[2] Take a walk");
            System.out.println("[3] Feed your pet");
            System.out.println("[4] Find pet love");
            System.out.println("[5] Create a new pet");

            selection = scan.nextInt();
            if (selection == 0) {
                break;
            } else if (selection == 1) {

            } else if (selection == 2) {

            } else if (selection == 3) {

            } else if (selection == 4) {

            } else if (selection == 5) {

            }
        }

        // end of game, goodbye!
        System.out.println("Thanks for playing! ");
        System.out.println("Would you like to view your final stats?");
        System.out.println("[1] Yes [2] No: ");
        selection = scan.nextInt();
        if (selection == 1) {
            for each :
            System.out.println();
        } else {
            System.out.println("Thank you " + "! Good day.");
            System.exit(0);
        }
    }
}