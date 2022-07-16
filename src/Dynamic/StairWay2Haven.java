package Dynamic;

/**
 * Date 04/27/2020
 * @author Biswajit Mahato
 *
 * Problem Type : Dynamic Problem
 * Problem Statement : You want to reach haven that is at the top of the staircase.
 *                       The staircase has n steps. And at each step you can climb either 1 step or 2 steps further.
 *                       In how many ways you can reach haven ?
 *
 *
 */

public class StairWay2Haven {

        public static int stairwayToHeaven(int n){
            // Normal Recursion Method
           /* if(n<= -1){

                System.out.println(" Invalid Input !!!");
                return -1;
            }
            if(n==0 || n==1)
            {
                return 1;
            }
            else{

                return stairwayToHeaven(n-1)+stairwayToHeaven(n-2);
            }*/

            // Dynamic Approach ...
            // Initializing ways array
            int[] ways = new int[n + 1];

            ways[0] = 1;
            ways[1] = 1;

            for(int i = 2; i <= n; i++){

                ways[i] = ways[i - 1] + ways[i - 2];

            }
            return ways[n];

        }

        public static void main(String[] args) {

            int numberOfWays = stairwayToHeaven(20);

            System.out.println(" The Number of Ways to reach Haven:"+numberOfWays);
        }


}
