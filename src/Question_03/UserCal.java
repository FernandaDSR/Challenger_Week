package Question_03;
import java.util.*;

public class UserCal {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int testNumber = 1;

        while(true){
            String input = scan.nextLine();

            if(input.equals("0")){
                break;
            }

            int n = Integer.parseInt(input);
            String expression = scan.nextLine();
            Test test = new Test(n,expression);
            double result = Cal.evalueteExpression(test.getExpression());

            System.out.println("Test" + testNumber);
            System.out.println(result);
            System.out.println();

            testNumber++;


        }
        scan.close();
    }

}
