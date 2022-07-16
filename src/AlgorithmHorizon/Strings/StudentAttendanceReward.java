package AlgorithmHorizon.Strings;
/**
 * Date : 27/09/2021
 * @author : Biswajit Mahato
 *
 * Problem Type : String Problem
 * Problem link : https://algorithms.tutorialhorizon.com/student-attendance-reward/
 *
 */
public class StudentAttendanceReward {

    public static boolean checkRecord(String s){
        int absentCount = 0;
        Character prev = null;
        int lateCount = 0;

        System.out.println("Record :"+s);
        for (Character chr:s.toCharArray()) {
            if(chr == 'L' || chr == 'A'){
                if(prev != 'O'){
                    lateCount++;
                }
            }
            if(chr == 'A'){
                absentCount++;
            }
            prev = chr;
            if(lateCount>2 || absentCount>1){
                return  false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println("Attendance reward: " + checkRecord("OLLAOOOLLO"));
        System.out.println("Attendance reward: " + checkRecord("OLLOAOLLO"));
    }

}
