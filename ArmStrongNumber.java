


public class ArmStrongNumber {
    int armstrongNumber(int n){
        int sum = 0; int x = n;
        while(x>0){
            int digit = x%10;
            sum = sum + (digit * digit * digit);
            x =x/10;
        }
        return sum;
    }
    public static void main(String[]args){
        ArmStrongNumber obj = new ArmStrongNumber();
        int n = 153;
        System.out.println(obj.armstrongNumber(n));

    }
    }
    

