package Analysis;

import UI.Menu;

public class HaikuAnalysis {
    public static char[] vowelsPerLine = {'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u', 'Y', 'y', 'Æ', 'æ', 'Ø', 'ø', 'Å', 'å'};

    public boolean validIfFive(String poem) {
        int counter = 0;
        char[] userInput = poem.toCharArray();

        for (int i = 0; i < userInput.length; i++) {
            char characterInLine = userInput[i];
            for (int j = 0; j < vowelsPerLine.length; j++) {
                if (characterInLine == vowelsPerLine[j]) {
                    counter ++;
                }
            }
        }

        if (counter == 5) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validIfSeven(String poem) {
        int counter = 0;
        char[] userInput = poem.toCharArray();

        for (int i = 0; i < userInput.length; i++) {
            char characterInLine = userInput[i];
            for (int j = 0; j < vowelsPerLine.length; j++) {
                if (characterInLine == vowelsPerLine[j]) {
                    counter ++;
                }
            }
        }

        if (counter == 7) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPoemValid(HaikuPoem valid) {
        String lineOne = valid.firstLine();
        String lineTwo = valid.secondLine();
        String lineThree = valid.thirdLine();

        if (validIfFive(lineOne) && validIfSeven(lineTwo) && validIfFive(lineThree)) {
            System.out.println("Your poem is valid " + valid + " and will now be saved...");
            return true;
        } else {
            System.out.println("Invalid poem!");
            return false;
        }

    }


    }

