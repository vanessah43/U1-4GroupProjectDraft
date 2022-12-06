public class Pet {
    // instance variables
    private String animal;
    private String name;
    private String gender;
    private String color;
    private String subjectPronoun;
    private String objectPronoun;
    private int age;
    private int happiness = 100;
    private int health = 100;
    private int energy = 100;
    private int level = 0;
    private Pet spouse;
    private String inventory;


    // overloaded constructors
    // 1. default no-parameter constructor with randomly generated animal and name
    public Pet () {
        int random = (int) (Math.random() * 5) + 1;
        if (random == 1) {
            animal = "dog";
        } else if (random == 2) {
            animal = "cat";
        } else if (random == 3) {
            animal = "bunny";
        } else if (random == 4) {
            animal = "hamster";
        } else if (random == 5) {
            animal = "snake";
        }

        random = (int) (Math.random() * 5) + 1;
        if (random == 1) {
            name = "Angela";
            gender = "female";
        } else if (random == 2) {
            name = "Tom";
            gender = "male";
        } else if (random == 3) {
            name = "Sienna";
            gender = "female";
        } else if (random == 4) {
            name = "Momo";
            gender = "female";
        } else if (random == 5) {
            name = "Boots";
            gender = "male";
        }

        random = (int) (Math.random() * 5) + 1;
        if (random == 1) {
            color = "brown";
        } else if (random == 2) {
            color = "black";
        } else if (random == 3) {
            color = "gray";
        } else if (random == 4) {
            color = "taupe";
        } else if (random == 5) {
            color = "white";
        }

        age = (int) (Math.random() * 25) + 1;
    }

    // 2. user-decided inputs
    public Pet (String name, String animal, String gender, String color, int age) {
        this.name = name;
        this.animal = animal;
        this.gender = gender;
        this.color = color;
        this.age = age;
    }

    // setters & getters
    public int getEnergy() {
        return energy;
    }

    public String receiveInput(String input) {
        return input;
    }

    // public methods
    public void decidePronoun() {
        if (gender.equals("female")) {
            subjectPronoun = "she";
            objectPronoun = "her";
        } else if (gender.equals("male")) {
            subjectPronoun = "he";
            objectPronoun = "him";
        } else {
            subjectPronoun = "it";
            objectPronoun = "it";
        }
    }
    public void love (Pet spousePet) {
        System.out.println(name + " and " + spousePet.name + " have fallen in love!");
        System.out.println("꒰ঌ♡໒꒱");
        happiness += 20;
        spousePet.addHappiness(20);
        spousePet.setSpouse(Pet); //?
        int random = (int)(Math.random() * 2) + 1;
        if (random == 1) {
            procreate(spousePet);
        }
        System.out.println();
    }

    public Pet procreate(Pet spousePet) {
        int random = (int)(Math.random() * 2) + 1;
        String babyGender;
        if (random == 1) {
            babyGender = "female";
        } else {
            babyGender = "male";
        }

        String babyColor;
        if (color.equals(spousePet.color)) {
            babyColor = color;
        } else {
            random = (int) (Math.random() * 3) + 1;
            if (random == 1) {
                babyColor = "spotted";
            } else if (random == 2) {
                babyColor = "speckled";
            } else if (random == 3) {
                babyColor = "mottled";
            }

            if (!strangeColor() && !(spousePet.strangeColor())) {
                random = (int) (Math.random() * 2) + 1;
                if (random == 1) {
                    babyColor += " " + color;
                } else {
                    babyColor += " " + spousePet.color;
                }
            }
        }

        if (animal.equals(spousePet.animal)) {
            String babyAnimal = animal;
        } else {
            String babyAnimal = animal + "-" + spousePet.animal;
        }


        Pet newPet = new Pet(receiveInput(), babyAnimal, babyGender, babyColor, 0);
        return newPet;
    }

    public String petIntroduction() {
        return name + " is a " + gender + " " + color + " " + animal + " and is " + age + " years old.";
    }

    public String petInfo() {
        return "Pet: " + animal + "\nName: " + name + "\nGender: " + gender + "\nColor: " + color + "\nAge: " + age;
    }

    public String petStats() {
        return "Happiness: " + happiness + "\nHealth: " + health + "\nEnergy: " + energy;
    }

    public void play() {
        happiness += 20;
        energy -= 5;
        System.out.println(name + " is happy! *:･ﾟ✧*:･ﾟ✧");
        if (health < 50) {
            System.out.println(name + " is getting tired... ૮ ◞ ﻌ ◟ ა");
        }
    }

    public void feed(int treats) {
        System.out.println(name + " is being fed!");
        System.out.println(subjectPronoun + " loves ");
        energy += treats * 5;
        if (energy > 50) {
            happiness += 15;
            health += 10;
            System.out.println(name + " is happy! ♡⸜(˶˃ ᵕ ˂˶)⸝♡ Come play!");
        }
    }

    public void walk() {
        System.out.println(name + " is going with you on a walk! ᠃ ⚘᠂ ⚘ ˚ ⚘ ᠂ ⚘ ᠃ ");
        int random = (int) (Math.random() * 5) + 1;
        if (random == 1) {
            System.out.println("⋆｡° ʚĭɞೃ¸¸.•*¨*•");
            System.out.println("A butterfly floats by!");

        } else if (random == 2) {
            System.out.println("It's a beautiful day! sun emoji");
            foundPet();
        } else if (random == 3) {

        } else if (random == 4) {

        } else if (random == 5) {

        }
    }

    public Pet foundPet() {
        System.out.println("You come across a new pet!");
        Pet newPet = new Pet();
        System.out.println(newPet.petIntroduction());
        System.out.println("Would you like to keep this?");
        return newPet;
    }

    public void keepPet(String userInput, Pet newPet) {
        if (userInput().equals("Y")) {
            inventory += newPet;
            System.out.println("Hooray! " + newPet.name + " has been added to inventory.");
        } else {
            System.out.println("Alright! " + newPet.name + " has been released into the wild.");
        }
    }

    public void levelUp() {
        if (happiness > 200) {
            while (happiness > 100) {
                happiness -= 100;
                level++;
            }
        } else if (happiness < 0) {
            while (happiness < 0) {
                happiness += 100;
                level--;
            }
        }
    }

    public void increaseAge() {
        if (level % 5 == 0) {
            age++;
        }
    }
    public boolean fainted() {
        if (health > 0) {
            System.out.println(name + " has fainted!\nHelp " + objectPronoun + " revive by feeding " + objectPronoun + " a treat.");
            return true;
        } else {
            return false;
        }
    }

    // private helper methods
    private void addHappiness(int points) {
        happiness += points;
    }

    private void setSpouse(Pet spouse) {
        this.spouse = spouse;
    }

    private boolean strangeColor() {
        if (color.equals("taupe") || color.equals("brown") || color.equals("black") || color.equals("grey") || color.equals("white")) {
            return false;
        }
        return true;
    }


    // closing brace
}
