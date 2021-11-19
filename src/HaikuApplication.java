import Analysis.HaikuAnalysis;
import Analysis.HaikuPoem;
import Data.HaikuWriter;
import UI.Menu;

import java.util.Scanner;

public class HaikuApplication {
    private final Menu menu = new Menu();
    private final HaikuAnalysis analysis = new HaikuAnalysis();
    private final HaikuWriter haikuWriter = new HaikuWriter();

    public static void main(String[] args) {
        HaikuApplication app = new HaikuApplication();

        //Welcome user
        app.menu.welcomeUser();

        //Loop to either quit or to write a poem
        while (true) {
            int quitOrNot = app.menu.quitHaikuApp();

            if (quitOrNot == 1) {
                String author = app.menu.getAuthor();
                String firstLine = app.menu.getFirstLine();
                String secondLine = app.menu.getSecondLine();
                String thirdLine = app.menu.getThirdLine();

                HaikuPoem createPoem = new HaikuPoem(author, firstLine, secondLine, thirdLine);

                boolean valid = app.analysis.isPoemValid(createPoem);

                if (valid == true) {
                    app.haikuWriter.savedHaikuPoems(createPoem);
                } else if (quitOrNot == 0) {
                    System.out.println("Goodbye for now");
                    break;
                }

                }
            }
        }
    }
