package map;

import java.util.HashMap;
import java.util.Map;

public class threeSum{

    static int[] a = {-3, -1, 0, 2, 4, 1, 3};
    static Map<Integer, int[]> m = new HashMap<Integer, int[]>();

    public static void main(String[] args) {
        for(int i=0; i< a.length;i++)
            for(int j=i+1; j< a.length; j++){
                m.put(-1*(a[i]+a[j]), new int[]{a[i], a[j]});

            }

        for(int i=0; i< a.length;i++){
            if(m.containsKey(a[i])){
                System.out.println(a[i]+" " + m.get(a[i])[0] + " "+ m.get(a[i])[1]);
            }
        }
    }
}