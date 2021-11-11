package Analysis;

import UI.Menu;

public class HaikuAnalysis {
    Menu menu = new Menu();

    public void getFiveSyllables() {

        while (menu)

        if (menu.userInput().split(" ").length != 5) {
            System.out.println("The word is not five syllables - try again");
        }

    }

}
