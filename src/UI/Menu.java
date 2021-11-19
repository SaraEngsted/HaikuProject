package UI;

import Analysis.HaikuPoem;

import java.util.Scanner;

public class Menu {
    private Scanner inputFromUser;

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

    public String getAuthor() {

        System.out.println("Author of poem: ");
        String author = inputFromUser.nextLine();
        return author;
    }

    public String getFirstLine() {

        HaikuPoem.firstLine();
        String firstLine = inputFromUser.nextLine();

        return firstLine;
    }

    public String getSecondLine() {

        HaikuPoem.secondLine();
        String secondLine = inputFromUser.nextLine();

        return secondLine;
    }

    public String getThirdLine() {

        HaikuPoem.thirdLine();
       String thirdLine = inputFromUser.nextLine();

       return thirdLine;
    }

    public int quitHaikuApp() {

        System.out.println("PRESS '1' TO WRITE A POEM \nPRESS '0' TO QUIT APP ");
        int quitApp = Integer.parseInt(inputFromUser.nextLine());
        return quitApp;
    }
}
