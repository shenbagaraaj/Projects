

public class ClimbingStairs{
    public int climbStairs(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
    
    for(int i =0; i<n;i++){
        c = a+b;
        a = b;
        b = c;
    }return b;
            
            
        }
    public static void main(String[]args){
        ClimbingStairs obj = new ClimbingStairs();
        int n = 4;
        int result = obj.climbStairs(n);

        System.out.println(result);
    }
    }

