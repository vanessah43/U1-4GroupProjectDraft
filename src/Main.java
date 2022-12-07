import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(".❀。• *₊°。 ❀°。 ");
        System.out.println("Pet Simulator ᓚᘏᗢ");
        System.out.println("Welcome! ♡₊˚ʚ ᗢ₊˚✧ ﾟ.");

        String name;
        String animal;
        String gender
        String color;
        int age;
        System.out.println("︵‿୨୧‿︵ ");
        System.out.println("Your first pet! ˚ʚ♡ɞ˚");
        System.out.print("Name: ");
        name = scan.nextLine();
        System.out.print("Animal: ");
        animal = scan.nextLine();
        System.out.print("Gender (male/female): ");
        gender = scan.nextLine();
        System.out.print("Color: ");
        color = scan.nextLine();
        System.out.print("Age: ");
        age = scan.nextInt();

        Pet firstPet =  new Pet(name, animal, gender, color, age);
        System.out.println("Hooray! Your first pet has been created. Look around!");

        int selection = 5;
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

            } else if (selection == 1) {

            } else if (selection == 2) {

            } else if (selection == 3) {

            } else if (selection == 4) {

            } else if (selection == 5) {

            }
        }

        System.out.println("Thanks for playing! ");

    }
}