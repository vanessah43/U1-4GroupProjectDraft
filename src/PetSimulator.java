import java.util.Scanner;
public class PetSimulator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pet adam = new Pet("Adam", "cat", "male", "brown", 5);
        Pet eve = new Pet("Eve", "cat", "female", "black", 5);
        adam.getPets();
    }
}
