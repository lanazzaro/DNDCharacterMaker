import java.util.Random;
import java.util.Scanner;

public class CharacterGenerator {
//contains more than the basics, ie races and subraces
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String characterName = "";
    String subraceString = "";
    String draconicAncestry = "";


    System.out.println("Welcome to Miles' Magical Dungeons & Dragons Character Maker");
    System.out.println("Give me a name and I'll generate a character sheet for them");
    String usersCharacterName = input.nextLine();
    characterName = usersCharacterName;

    int raceInt = new Random().nextInt(8);
    String raceString = raceInt == 0 ? "Dwarf" : raceInt == 1 ? "Elf" : raceInt == 2 ? "Halfling" : raceInt == 3 ? "Human" : raceInt == 4 ? "Dragonborn" : raceInt == 5 ? "Gnome" : raceInt == 6 ? "Half-Elf" : raceInt == 7 ? "Half-Orc" : "Tiefling";


    int subraceInt = new Random().nextInt(2);
    if (raceString == "Dwarf") {
        subraceString = subraceInt == 0 ? "Hill" : "Mountain";
    }
    if (raceString == "Elf") {
        subraceString = subraceInt == 0 ? "High" : subraceInt == 1 ? "Wood" : "Drow";
    }
    if (raceString == "Halfling") {
        subraceString = subraceInt == 0 ? "Stout" : "Lightfoot";
    }
    if (raceString == "Dragonborn") {
        subraceString = "";
        int draconicAncestryInt = new Random().nextInt(9);
        draconicAncestry = draconicAncestryInt == 0 ? "Black" : draconicAncestryInt == 1 ? "Blue" : draconicAncestryInt == 2 ? "Brass" : draconicAncestryInt == 3 ? "Bronze" : draconicAncestryInt == 4 ? "Copper" : draconicAncestryInt == 5 ? "Gold" : draconicAncestryInt == 6 ? "Green" : draconicAncestryInt == 7 ? "Red" : draconicAncestryInt == 8 ? "Silver" : "White";
    }
    if (raceString == "Gnome") {
        subraceString = subraceInt == 0 ? "Rock" : "Forest";
    }

    System.out.println(characterName + " is a " + subraceString + draconicAncestry + " " + raceString + ".");

    //random ability score maker
    int[] randomAbilityScore = new int[6];
    for(int i = 0 ; i < randomAbilityScore.length ; i++){
        randomAbilityScore[i] = (new Random().nextInt(6)) + (new Random().nextInt(6)) + (new Random().nextInt(6)) + (new Random().nextInt(6)) + (new Random().nextInt(6));
    }             System.out.println("Strength: " + randomAbilityScore[0] + " Dexterity: "+ randomAbilityScore[1] + " Constitution: "+ randomAbilityScore[2] + " Intelligence: "+ randomAbilityScore[3] + " Wisdom: "+ randomAbilityScore[4] + " Charisma: "+ randomAbilityScore[5] + ".");
}

//each class by itself
//            if (archetypeString == "Barbarian") {
//        strength += highestAbilityScore[0];
//        constitution += highestAbilityScore[1];
//        dexterity += lowerAbilityScore.get(0);
//        intelligence += lowerAbilityScore.get(1);
//        wisdom += lowerAbilityScore.get(2);
//        charisma += lowerAbilityScore.get(3);
//    }
//        if (archetypeString == "Fighter") {
//        strength += highestAbilityScore[0];
//        constitution += highestAbilityScore[1];
//        dexterity += lowerAbilityScore.get(0);
//        intelligence += lowerAbilityScore.get(1);
//        wisdom += lowerAbilityScore.get(2);
//        charisma += lowerAbilityScore.get(3);
//    }
//        if (archetypeString == "Sorcerer") {
//        strength += lowerAbilityScore.get(3);
//        constitution += highestAbilityScore[1];
//        dexterity += lowerAbilityScore.get(0);
//        intelligence += lowerAbilityScore.get(1);
//        wisdom += lowerAbilityScore.get(2);
//        charisma += highestAbilityScore[0];
//    }
//        if (archetypeString == "Warlock") {
//        strength += lowerAbilityScore.get(3);
//        constitution += highestAbilityScore[1];
//        dexterity += lowerAbilityScore.get(0);
//        intelligence += lowerAbilityScore.get(1);
//        wisdom += lowerAbilityScore.get(2);
//        charisma += highestAbilityScore[0];
//    }
//        if (archetypeString == "Monk") {
//        strength += lowerAbilityScore.get(3);
//        constitution += lowerAbilityScore.get(0);
//        dexterity += highestAbilityScore[0];
//        intelligence += lowerAbilityScore.get(1);
//        wisdom += highestAbilityScore[1];
//        charisma += lowerAbilityScore.get(2);
//    }
//        if (archetypeString == "Ranger") {
//        strength += lowerAbilityScore.get(3);
//        constitution += lowerAbilityScore.get(0);
//        dexterity += highestAbilityScore[0];
//        intelligence += lowerAbilityScore.get(1);
//        wisdom += highestAbilityScore[1];
//        charisma += lowerAbilityScore.get(2);
//    }
//        if (archetypeString == "Cleric") {
//        strength += lowerAbilityScore.get(3);
//        constitution += highestAbilityScore[1];
//        dexterity += lowerAbilityScore.get(0);
//        intelligence += lowerAbilityScore.get(1);
//        wisdom += highestAbilityScore[0];
//        charisma += lowerAbilityScore.get(2);
//    }
//        if (archetypeString == "Druid") {
//        strength += lowerAbilityScore.get(3);
//        constitution += highestAbilityScore[1];
//        dexterity += lowerAbilityScore.get(0);
//        intelligence += lowerAbilityScore.get(1);
//        wisdom += highestAbilityScore[0];
//        charisma += lowerAbilityScore.get(2);
//    }
//        if (archetypeString == "Bard") {
//        strength += lowerAbilityScore.get(0);
//        dexterity += highestAbilityScore[1];
//        constitution += lowerAbilityScore.get(1);
//        intelligence += lowerAbilityScore.get(2);
//        wisdom += lowerAbilityScore.get(3);
//        charisma += highestAbilityScore[0];
//    }
//        if (archetypeString == "Paladin") {
//        strength += highestAbilityScore[0];
//        dexterity += lowerAbilityScore.get(0);
//        constitution += lowerAbilityScore.get(1);
//        intelligence += lowerAbilityScore.get(2);
//        wisdom += lowerAbilityScore.get(3);
//        charisma += highestAbilityScore[1];
//    }
//        if (archetypeString == "Rogue") {
//        strength += lowerAbilityScore.get(0);
//        dexterity += highestAbilityScore[0];
//        constitution += lowerAbilityScore.get(1);
//        intelligence += lowerAbilityScore.get(3);
//        wisdom += lowerAbilityScore.get(2);
//        charisma += highestAbilityScore[1];
//    }
//        if (archetypeString == "Wizard") {
//        strength += lowerAbilityScore.get(0);
//        dexterity += lowerAbilityScore.get(1);
//        constitution += highestAbilityScore[1];
//        intelligence += lowerAbilityScore.get(3);
//        wisdom += lowerAbilityScore.get(2);
//        charisma += highestAbilityScore[0];
//    }
}
