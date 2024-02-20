

public class Evenlydivides {
    static int getLastDigit(int N){
        int count = 0;
        int x = N;
        while(x>0){
            int last_digit = x%10;
            if(last_digit != 0 && N%last_digit == 0){
                count++;
            }
            x = x/10;
        }
        return count;
    }
    public static void main(String[]args){
        int N = 12;

        System.out.println(getLastDigit(N));
        System.out.println(2 % 10);

    }
    
}
