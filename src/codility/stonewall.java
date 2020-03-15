package codility;

// https://app.codility.com/demo/results/training9MWPKF-HXP/
import java.util.*;

class stonewall {
    public int solution(int[] H) {
        Stack <Integer> stack = new <Integer>Stack();
        int result=0;

        for (int i=0; i< H.length; i++) {

            while (!stack.isEmpty() && H[i] < stack.peek())
                stack.pop();


            if (stack.isEmpty()) {
                stack.push(H[i]);
                result+=1;
            }
            else
            if (H[i] > stack.peek()) {
                stack.push(H[i]);
                result+=1;
            }
        }

        return result;
    }
}

