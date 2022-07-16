package TechieDelight.Strings;

import java.util.HashSet;
import java.util.Set;

/**
 * Date 10/08/2021
 * @author Biswajit Mahato
 *
 * Problem Type : String
 * Problem Statement : Find number of customers who could not get any computer
 * Link : https://www.techiedelight.com/find-number-of-customers-who-could-not-get-any-computer/
 *
 *
 */
public class CustomerComputerAllocation {
    // Given entry/exit logs of customers and a cyber cafe's capacity,
    // find the total number of customers who could not get any computer
    public static int process(String sequence, int capacity)
    {
        // base case
        if (sequence == null || sequence.length() == 0) {
            return 0;
        }

        // to store the count of unattended customers
        int unattended = 0;

        // keep track of the customers who were allocated computers
        Set<Character> allocated = new HashSet<>();

        // keep track of customers who are currently inside the cyber cafe
        // (irrespective of whether they are attended or not)
        Set<Character> visited = new HashSet<>();

        // traverse the given sequence
        for (char c: sequence.toCharArray())
        {
            // If a customer arrives at the cyber cafe
            if (!visited.contains(c))
            {
                // mark customer as visited
                visited.add(c);

                // if a computer is available, allocate it to the customer
                if (allocated.size() < capacity) {
                    allocated.add(c);
                }
                // if no computer is available, increment the unattended
                // customer's count
                else {
                    unattended++;
                }
            }
            // if a customer is leaving the cyber cafe, mark the customer as
            // unvisited and deallocate the computer
            else {
                visited.remove(c);
                allocated.remove(c);
            }
        }

        return unattended;
    }

    public static void main(String[] args)
    {
        String sequence = "ABCDDCEFFEBGAG";
        int capacity = 3;

        System.out.println(process(sequence, capacity));
    }
}
