import Analysis.HaikuAnalysis;
import UI.Menu;

public class HaikuApplication {
    private Menu menu = new Menu();
    private HaikuAnalysis analysis = new HaikuAnalysis();

    public static void main(String[] args) {
        HaikuApplication app = new HaikuApplication();

        app.menu.welcomeUser();

        app.menu.getFirstLine();
        app.menu.getSecondLine();
        app.menu.getThirdLine();

        //app.analysis.getFiveSyllables();



    }

}
