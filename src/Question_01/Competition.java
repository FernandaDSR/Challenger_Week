package Question_01;

import java.util.*;

public class Competition {
    public static List<Students> Students;

    static class Students implements Comparable<Students> {

        String name;
        int problemSolved;

        public Students(String name, int problemSolved) {
            this.name = name;
            this.problemSolved = problemSolved;
        }

        public int compareTo(Students otherStudent) {
            if (this.problemSolved != otherStudent.problemSolved) {
                return Integer.compare(otherStudent.problemSolved, this.problemSolved);
            }
            return this.name.compareTo(otherStudent.name);
        }


    }
}
