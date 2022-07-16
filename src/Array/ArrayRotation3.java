package Array;
/**
 * Date 09/10/2020
 * @author : Biswajit Mahato
 *
 * Problem Link -> https://www.geeksforgeeks.org/array-rotation/
 * Problem Number :
 *
 */
public class ArrayRotation3 {

    void leftRotate(int arr[], int d, int n)
    {
        /* To handle if d >= n */
        d = d % n;
        int i, j, k, temp;
        int g_c_d = gcd(d, n);
        for (i = 0; i < g_c_d; i++) {
            /* move i-th values of blocks */
            temp = arr[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }

    void printArray(int arr[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }

    /*Fuction to get gcd of a and b*/
    int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    // Driver program to test above functions
    public static void main(String[] args)
    {
        ArrayRotation3 rotate = new ArrayRotation3();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        rotate.leftRotate(arr, 2, 7);
        rotate.printArray(arr, 7);
    }
}
