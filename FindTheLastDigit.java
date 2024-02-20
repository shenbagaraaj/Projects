

class solution{

    static double getLastDigit(String a, String b){
        Double n1 = Double.parseDouble(a);
        Double n2 = Double.parseDouble(b);

        Double result = Math.pow(n1, n2);
        
    

    
        return result%10;
    }
    public static void main (String[]args){
        String a = "3";
        String b = "10";

        double sol = getLastDigit(a, b);

        System.out.println(sol);



    }
}