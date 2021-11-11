package Analysis;

public class HaikuPoem {
    private static String firstLine;
    private static String secondLine;
    private static String thirdLine;

    public HaikuPoem(String firstLine, String secondLine, String thirdLine) {
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.thirdLine = thirdLine;
    }

    public static String getFirstLine() {
        System.out.println("Please write the first line of your poem: ");
        return firstLine;
    }

    public static String getSecondLine() {
        System.out.println("Please write the second line of your poem: ");
        return secondLine;
    }

    public static String getThirdLine() {
        System.out.println("Please write your third line of your poem: ");
        return thirdLine;
    }

}
