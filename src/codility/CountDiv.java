package codility;

public class CountDiv {

    class Solution {
        public int solution(int A, int B, int K) {
            int first = 0;
            int last  = 0;
            int result =0;

            if (K==0)
                return 0;

            if (A==0 && B==0)
                return 1;

            if (K>B)
                return 0;

            if (A==B) {
                if (A%K==0)
                    return 1;
                else
                    return 0;

            }


            for (int i=A; i<=B; i++ ) {
                if (i%K==0) {
                    first =i;
                    break;
                }
            }


            for (int i=B; i>=A; i-- ) {
                if (i%K==0) {
                    last =i;
                    break;
                }
            }

            result = (last-first)/K +1;

            return result;

        }
    }







}
