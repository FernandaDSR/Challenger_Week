package Question_01;
import java.util.*;

public class Student {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        List<Competition.Students> student = new ArrayList<>();

        for (int i = 0; i < n; i++){
            String[] input = scan.nextLine().split(" ");
            String name = input[0];
            int problemSolved = Integer.parseInt(input[1]);
            student.add(new Competition.Students(name, problemSolved));
        }

        Collections.sort(student);

        Competition.Students failedStudent = student.get(n - 1);


        System.out.println(failedStudent.name);
        if(failedStudent.equals(student.get(n - 1))){
            System.out.println("You Failed");
        }

    }

}
