import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;



public class Character {

    Scanner myScanner = new Scanner(System.in);
    Scanner enterScanner = new Scanner(System.in);

    String playerName;
    String playerRace;
    String playerGender;
    String playerClass;

    int playerHP;
    int playerLevel;
    int playerStr;
    int playerWis;
    int playerCha;
    int playerDex;
    int playerCon;
    int playerInt;

    public static void main(String[] args) {

        Character alpha;
        alpha = new Character();
        alpha.setPlayerName();
        alpha.assignGender();
        alpha.assignClass();
        alpha.setPlayerStats();
    }

    public String setPlayerName() {
        System.out.println("What's your name, traveller?");
        playerName = myScanner.nextLine();

        System.out.println("Welcome " + playerName + "!");
        assignRace();
        return playerName;
    }

    public String assignRace() {
        System.out.println("What race are you?");
        String[] raceArray = new String[] {"Human", "Argonian", "Dark Elf", "High Elf", "Hobbit", "Khajit", "Dwarf", "Halfling"} ;
    
        System.out.println(Arrays.toString(raceArray));

        playerRace = myScanner.nextLine();
    

        List<String> raceList = new ArrayList<>(Arrays.asList(raceArray));
        if(raceList.contains(playerRace)){
            System.out.println("Ah, a " + playerRace + "! one of my best friends is a " + playerRace + " so I'm definitely not racist towards your people. Say... What gender are you?");
            
        } else {
            System.out.println("What's that? Didn't catch what you said...");
            assignRace();
        }
        return playerRace;
        
    };

    public String assignGender() {
        String[] genderArray = new String[] {"Male", "Female", "Non-Binary", "None of your business"};
    
        System.out.println(Arrays.toString(genderArray));

        playerGender = myScanner.nextLine();

        List<String> genderList = new ArrayList<>(Arrays.asList(genderArray));
        if(genderList.contains(playerGender)){
            System.out.println("Neat. That's not important here but it's interesting to ask. What kind of fighter are you?");
        } else {
            System.out.println("I'm really hard of hearing, please speak up...");
           assignGender(); 
        }
        return playerGender;
    
    };

    public String assignClass() {
        String[] classArray = new String[] {"Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Necromancer", "Paladin", "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard"};
    
        System.out.println(Arrays.toString(classArray));

        playerClass = myScanner.nextLine();

        List<String> classList = new ArrayList<>(Arrays.asList(classArray));
        if(classList.contains(playerClass)){
            System.out.println(playerClass + "s are fierce! lets roll your stats!");
        } else {
            System.out.println("Didn't catch that, sweetie please speak up...");
           assignClass(); 
        }
        return playerClass;
    }


    public void setPlayerStats() {
        rollStats();
    }

    public int[] rollStats () {
        int statsArray[];
        statsArray = new int[6];
        

        for (int x = 0; x <= 5; x++) {
            Random r = new Random();
            int min = 1;
            int max = 20;
            int result = r.nextInt(max - min) + min;

            statsArray[x] = result;
        }

        

        System.out.println(Arrays.toString(statsArray));
        return statsArray;
        
    }

}
