public class PetSimulator {
    // instance variables
    String animal;
    String name;
    String gender;
    String color;
    String subjectPronoun;
    String objectPronoun;
    int age;
    int happiness = 100;
    int health = 100;
    int energy = 100;
    int level = 0;


    // overloaded constructors
    // 1. default no-parameter constructor with randomly generated animal and name
    public PetSimulator () {
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
            color = "spotted";
        } else if (random == 5) {
            color = "purple!";
        }

        age = (int) (Math.random() * 25) + 1;
    }

    // 2. user-decided inputs
    public PetSimulator (String name, String animal, String gender, String color, int age) {
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

    // public methods
    public void decidePronoun(){
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
    public String love () {

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

        } else if (random == 2) {

        } else if (random == 3) {

        } else if (random == 4) {

        } else if (random == 5) {

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

    public boolean fainted() {
        if (health > 0) {
            System.out.println(name + " has fainted!\nHelp " + objectPronoun + " revive by feeding " + objectPronoun + " a treat.");
            return true;
        } else {
            return false;
        }
    }

    // private helper methods

}
