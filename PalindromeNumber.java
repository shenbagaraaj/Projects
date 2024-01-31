/*
 * Given an integer x, return true if x is a 
palindrome
, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 
 */

class PalindromeNumber{
    int sum = 0;
    public boolean solution(int x){
        int temp = x;
        int rem;

        if (x < 0)
           return false;
        
        while (temp > 0){
            rem = temp % 10;
            sum = (sum*10) + rem;
            temp = temp/10;
        }
        return sum == x ? true : false;

    }
    
    
    

    public static void main(String[]args){
        PalindromeNumber obj = new PalindromeNumber();
        int n = 121;
        boolean testcase1 = obj.solution(n);
        System.out.println("Palindrome Number: 121  testcase1:  " + testcase1);

        boolean testcase2 = obj.solution(-121);
        System.out.println("Palindrome number: -121 testcase 2: " + testcase2);

        boolean testcase3 = obj.solution(10);
        System.out.println("Palindrome number: 10   testcase3 : " + testcase3);
        
        
    }
}