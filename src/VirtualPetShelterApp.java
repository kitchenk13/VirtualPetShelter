import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
public class VirtualPetShelterApp {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Whats your Pets status?");
            }
        };
        timer.schedule(timerTask, 0, 600000);

        System.out.println("Hello, Welcome to Kennys Shelter and Adoption Center");
        System.out.println("What would you like to do?");
        Scanner input = new Scanner(System.in);
        ArrayList<String> petNames = new ArrayList<>();
        ArrayList<String> options = new ArrayList<>();
        String message = input.nextLine();
        options.add("I just want to look around.");
        options.add("I want to admit a pet.");
        options.add("I want to adopt a pet,");
        options.add("No help needed, i'm heading out!");
        System.out.println("If you would like to adopt a pet, we have 4 pets available. Enter 1 if you would like to know thier names?");
        int petNames1 =2;
        petNames.add("Simba");
        petNames.add("Debo");
        petNames.add("Jax");
        petNames.add("Melo");

        if (petNames1 == 2) {
            System.out.println("The pets names are " + petNames);
        }

        String petNames = input.nextLine();
        String options1 = input.nextLine();
        System.out.println("Im going to feed and give the pets some water before you see them");
        System.out.println("To get the Status of the pets enter 0");
        System.out.println("Type 0 to get status of pets");
        int getStatus = input.nextInt();
        int thirstLevel = (int)(Math.random() * 50 + 1);
        int energyLevel = (int)(Math.random() * 50 + 1);
        int boredomLevel = (int)(Math.random() * 50 + 1);
        int thirstLevel2 = (int)(Math.random() * 50 + 1);
        int energyLevel2 = (int)(Math.random() * 50 + 1);
        int boredomLevel2 = (int)(Math.random() * 50 +1);
        int thirstLevel3 = (int)(Math.random() * 50 + 1);
        int energyLevel3 = (int)(Math.random() * 50 + 1);
        int boredomLevel3 = (int)(Math.random() * 50 + 1);
        int thirstLevel4 = (int)(Math.random() * 50 + 1);
        int energyLevel4 = (int)(Math.random() * 50 + 1);
        int boredomLevel4 = (int)(Math.random() * 50 +1);
        if (getStatus == 0) {
            // Is there a way to print all 3 values in one print line?
            System.out.println("The status of Simba's thirst is " + thirstLevel);
            System.out.println("The status of Simba's energy is " + energyLevel);
            System.out.println("The status of Simba's boredom is " + boredomLevel);
            System.out.println("The status of Debo's thirst is " + thirstLevel2);
            System.out.println("The status of Debo's energy is " + energyLevel2);
            System.out.println("The status of Debo's boredom is " + boredomLevel2);
            System.out.println("The status of Jax's thirst is " + thirstLevel3);
            System.out.println("The status of Jax's energy is " + energyLevel3);
            System.out.println("The status of Jax's boredom is " + boredomLevel3);
            System.out.println("The status of Melo's thirst is " + thirstLevel4);
            System.out.println("The status of Melo's energy is " + energyLevel4);
            System.out.println("The status of Melo's boredom is " + boredomLevel4);
            int newThirstLevel = (thirstLevel *2);
            int newThirstLevel2 = (thirstLevel2 *2);
            int newThirstLevel3 = (thirstLevel3 *2);
            int newThirstLevel4 = (thirstLevel4 *2);
            int newEnergyLevel2 = (energyLevel2 -10);
            System.out.println("Enter 1 to display updated levels");
            int updatedLevels = input.nextInt();
            if (updatedLevels == 1) {
                System.out.println("The status of Simba's thirst is now " + newThirstLevel);
                System.out.println("The status of Debo's thirst is now " + newThirstLevel2);
                System.out.println("The status of Jax's thirst is now " + newThirstLevel3);
                System.out.println("The status of Melo's thirst is now " + newThirstLevel4);
                System.out.println("Debo seems to have been playing pretty hard, his energy level dropped");
            }
            String adoptedPet = input.nextLine();
            String admittedPet = input.nextLine();
            if (options1  == "Look around"); {
                System.out.println("Go ahead and look around!");
            }
            if (options1 == "Admit a pet!") {
                System.out.println("Cool, let me get the paper work!");
                System.out.println("Thanks for admitting " + admittedPet + "we will take good care of them!");
                petNames.add(admittedPet);
            }
            if (adoptedPet == input.nextLine() ) {
                System.out.println("Which pet would you like  to Adopt. Simba, Debo, Jax and Melo are all available");
            }
            if (options1 == "No help needed, im leaving."); {
                System.out.println("Have a nice day");
                System.exit(0);
            }
        }
    }

}
