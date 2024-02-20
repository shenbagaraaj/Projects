
import java.util.Arrays;

class ThirdLargeElement{
    /**
     * @param a
     * @param k
     * @return
     */
    int getThirdLargeElement(int[] a, int k){
        int n = k;

        Arrays.sort(a);
        
        if(k < 3){
            return -1;
        } 

        for(int i = 0; i<n;i++){
            for(int j = 0; j<n;j++){
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[2];
    }

        

        

        

    
    public static void main (String[]args){
        int[] a = {2,4,1,3,5};
        int k = a.length;

        ThirdLargeElement obj = new ThirdLargeElement();
        int res = obj.getThirdLargeElement(a, k);
        System.out.println(res);
    }
}