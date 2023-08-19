package Question_02;
import java.util.*;

public class Entry {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Type an emoji");
        String emotions = scan.nextLine();
        scan.close();

        int funCount = exit.countEmotions(emotions, ":-)");
        int upsetCount = exit.countEmotions(emotions, ":-(");
    }

}
