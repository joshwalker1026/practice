package codility;
import java.math.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        double minValue=Integer.MAX_VALUE;
        double tmpValue=0;
        int minIndex=0;
        Thread s = new Thread();


        for (int i=0; i< A.length-1; i++) {
            tmpValue = (A[i]+A[i+1])/2d;

            if (tmpValue < minValue) {
                minValue = tmpValue;
                minIndex = i;
            }
        }

        for (int i=0; i< A.length-2; i++) {
            tmpValue = (A[i]+A[i+1]+A[i+2])/3d;

            if (tmpValue < minValue) {
                minValue = tmpValue;
                minIndex = i;
            }
        }

        return minIndex;
    }
}
