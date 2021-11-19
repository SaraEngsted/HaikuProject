package Analysis;

public class HaikuPoem {
    private static String firstLine;
    private static String secondLine;
    private static String thirdLine;
    private static String author;
    private int haikuID;
    private static int counter = 0;

    public HaikuPoem(String firstLine, String secondLine, String thirdLine, String author) {
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.thirdLine = thirdLine;
        this.author = author;
        counter++;
        this.haikuID = counter;
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

    @Override
    public String toString() {
        return "HaikuPoem{" +
                "haikuID=" + haikuID +
                '}';
    }
}
