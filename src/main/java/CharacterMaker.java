import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class CharacterMaker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String characterName = "";
        String subraceString = "";
        String draconicAncestry = "";
        int strength = 0;
        int dexterity = 0;
        int constitution = 0;
        int intelligence = 0;
        int wisdom = 0;
        int charisma = 0;


        System.out.println("✨Welcome to Miles' Magical D&D 5e Character Maker (beta version 0.3)✨");
        System.out.println("Enter your character's name:");
        String usersCharacterName = input.nextLine();
        characterName = usersCharacterName;

        int raceInt = new Random().nextInt(8);
        String raceString = raceInt == 0 ? "Dwarf" : raceInt == 1 ? "Elf" : raceInt == 2 ? "Halfling" : raceInt == 3 ? "Human" : raceInt == 4 ? "Dragonborn" : raceInt == 5 ? "Gnomish" : raceInt == 6 ? "Half-Elf" : raceInt == 7 ? "Half-Orc" : "Tiefling";


        int archetypeInt = new Random().nextInt(11);
        String archetypeString = archetypeInt == 0? "Barbarian" : archetypeInt == 1? "Bard" : archetypeInt == 2? "Cleric" : archetypeInt == 3? "Druid" : archetypeInt == 4? "Fighter ⚔️" : archetypeInt == 5? "Monk" : archetypeInt == 6? "Paladin" : archetypeInt == 7? "Ranger" : archetypeInt == 8? "Rogue" : archetypeInt == 9? "Sorcerer" : archetypeInt == 10? "Warlock" : "Wizard";

        int subraceInt = new Random().nextInt(2);
        if (raceString == "Dwarf") {
            subraceString = subraceInt == 0 ? "Hill" : "Mountain";
            if (subraceString.equals("Hill")){
                wisdom += 1;
            } else strength += 2;
        }
        if (raceString.equals("Elf")) {
            subraceString = subraceInt == 0 ? "High" : subraceInt == 1 ? "Wood" : "Drow";
            if (subraceString.equals("High")){
                intelligence += 1;
            } else if (subraceString.equals("Wood")){
                wisdom += 1;
            } else charisma += 1;
        }
        if (raceString.equals("Halfling")) {
            subraceString = subraceInt == 0 ? "Stout" : "Lightfoot";
            if (subraceString.equals("Stout")){
                dexterity += 2;
            } else charisma += 1;
        }
        if (raceString.equals("Human")){
            strength += 1;
            dexterity += 1;
            constitution += 1;
            intelligence += 1;
            wisdom += 1;
            charisma += 1;
        }
        if (raceString.equals("Dragonborn")) {
            int draconicAncestryInt = new Random().nextInt(9);
            draconicAncestry = draconicAncestryInt == 0 ? "Black" : draconicAncestryInt == 1 ? "Blue" : draconicAncestryInt == 2 ? "Brass" : draconicAncestryInt == 3 ? "Bronze" : draconicAncestryInt == 4 ? "Copper" : draconicAncestryInt == 5 ? "Gold" : draconicAncestryInt == 6 ? "Green" : draconicAncestryInt == 7 ? "Red" : draconicAncestryInt == 8 ? "Silver" : "White";
            strength += 2;
            charisma += 1;
        }
        if (raceString.equals("Gnome")) {
            subraceString = subraceInt == 0 ? "Rock" : "Forest";
            if (subraceString.equals("Rock")){
                constitution += 1;
            } else dexterity += 1;
        }
        if (raceString.equals("Half-Elf")){
            intelligence += 1;
            wisdom += 1;
            charisma += 2;
        }
        if (raceString.equals("Half-Orc")){
            strength += 2;
            constitution += 1;
        }
        if (raceString.equals("Half-Orc")){
            charisma += 2;
            intelligence += 1;
        }

        System.out.println(characterName + " is a " + draconicAncestry + subraceString + " " +raceString + " " + archetypeString + "! Their ability scores (using Standard Array) are:");

        int[] highestAbilityScore = new int[2];
        highestAbilityScore[0] = 15;
        highestAbilityScore[1] = 14;

        List<Integer> lowerAbilityScore = new ArrayList<Integer>();
        lowerAbilityScore.add(13);
        lowerAbilityScore.add(12);
        lowerAbilityScore.add(10);
        lowerAbilityScore.add(8);
      Collections.shuffle(lowerAbilityScore);

      if (archetypeString.equals("Barbarian")  || archetypeString.equals("Fighter")) {
            strength += highestAbilityScore[0];
            constitution += highestAbilityScore[1];
            dexterity += lowerAbilityScore.get(0);
            intelligence += lowerAbilityScore.get(1);
            wisdom += lowerAbilityScore.get(2);
            charisma += lowerAbilityScore.get(3);
        } else if (archetypeString.equals("Sorcerer") || archetypeString.equals("Warlock")) {
            strength += lowerAbilityScore.get(3);
            constitution += highestAbilityScore[1];
            dexterity += lowerAbilityScore.get(0);
            intelligence += lowerAbilityScore.get(1);
            wisdom += lowerAbilityScore.get(2);
            charisma += highestAbilityScore[0];
        } else if (archetypeString.equals("Monk") || archetypeString .equals("Ranger")) {
            strength += lowerAbilityScore.get(3);
            constitution += lowerAbilityScore.get(0);
            dexterity += highestAbilityScore[0];
            intelligence += lowerAbilityScore.get(1);
            wisdom += highestAbilityScore[1];
            charisma += lowerAbilityScore.get(2);
        } else if (archetypeString.equals("Cleric") || archetypeString.equals("Druid")) {
            strength += lowerAbilityScore.get(3);
            constitution += highestAbilityScore[1];
            dexterity += lowerAbilityScore.get(0);
            intelligence += lowerAbilityScore.get(1);
            wisdom += highestAbilityScore[0];
            charisma += lowerAbilityScore.get(2);
        } else if (archetypeString.equals("Bard")) {
            strength += lowerAbilityScore.get(0);
            dexterity += highestAbilityScore[1];
            constitution += lowerAbilityScore.get(1);
            intelligence += lowerAbilityScore.get(2);
            wisdom += lowerAbilityScore.get(3);
            charisma += highestAbilityScore[0];
        } else if (archetypeString.equals("Paladin")) {
            strength += highestAbilityScore[0];
            dexterity += lowerAbilityScore.get(0);
            constitution += lowerAbilityScore.get(1);
            intelligence += lowerAbilityScore.get(2);
            wisdom += lowerAbilityScore.get(3);
            charisma += highestAbilityScore[1];
        } else if (archetypeString.equals("Rogue")) {
            strength += lowerAbilityScore.get(0);
            dexterity += highestAbilityScore[0];
            constitution += lowerAbilityScore.get(1);
            intelligence += lowerAbilityScore.get(3);
            wisdom += lowerAbilityScore.get(2);
            charisma += highestAbilityScore[1];
        } else { //for Wizard
            strength += lowerAbilityScore.get(0);
            dexterity += lowerAbilityScore.get(1);
            constitution += highestAbilityScore[1];
            intelligence += lowerAbilityScore.get(3);
            wisdom += lowerAbilityScore.get(2);
            charisma += highestAbilityScore[0];
        }
        // if want make multiple characters: Collections.shuffle(lowerAbilityScore);

        System.out.println("Strength: " + strength + " Dexterity: " + dexterity +  " Constitution: " + constitution + " Intelligence: " + intelligence + " Wisdom: " + wisdom + " Charisma: " + charisma);

        }
    }
