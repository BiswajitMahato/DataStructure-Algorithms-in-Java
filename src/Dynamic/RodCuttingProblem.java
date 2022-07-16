package Dynamic;
/**
 * Date 04/27/2020
 * @author Biswajit Mahato
 *
 * Problem Type : Dynamic Problem
 * Problem Statement : You are given a rod of lenght 'n' inches and an array of prices.
 *                     This array contains prices of smaller pieces of that rod when sold.
 *                     Find the maximum value that could be earned by cutting up the rod and selling the pieces.
 *
 *
 */
public class RodCuttingProblem {

    private int rodCutter(int[] cost, int n){

        // Initializing rod array

        int[] rod = new int[n + 1];

        rod[0] = 0;

        // Loop for each rod length 'i'

        for(int i = 1; i <= n; i++){

            int maxValue = Integer.MIN_VALUE;

            // Loop for smaller cut lengths 'j'

            for(int j = 1; j <= i; j++){

                // Updating maxValue

                maxValue = Math.max(maxValue, cost[j] + rod[i - j]);

            }

            rod[i] = maxValue;

        }

        return rod[n];
    }



    public static void main(String[] args) {

        RodCuttingProblem rc = new RodCuttingProblem();


        int[] cost = {0, 2, 4, 7, 8};

        int size = 4;
        // n is always 1 less than cost array length because 0th element is cost[0]

        System.out.println("Maximum value that can be earned by cutting up the rod and selling the pieces of the cost array {0, 2, 4, 7, 8} is: " + rc.rodCutter(cost, size));

    }

}
