/*
 * def LargeSmallSum(arr)

The function takes an integral arr which is of the size or length of its arguments. Return the sum of the second smallest element at odd position ‘arr’ and the second largest element at the even position.

Assumption

Every array element is unique.
Array is 0 indexed.
Note:

If the array is empty, return 0.
If array length is 3 or <3, return 0.

Example

Input:
Arr: 3 2 1 7 5 4

Output:
7


Explanation

The second largest element at the even position is 3.
The second smallest element at the odd position is 4.
The output is 7 (3 + 4).

 */

 

class Solution{
    int getSolution(int[] arr){
        int next = 2; int secondLargeEven = 0; int secondSmallOdd = 0; int odd = 1;
        for(int i = 0; i<arr.length;i= i+2){
            if(i%2 == 0){
                if(arr[next] > arr[i]){
                    secondLargeEven = arr[next];
                    next = next + 2;
                }
            }else{
                for(int a = 3; a<arr.length;a = a+2){
                    if(arr[a] > arr[odd]){
                        secondSmallOdd = arr[i];
                        odd = odd + 2;
                    }

                }

            }
            

        }
        return secondLargeEven + secondSmallOdd;
        }
        
    }



class Main{
    public static void main (String[]args){
        int[] arr = {3,2,1,7,5,4};
        Solution obj = new Solution();
        int answer = obj.getSolution(arr);
        System.out.println("Output : " + answer);

    }
}


