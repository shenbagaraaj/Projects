/*
 * The absolute difference is the positive difference between two values a and b, is written ab or bal and they are equal. If a = 3 and b = 2, 3-2 elements in the array. 2-3 = 1. Given an array of integers, find the minimum absolute difference between any two
Example. arr = [-2, 2, 4]
There are 3 pairs of numbers: [-2, 2], [2,4] and [2, 4]. The absolute differences for these pairs are |(-2) - 2 = 4, (-2)-46 and 242. The minimum absolute difference is 2.
Function Description
Complete the minimumAbsolute Difference function in the editor below. It should return an integer that represents the minimum absolute difference between any pair of elements.
minimumAbsolute Difference has the following parameter(s):
• int arr[n]: an array of integers
Returns
• int: the minimum absolute difference found
Input Format
The first line contains a single integer n, the size of arr.
The second line contains n space-separated integers, arr[i].
Constraints
• 2 ≤ n ≤ 105
• -10° < arr[i] < 10°

Sample Input 0
3
3-7 0
Sample Output 0
3
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumAbsoluteDifference {

    public static int minimumAbsoluteDifference(List<Integer> arr){

        int maximum = 2147483647; // Maximum value in int 
        Collections.sort(arr);

        for(int i = 0; i< arr.size()-1;i++){
            int ab = Math.abs(arr.get(i) - arr.get(i+1));
            if (ab < maximum){
                maximum = ab;
            }
            
        }return maximum;
    }

    public static void main (String[]args){
        List<Integer> arr = new ArrayList<Integer>();
        arr.addAll(Arrays.asList(-59,-36,-13,1,-53,-92,-2,-96,-54,75));

        int result = minimumAbsoluteDifference(arr);
        System.out.println(result);
    }
    
}
