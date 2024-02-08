class Comparator{
    boolean comp(int a, int b){
        if (a == b){
            return true;
        }else{
            return false;
        }
    }

    boolean comp(String s1, String s2){
        if (s1.equals(s2)){
            return true;
        }else{
            return false;
        }
    }

    boolean comp(int[] n1, int[] n2){
        for(int i = 0; i<n1.length;i++){
            if(n1[i] == n2[i]){
                return true;
            }else{
                return false;
            }
        }return true;
    }

}

class Solution{
    public static void main(String []args){
        Comparator comp = new Comparator();
        String s1 = "hello world";
        String s2 = "hello world";
        int a = 3;
        int b = 4;
        int[] n1 = {1,2,3};
        int[] n2 = {1,2,4};

        System.out.println(comp.comp(n1, n2));
        System.out.println(comp.comp(s1, s2));
        System.out.println(comp.comp(a, b));

        
        

    }
}