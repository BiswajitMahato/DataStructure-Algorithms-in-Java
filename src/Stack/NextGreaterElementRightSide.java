package Stack;
/**
 * Date 09/04/2021
 * @author Biswajit Mahato
 *
 * Count Occurences of Anagrams
 *
 * Problem Statement : Given an array, print the Next Greater Element (NGE) for every element. The Next greater Element
 *                     for an element x is the first greater element on the right side of x in the array. Elements for
 *                     which no greater element exist, consider next greater element as -1.
 *
 * Link : https://www.geeksforgeeks.org/next-greater-element/
 * Example : [13, 7, 6, 12]
 * Output = Element GE
 *    13      -->    -1
 *    7       -->     12
 *    6       -->     12
 *    12      -->     -1
 * Explaination :
 *               
 */
public class NextGreaterElementRightSide {

    static void printNGE(int arr[], int n)
    {
        int next, i, j;
        for (i=0; i<n; i++)
        {
            next = -1;
            for (j = i+1; j<n; j++)
            {
                if (arr[i] < arr[j])
                {
                    next = arr[j];
                    break;
                }
            }
            System.out.println(arr[i]+" --> "+next);
        }
    }

    public static void main(String args[])
    {
        int arr[]= {11, 13, 21, 3};
        int n = arr.length;
        printNGE(arr, n);
    }

}
