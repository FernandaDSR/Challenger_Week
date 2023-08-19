package Question_02;
import java.util.*;

public class Entry {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Type an emoji");
        String emotions = scan.nextLine();
        scan.close();

        int funCount = Exit.countEmotions(emotions, ":-)");
        int upsetCount = Exit.countEmotions(emotions, ":-(");

        String feelings = Exit.determineFeeling(funCount, upsetCount);

        System.out.println(feelings);

    }

}
