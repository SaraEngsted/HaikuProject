package UI;

import Analysis.HaikuPoem;

import java.util.Scanner;

public class Menu {
    private Scanner inputFromUser;
    Scanner scanner = new Scanner(System.in);

    public Menu(){
        this.inputFromUser = new Scanner(System.in);
    }

    public void welcomeUser() {
        System.out.println("💌💌💌💌💌💌💌💌💌💌💌💌💌💌💌💌💌💌💌");
        System.out.println();
        System.out.println("Welcome to the Haiku Poem app! ");
        System.out.println("In this app you can write your \nown Haiku poem and the app will \nthen tell you if it is a real \nHaiku poem ");
        System.out.println();
        System.out.println("💌💌💌💌💌💌💌💌💌💌💌💌💌💌💌💌💌💌💌");
        System.out.println();
        System.out.println("Haiku Poem rules: \n- 3 lines \n- 1. and 2. line has 5 syllables \n- 3. line has 7 syllables \n- The poem does not have to rime ");
        System.out.println();
        System.out.println("💌💌💌💌💌💌💌💌💌💌💌💌💌💌💌💌💌💌💌");

    }


    public void userInput() {

        HaikuPoem.getFirstLine();
        scanner.nextLine();

        HaikuPoem.getSecondLine();
        scanner.nextLine();

        HaikuPoem.getThirdLine();
        scanner.nextLine();

    }
}
