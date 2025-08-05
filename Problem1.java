
/* 
 * Position: SDE 1
Location: Bengaluru, India.
YoE: 1 year 3 months.
Platform: Hackerrank

Problem:
This problem is a variant of closest pair sum. You'll be given two arrays
arr1 = { {1, 2000}, {2, 3000}, {3, 4000} }
arr2 = { { 1, 5000 }, {2, 3000} }
the first element of every pair represents id and the second value represents the value.
and a target x Find the pairs from both the arrays whose vaue add upto a sum which is less than given target and should be closest to the target.
= 5000

Output for the above example:
{ {1, 2} } // Note that the output should be in id's

I cleared all the test cases for the first problem (will share), but for this problem, I couldn't clear 3 test cases which were of handling duplicates!
In the online assesment this problem was sort of tagged as approximate solution, does anyone know what that means?
Awaiting for the result!
 */

import java.util.List;

public class Problem1 {

    int arr1[][] = { {1, 2000}, {2, 3000}, {3, 4000}, {4, 2000} };
    int arr2[][] = { { 1, 5000 }, {2, 3000} };

     List<int[]> re = getClosestPairs(arr1, arr2, 5000);

    public static void main(String[] args) {
        
    }
    public List<int[]> getClosestPairs(int[][] arr1, int[][] arr2, int target) {
        // Your implementation here
        // Find the pairs from both the arrays whose vaue add upto a sum which 
        // is less than given target and should be closest to the target.

        



        return null; // Placeholder return statement
    } 
}
